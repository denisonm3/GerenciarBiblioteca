/*
 * Copyright 2014 Denison.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package biblioteca.db;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.AccountException;
import javax.swing.JOptionPane;
import org.apache.derby.jdbc.EmbeddedDriver;

/**
 * Realiza conexão e controle do banco de dados
 * @author Denison
 */
public class ControleBanco {

    private Connection connect;

    public ControleBanco() {
        try {
            EmbeddedDriver drive = new EmbeddedDriver();
            File tmp = new File(ControleBanco.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            if (!tmp.getName().endsWith(".jar")) {
                connect = DriverManager.getConnection("jdbc:derby:bibliotecadb", "dbuser", "dbpassword");
            } else {
                //Busca diretório do arquivo Jar
                String bibliotecadb = tmp.getParent() + "/bibliotecadb";
                connect = DriverManager.getConnection("jdbc:derby:" + bibliotecadb, "dbuser", "dbpassword");
            }
            /*Statement sta = connect.createStatement();
             int count = sta.executeUpdate(
             "CREATE TABLE APP.EMPRESTIMO ("
             + " ID INT NOT NULL GENERATED ALWAYS AS IDENTITY,"
             + " USUARIO INT NOT NULL,"
             + " LIVRO INT NOT NULL,"
             + " ENTRADA DATE,"
             + " ESTADO INT,"
             + " SAIDA DATE, PRIMARY KEY (ID))");
             sta.close();*/
            
            //Statement sta = connect.createStatement();
            //sta.executeUpdate("DELETE FROM APP.EMPRESTIMO");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addLivro(String codigo, String nome, String editora, Integer estado) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            if (editora != null) {
                sta.executeUpdate("INSERT INTO APP.LIVRO "
                        + "(CODIGO, NOME, EDITORA, ESTADO) "
                        + "VALUES (" + codigo + ",'" + nome + "','" + editora + "'," + estado + ")");
            } else {
                sta.executeUpdate("INSERT INTO APP.LIVRO "
                        + "(CODIGO, NOME, ESTADO)"
                        + "VALUES (" + codigo + ",'" + nome + "'," + estado + ")");
            }
        }
    }

