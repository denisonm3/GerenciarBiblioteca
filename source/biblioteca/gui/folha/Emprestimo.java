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
package biblioteca.gui.folha;

import biblioteca.db.ControleBanco;
import biblioteca.gui.JFramePrincipal;
import java.awt.Graphics;
import java.sql.Date;

/**
 * Interface gráfica para realizar emprestimo de um livro
 * @author Denison
 */
public class Emprestimo extends javax.swing.JPanel {

    private ControleBanco banco;
    private String userName;
    private Integer userCod;
    private Integer livroCod;
    /**
     * Creates new form Emprestimo
     */
    public Emprestimo() {
        initComponents();
        inserirUsuario();
    }
    
    public void setBanco(ControleBanco banco) {
        this.banco = banco;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(JFramePrincipal.FOLHA_DIREITA, 0, 0, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JPasswordField();
        jLabelSenha = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jLabelCodLivro = new javax.swing.JLabel();
        jTextFieldCodLivro = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonEmprestar = new javax.swing.JButton();
        jLabelUserName = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelErro = new biblioteca.gui.JErroLabel();

        setMaximumSize(new java.awt.Dimension(351, 535));
        setMinimumSize(new java.awt.Dimension(351, 535));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Emprestimo");

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNome.setText("Código:");

        jLabelSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");

        jButtonValidar.setText("Validar Usuário");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jLabelCodLivro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCodLivro.setText("Código do Livro");

        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUsuario.setText("Usuário");

        jButtonEmprestar.setText("Realizar Emprestimo");
        jButtonEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelErro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEmprestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodLivro, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelTitulo)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValidar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEmprestar)
                .addGap(8, 8, 8)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        if(jTextFieldNome.getText() == null || jTextFieldNome.getText().equals("")){
            jLabelErro.setErrorText("O Nome deve ser infomado!");
        }else if(jTextFieldSenha.getPassword().length < 4){
            jLabelErro.setErrorText("Senha deve ter 4 ou mais caractes!");
        }else{
            try {
                userCod = Integer.valueOf(jTextFieldNome.getText());
                userName = banco.validarUsuario(userCod, jTextFieldSenha.getPassword());
                int abertos = banco.getEmprestimoAberto(userCod).length;
                if(abertos > 0) {
                    jLabelErro.setWarningText("Usuário está com "+abertos+" livros.");
                } else {
                    jLabelErro.setText("");
                }
                inserirLivro();
            } catch (Exception ex) {
                jLabelErro.setErrorText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        inserirUsuario();
        jLabelErro.setText("");
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestarActionPerformed
        if(jTextFieldCodLivro.getText() == null || jTextFieldCodLivro.getText().equals("")){
            jLabelErro.setErrorText("O Código deve ser infomado!");
        }else{
            try {
                livroCod = Integer.valueOf(jTextFieldCodLivro.getText());
                banco.validarLivro(livroCod);
                banco.addEmprestimo(userCod,livroCod,new Date(System.currentTimeMillis()));
                jLabelErro.setSuccessText("Emprestimo realizado com sucesso!");
            } catch (Exception ex) {
                jLabelErro.setErrorText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonEmprestarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmprestar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelCodLivro;
    private biblioteca.gui.JErroLabel jLabelErro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldCodLivro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JPasswordField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables

    private void inserirLivro() {
        jButtonValidar.setVisible(false);
        jLabelNome.setVisible(false);
        jLabelSenha.setVisible(false);
        jTextFieldNome.setVisible(false);
        jTextFieldSenha.setVisible(false);
        //
        jLabelUsuario.setVisible(true);
        jLabelUserName.setText(userName);
        jLabelUserName.setVisible(true);
        jLabelCodLivro.setVisible(true);
        jTextFieldCodLivro.setVisible(true);
        jButtonEmprestar.setVisible(true);
        jButtonVoltar.setVisible(true);
    }

    private void inserirUsuario() {
        jButtonValidar.setVisible(true);
        jLabelNome.setVisible(true);
        jLabelSenha.setVisible(true);
        jTextFieldNome.setVisible(true);
        jTextFieldSenha.setVisible(true);
        //
        jLabelUsuario.setVisible(false);
        jLabelUserName.setVisible(false);
        jLabelCodLivro.setVisible(false);
        jTextFieldCodLivro.setVisible(false);
        jButtonEmprestar.setVisible(false);
        jButtonVoltar.setVisible(false);
    }
}
