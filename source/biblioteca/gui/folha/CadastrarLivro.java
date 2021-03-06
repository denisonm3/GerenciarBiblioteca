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
 * CadastrarLivro.java
 *
 * Created on 18/07/2012
 */
package biblioteca.gui.folha;

import static biblioteca.Biblioteca.WORDS;
import biblioteca.db.ControleBanco;
import biblioteca.gui.JFramePrincipal;
import java.awt.Graphics;
import java.sql.SQLException;

/**
 * Interface para adição de livro no banco de dados
 * @author Denison
 */
public class CadastrarLivro extends javax.swing.JPanel {
    
    private ControleBanco banco;
    
    /** Creates new form Inicio */
    public CadastrarLivro() {
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
        jLabelEditora = new javax.swing.JLabel();
        jTextFieldEditora = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jLabelErro = new biblioteca.gui.JErroLabel();

        setMaximumSize(new java.awt.Dimension(351, 535));
        setMinimumSize(new java.awt.Dimension(351, 535));
        setPreferredSize(new java.awt.Dimension(351, 535));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText(WORDS.getString("CADASTRAR-LIVRO")); // NOI18N

        jLabelCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCodigo.setText(WORDS.getString("CODIGO")); // NOI18N

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNome.setText(WORDS.getString("NOME")); // NOI18N

        jTextFieldCod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButtonAddUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/gui/imagens/icon_livro.png"))); // NOI18N
        jButtonAddUsuario.setText(WORDS.getString("ADICIONAR-LIVRO")); // NOI18N
        jButtonAddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUsuarioActionPerformed(evt);
            }
        });

        jLabelEditora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelEditora.setText(WORDS.getString("EDITORA")); // NOI18N

        jLabelEstado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelEstado.setText(WORDS.getString("ESTADO")); // NOI18N

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Novo", "Bem conservado", "Pouco desgastados", "Perdido", "Danificado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelErro)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEstado, 0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEditora))
                    .addComponent(jButtonAddUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
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
                    .addComponent(jLabelEditora)
                    .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErro, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUsuarioActionPerformed
        // TODO add your handling code here:
        if(jTextFieldCod.getText() == null || jTextFieldCod.getText().equals("")){
            jLabelErro.setErrorText(WORDS.getString("ERRO-CODIGO"));
        }else if(jTextFieldNome.getText() == null || jTextFieldNome.getText().equals("")){
            jLabelErro.setErrorText(WORDS.getString("ERRO-NOME"));
        }else if(jTextFieldCod.getText().contains("-")){
            jLabelErro.setErrorText(WORDS.getString("ERRO-POSITIVO"));
        }else{
            try {
                if(jTextFieldEditora.getText().equals(""))
                    banco.addLivro(jTextFieldCod.getText(), jTextFieldNome.getText(), null, jComboBoxEstado.getSelectedIndex() + 1);
                else
                    banco.addLivro(jTextFieldCod.getText(), jTextFieldNome.getText(), jTextFieldEditora.getText(), jComboBoxEstado.getSelectedIndex() + 1);
                jLabelErro.setSuccessText(WORDS.getString("LIVRO ")+jTextFieldNome.getText()+WORDS.getString("MSG-ADICIONADO"));
            } catch (SQLException ex) {
                jLabelErro.setErrorText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonAddUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUsuario;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEditora;
    private biblioteca.gui.JErroLabel jLabelErro;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JFormattedTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