    public void addUsuario(String codigo, String nome, char[] senha) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            String pas = new String(senha);
            sta.executeUpdate("INSERT INTO APP.USUARIO "
                    + "(CODIGO, NOME, SENHA) "
                    + "VALUES (" + codigo + ",'" + nome + "','" + pas + "')");
        }
    }

    public void fechar() {
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object[][] getUsuario(String str) throws SQLException {
        Object[][] obj;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet res = sta.executeQuery("select * from APP.USUARIO WHERE (NOME LIKE '%" + str + "%')")) {
            obj = getSelectUsuario(res);
        }
        return obj;
    }

    public Object[][] getUsuario(Integer integer) throws SQLException {
        Object[][] obj;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet res = sta.executeQuery("SELECT CODIGO, NOME, SENHA from APP.USUARIO WHERE (CODIGO = " + integer + ")")) {
            obj = getSelectUsuario(res);
        }
        return obj;
    }

    private Object[][] getSelectUsuario(ResultSet res) throws SQLException {
        res.last();
        int rowcount = res.getRow();
        res.beforeFirst();
        Object[][] obj = new Object[rowcount][3];
        int i = 0;
        while (res.next()) {
            obj[i][0] = res.getInt("CODIGO");
            obj[i][1] = res.getString("NOME");
            obj[i][2] = res.getString("SENHA");
            i++;
        }
        return obj;
    }

    public Object[][] getLivro(String text) throws SQLException {
        Object[][] obj;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet res = sta.executeQuery("select * from APP.LIVRO WHERE (NOME LIKE '%" + text + "%')")) {
            obj = getSelectLivro(res);
        }
        return obj;
    }

    public Object[][] getLivro(Integer integer) throws SQLException {
        Object[][] obj;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
                ResultSet res = sta.executeQuery("select * from APP.LIVRO WHERE (CODIGO = " + integer + ")")) {
            obj = getSelectLivro(res);
        }
        return obj;
    }

    private Object[][] getSelectLivro(ResultSet res) throws SQLException {
        res.last();
        int rowcount = res.getRow();
        res.beforeFirst();
        Object[][] obj = new Object[rowcount][4];
        int i = 0;
        while (res.next()) {
            obj[i][0] = res.getInt("CODIGO");
            obj[i][1] = res.getString("NOME");
            obj[i][2] = res.getString("EDITORA");
            obj[i][3] = res.getInt("ESTADO");
            i++;
        }
        return obj;
    }

    public void removeLivro(Integer codigo) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            sta.executeUpdate("DELETE FROM APP.LIVRO WHERE (CODIGO = " + codigo + ")");
        }
    }

    public void removeUsuario(Integer codigo) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            sta.executeUpdate("DELETE FROM APP.USUARIO WHERE (CODIGO = " + codigo + ")");
        }
    }

    public void setLivro(Integer codigo, String nome, String editora, Integer estado) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            sta.executeUpdate("UPDATE APP.LIVRO "
                    + "SET NOME = '" + nome + "', "
                    + "EDITORA = '" + editora + "', "
                    + "ESTADO = " + estado
                    + "WHERE (CODIGO = " + codigo + ")");
        }
    }

    public void setUsuario(Integer codigo, String nome, char[] senha) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            String pas = new String(senha);
            sta.executeUpdate("UPDATE APP.USUARIO "
                    + "SET NOME = '" + nome + "', "
                    + "SENHA = '" + pas + "' "
                    + "WHERE (CODIGO = " + codigo + ")");
        }
    }

    public String validarUsuario(Integer codigo, char[] password) throws SQLException, Exception {
        String userName;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            String pas = new String(password);
            try (ResultSet res = sta.executeQuery("SELECT NOME FROM APP.USUARIO WHERE (CODIGO = " + codigo + " AND SENHA = '" + pas + "')")) {
                res.last();
                userName = null;
                if (res.getRow() == 1) {
                    userName = res.getString("NOME");
                }
            }
        }
        if (userName != null) {
            return userName;
        } else {
            throw new AccountException("Usuário ou senha inválido!");
        }
    }

    public void validarLivro(Integer livroCod) throws SQLException, Exception {
        int numeroLivro;
        int numeroEmprestimo;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet livro = sta.executeQuery("select CODIGO from APP.LIVRO WHERE (CODIGO = " + livroCod + ")")) {
            livro.last();
            numeroLivro = livro.getRow();
        }
        if (numeroLivro == 0) {
            throw new AccountException("Livro não encontrado!");
        }
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet emprestimo = sta.executeQuery("SELECT ID FROM APP.EMPRESTIMO WHERE (LIVRO = " + livroCod + " AND ESTADO != 2)")) {
            emprestimo.last();
            numeroEmprestimo = emprestimo.getRow();
        }
        System.out.println(numeroLivro+" - "+numeroEmprestimo);
        if (numeroEmprestimo != 0) {
            throw new AccountException("Livro indisponível!");
        }
    }

    public void setUsuario(Integer codigo, String nome) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            sta.executeUpdate("UPDATE APP.USUARIO "
                    + "SET NOME = '" + nome + "' "
                    + "WHERE (CODIGO = " + codigo + ")");
        }
    }

    public Object[][] getEmprestimoAberto(int userCod) throws SQLException {
        Object[][] obj;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet res = sta.executeQuery("SELECT * FROM APP.EMPRESTIMO WHERE (USUARIO = " + userCod + " AND ESTADO != 2)")) {
            res.last();
            int rowcount = res.getRow();
            res.beforeFirst();
            obj = new Object[rowcount][4];
            int i = 0;
            while (res.next()) {
                obj[i][0] = res.getInt("ID");
                obj[i][1] = res.getInt("LIVRO");
                obj[i][2] = res.getString("ENTRADA");
                obj[i][3] = res.getInt("ESTADO");
                i++;
            }
        }
        return obj;
    }

    public void addEmprestimo(Integer userCod, Integer livroCod, Date date) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            sta.executeUpdate("INSERT INTO APP.EMPRESTIMO "
                    + "(USUARIO, LIVRO, ENTRADA, ESTADO) "
                    + "VALUES (" + userCod + "," + livroCod + ",'" + date + "',0)");
        }
    }

    public void setEmprestimoDevolver(Integer codigo, int estado, Date date) throws SQLException {
        try (Statement sta = connect.createStatement()) {
            sta.executeUpdate("UPDATE APP.EMPRESTIMO "
                    + "SET SAIDA = '" + date + "', "
                    + "ESTADO = " + estado + " "
                    + "WHERE (ID = " + codigo + ")");
        }
    }

    public Object[][] getEmprestimo(Integer userCod) throws SQLException {
        Object[][] obj;
        try (Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
                ResultSet res = sta.executeQuery("SELECT * FROM APP.EMPRESTIMO WHERE (USUARIO = " + userCod + ")")) {
            res.last();
            int rowcount = res.getRow();
            res.beforeFirst();
            obj = new Object[rowcount][4];
            int i = 0;
            while (res.next()) {
                obj[i][0] = res.getInt("LIVRO");
                obj[i][1] = res.getString("ENTRADA");
                obj[i][2] = res.getString("SAIDA");
                obj[i][3] = res.getInt("ESTADO");
                i++;
            }
        }
        return obj;
    }
}
