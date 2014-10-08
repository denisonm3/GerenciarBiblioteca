/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author denison_usuario
 */
public class ControleBanco {

    private Connection connect;

    public ControleBanco() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //connect = DriverManager.getConnection("jdbc:derby://localhost:1527/bibliotecadb", "dbuser", "dbpassword");
            //connect = DriverManager.getConnection("jdbc:derby:bibliotecadb", "dbuser", "dbpassword");
            File tmp = new File(ControleBanco.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            if (!tmp.getName().endsWith(".jar")) {
                connect = DriverManager.getConnection("jdbc:derby:bibliotecadb", "dbuser", "dbpassword");
            } else {
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addLivro(String codigo, String nome, String editora, Integer estado) throws SQLException {
        Statement sta = connect.createStatement();
        if (editora != null) {
            sta.executeUpdate("INSERT INTO APP.LIVRO "
                    + "(CODIGO, NOME, EDITORA, ESTADO) "
                    + "VALUES (" + codigo + ",'" + nome + "','" + editora + "'," + estado + ")");
        } else {
            sta.executeUpdate("INSERT INTO APP.LIVRO "
                    + "(CODIGO, NOME, ESTADO)"
                    + "VALUES (" + codigo + ",'" + nome + "'," + estado + ")");
        }
        sta.close();
    }

    public void addUsuario(String codigo, String nome, char[] senha) throws SQLException {
        Statement sta = connect.createStatement();
        String pas = new String(senha);
        sta.executeUpdate("INSERT INTO APP.USUARIO "
                + "(CODIGO, NOME, SENHA) "
                + "VALUES (" + codigo + ",'" + nome + "','" + pas + "')");
        sta.close();
    }

    public void fechar() {
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object[][] getUsuario(String str) throws SQLException {
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res = sta.executeQuery("select * from APP.USUARIO WHERE (NOME LIKE '%" + str + "%')");
        Object[][] obj = getSelectUsuario(res);
        res.close();
        sta.close();
        return obj;
    }

    public Object[][] getUsuario(Integer integer) throws SQLException {
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res = sta.executeQuery("SELECT CODIGO, NOME, SENHA from APP.USUARIO WHERE (CODIGO = " + integer + ")");
        Object[][] obj = getSelectUsuario(res);
        res.close();
        sta.close();
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
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res = sta.executeQuery("select * from APP.LIVRO WHERE (NOME LIKE '%" + text + "%')");
        Object[][] obj = getSelectLivro(res);
        res.close();
        sta.close();
        return obj;
    }

    public Object[][] getLivro(Integer integer) throws SQLException {
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res = sta.executeQuery("select * from APP.LIVRO WHERE (CODIGO = " + integer + ")");
        Object[][] obj = getSelectLivro(res);
        res.close();
        sta.close();
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
        Statement sta = connect.createStatement();
        sta.executeUpdate("DELETE FROM APP.LIVRO WHERE (CODIGO = " + codigo + ")");
        sta.close();
    }

    public void removeUsuario(Integer codigo) throws SQLException {
        Statement sta = connect.createStatement();
        sta.executeUpdate("DELETE FROM APP.USUARIO WHERE (CODIGO = " + codigo + ")");
        sta.close();
    }

    public void setLivro(Integer codigo, String nome, String editora, Integer estado) throws SQLException {
        Statement sta = connect.createStatement();
        sta.executeUpdate("UPDATE APP.LIVRO "
                + "SET NOME = '" + nome + "', "
                + "EDITORA = '" + editora + "', "
                + "ESTADO = " + estado
                + "WHERE (CODIGO = " + codigo + ")");
        sta.close();
    }

    public void setUsuario(Integer codigo, String nome, char[] senha) throws SQLException {
        Statement sta = connect.createStatement();
        String pas = new String(senha);
        sta.executeUpdate("UPDATE APP.USUARIO "
                + "SET NOME = '" + nome + "', "
                + "SENHA = '" + pas + "' "
                + "WHERE (CODIGO = " + codigo + ")");
        sta.close();
    }

    public String validarUsuario(Integer codigo, char[] password) throws SQLException, Exception {
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String pas = new String(password);
        ResultSet res = sta.executeQuery("SELECT NOME FROM APP.USUARIO WHERE (CODIGO = " + codigo + " AND SENHA = '"+pas+"')");
        res.last();
        String userName = null;
        if(res.getRow() == 1) {
            userName = res.getString("NOME");
        }
        res.close();
        sta.close();
        if(userName != null) {
            return userName;
        } else {
            throw new AccountException("Usuário ou senha inválido!");
        }
    }

    public void validarLivro(Integer livroCod) throws SQLException, Exception {
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res = sta.executeQuery("select CODIGO from APP.LIVRO WHERE (CODIGO = " + livroCod + ")");
        res.last();
        int rowcount = res.getRow();
        res.close();
        if(rowcount == 0) {
            throw new AccountException("Livro não encontrado!");
        }
        res = sta.executeQuery("SELECT USUARIO FROM APP.EMPRESTIMO WHERE (LIVRO = " + livroCod + " AND ESTADO != 2)");
        res.last();
        rowcount = res.getRow();
        res.close();
        sta.close();
        if(rowcount != 0) {
            throw new AccountException("Livro indisponível!");
        }
    }

    public void setUsuario(Integer codigo, String nome) throws SQLException {
        Statement sta = connect.createStatement();
        sta.executeUpdate("UPDATE APP.USUARIO "
                + "SET NOME = '" + nome + "' "
                + "WHERE (CODIGO = " + codigo + ")");
        sta.close();
    }

    public Object[][] getEmprestimoAberto(int userCod) throws SQLException {
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res = sta.executeQuery("SELECT * FROM APP.EMPRESTIMO WHERE (USUARIO = " + userCod + " AND ESTADO != 2)");
        res.last();
        int rowcount = res.getRow();
        res.beforeFirst();
        Object[][] obj = new Object[rowcount][4];
        int i = 0;
        while (res.next()) {
            obj[i][0] = res.getInt("ID");
            obj[i][1] = res.getInt("LIVRO");
            obj[i][2] = res.getString("ENTRADA");
            obj[i][3] = res.getInt("ESTADO");
            i++;
        }
        res.close();
        sta.close();
        return obj;
    }

    public void addEmprestimo(Integer userCod, Integer livroCod, Date date) throws SQLException {
        Statement sta = connect.createStatement();
        sta.executeUpdate("INSERT INTO APP.EMPRESTIMO "
                + "(USUARIO, LIVRO, ENTRADA, ESTADO) "
                + "VALUES (" + userCod + "," + livroCod + ",'" + date + "',0)");
        sta.close();
    }

    public void setEmprestimoDevolver(Integer codigo, int estado, Date date) throws SQLException {
        Statement sta = connect.createStatement();
        sta.executeUpdate("UPDATE APP.EMPRESTIMO "
                + "SET SAIDA = '" + date + "', "
                + "ESTADO = " + estado + " "
                + "WHERE (ID = " + codigo + ")");
        sta.close();
    }

    public Object[][] getEmprestimo(Integer userCod) throws SQLException {
        Statement sta = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res = sta.executeQuery("SELECT * FROM APP.EMPRESTIMO WHERE (USUARIO = " + userCod + ")");
        res.last();
        int rowcount = res.getRow();
        res.beforeFirst();
        Object[][] obj = new Object[rowcount][4];
        int i = 0;
        while (res.next()) {
            obj[i][0] = res.getInt("LIVRO");
            obj[i][1] = res.getString("ENTRADA");
            obj[i][2] = res.getString("SAIDA");
            obj[i][3] = res.getInt("ESTADO");
            i++;
        }
        res.close();
        sta.close();
        return obj;
    }
}
