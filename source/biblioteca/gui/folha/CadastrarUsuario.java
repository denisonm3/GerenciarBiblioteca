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
 *
 * ============================================================================
 * CadastrarUsuario.java
 *
 * Created on 18/07/2012, 17:12:38
 */
package biblioteca.gui.folha;

import biblioteca.db.ControleBanco;
import biblioteca.gui.JFramePrincipal;
import java.awt.Graphics;
import java.sql.SQLException;

/**
 * Interface para adição de usuário no banco de dados
 * @author Denison
 */
public class CadastrarUsuario extends javax.swing.JPanel {
    
    private ControleBanco banco;
    
    /** Creates new form Inicio */
    public CadastrarUsuario() {
        initComponents();
    }

    public void setBanco(ControleBanco banco) {
        this.banco = banco;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(JFramePrincipal.FOLHA_DIREITA, 0, 0, this);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonAddUsuario = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JPasswordField();
        jLabelErro = new biblioteca.gui.JErroLabel();

        setMaximumSize(new java.awt.Dimension(351, 535));
        setMinimumSize(new java.awt.Dimension(351, 535));
        setPreferredSize(new java.awt.Dimension(351, 535));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastrar Usuário");

        jLabelCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCodigo.setText("Código:");

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldCod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButtonAddUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/gui/imagens/novo_usuario.png"))); // NOI18N
        jButtonAddUsuario.setText("Adicionar Usuário");
        jButtonAddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUsuarioActionPerformed(evt);
            }
        });

        jLabelSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAddUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelErro))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelTitulo)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jButtonAddUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErro, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(143, 143, 143))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUsuarioActionPerformed
        // TODO add your handling code here:
        if(jTextFieldCod.getText() == null || jTextFieldCod.getText().equals("")){
            jLabelErro.setErrorText("O Código deve ser infomado!");
        }else if(jTextFieldNome.getText() == null || jTextFieldNome.getText().equals("")){
            jLabelErro.setErrorText("O Nome deve ser infomado!");
        }else if(jTextFieldCod.getText().contains("-")){
            jLabelErro.setErrorText("O Código deve ser positivo!");
        }else if(jTextFieldSenha.getPassword().length < 4){
            jLabelErro.setErrorText("Senha deve ter 4 ou mais caractes!");
        }else{
            try {
                banco.addUsuario(jTextFieldCod.getText(), jTextFieldNome.getText(), jTextFieldSenha.getPassword());
                jLabelErro.setSuccessText("Usuario "+jTextFieldNome.getText()+" adicionado com sucesso!");
            } catch (SQLException ex) {
                jLabelErro.setErrorText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonAddUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUsuario;
    private javax.swing.JLabel jLabelCodigo;
    private biblioteca.gui.JErroLabel jLabelErro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JFormattedTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JPasswordField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
