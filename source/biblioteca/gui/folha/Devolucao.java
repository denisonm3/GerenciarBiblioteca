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
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * Interface gráfica para finalizar emprestimo de livro
 * @author Denison
 */
public class Devolucao extends javax.swing.JPanel {

    private ControleBanco banco;
    private String userName;

    /**
     * Creates new form Devolucao
     */
    public Devolucao() {
        initComponents();
        inserirUsuario(true);
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
        jButtonValidar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JPasswordField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonPendente = new javax.swing.JButton();
        jButtonDevolver = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelErro = new biblioteca.gui.JErroLabel();

        setMaximumSize(new java.awt.Dimension(351, 535));
        setMinimumSize(new java.awt.Dimension(351, 535));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Devolução");

        jButtonValidar.setText("Validar Usuário");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 253, 238));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(250, 40));

        jTable1.setBackground(new java.awt.Color(255, 253, 238));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Livro", "Data", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setMaximumSize(new java.awt.Dimension(100, 64));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jLabelSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNome.setText("Código:");

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonPendente.setText("Pendente");
        jButtonPendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPendenteActionPerformed(evt);
            }
        });

        jButtonDevolver.setText("Devolver");
        jButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverActionPerformed(evt);
            }
        });

        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUsuario.setText("Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonValidar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPendente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelErro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelTitulo)
                .addGap(60, 60, 60)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPendente)
                    .addComponent(jButtonDevolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        if (jTextFieldNome.getText() == null || jTextFieldNome.getText().equals("")) {
            jLabelErro.setErrorText("O Código deve ser infomado!");
        } else if (jTextFieldSenha.getPassword().length < 4) {
            jLabelErro.setErrorText("Senha deve ter 4 ou mais caractes!");
        } else {
            try {
                Integer cod = Integer.valueOf(jTextFieldNome.getText());
                userName = banco.validarUsuario(cod, jTextFieldSenha.getPassword());
                jLabelUserName.setText(userName);
                Object[][] table = banco.getEmprestimoAberto(cod);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                if (table.length > 0) {
                    model.setNumRows(0);
                    for (int i = 0; i < table.length; i++) {
                        if ((Integer) table[i][3] == 0) {
                            table[i][3] = "Aberto";
                        } else if ((Integer) table[i][3] == 1) {
                            table[i][3] = "Pendente";
                        }
                        model.addRow(table[i]);
                    }
                    jLabelErro.setText("");
                    inserirUsuario(false);
                } else {
                    jLabelErro.setErrorText("Sem emprestimos pendentes!");
                }
            } catch (Exception ex) {
                jLabelErro.setErrorText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        jLabelErro.setText("");
        inserirUsuario(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverActionPerformed
        int linha = jTable1.getSelectedRow();
        if (linha != -1) {
            Integer cod = (Integer) jTable1.getValueAt(linha, 0);
            try {
                banco.setEmprestimoDevolver(cod, 2, new Date(System.currentTimeMillis()));
                jLabelErro.setForeground(Color.GREEN);
                jLabelErro.setText("Devolução efetuada com sucesso.");
            } catch (SQLException ex) {
                jLabelErro.setForeground(Color.RED);
                jLabelErro.setText(ex.getMessage());
            }
            ((DefaultTableModel) jTable1.getModel()).removeRow(linha);
            if(jTable1.getModel().getRowCount() == 0) {
                inserirUsuario(true);
            }
        } else {
            jLabelErro.setForeground(Color.RED);
            jLabelErro.setText("Selecione uma linha!");
        }
    }//GEN-LAST:event_jButtonDevolverActionPerformed

    private void jButtonPendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPendenteActionPerformed
        int linha = jTable1.getSelectedRow();
        if (linha != -1) {
            Integer cod = (Integer) jTable1.getValueAt(linha, 0);
            try {
                banco.setEmprestimoDevolver(cod, 1, new Date(System.currentTimeMillis()));
                jTable1.setValueAt("Pendente", linha, 3);
                jLabelErro.setForeground(Color.GREEN);
                jLabelErro.setText("Devolução marcada com pendência.");
            } catch (SQLException ex) {
                jLabelErro.setForeground(Color.RED);
                jLabelErro.setText(ex.getMessage());
            }
        } else {
            jLabelErro.setForeground(Color.RED);
            jLabelErro.setText("Selecione uma linha!");
        }
    }//GEN-LAST:event_jButtonPendenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDevolver;
    private javax.swing.JButton jButtonPendente;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVoltar;
    private biblioteca.gui.JErroLabel jLabelErro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JPasswordField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables

    private void inserirUsuario(boolean b) {
        jButtonValidar.setVisible(b);
        jLabelNome.setVisible(b);
        jLabelSenha.setVisible(b);
        jTextFieldNome.setVisible(b);
        jTextFieldSenha.setVisible(b);
        //
        jLabelUsuario.setVisible(!b);
        jLabelUserName.setVisible(!b);
        jScrollPane1.setVisible(!b);
        jButtonDevolver.setVisible(!b);
        jButtonPendente.setVisible(!b);
        jButtonVoltar.setVisible(!b);
    }
}