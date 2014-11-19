/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Inicio.java
 *
 * Created on 18/07/2012, 17:12:38
 */
package biblioteca;

import biblioteca.db.ControleBanco;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.sql.SQLException;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author denison_usuario
 */
public class Consultas extends javax.swing.JPanel {

    private ControleBanco banco;
    private static final JCheckBox jcb = new JCheckBox();
    private char[] pwdTemp;

    /**
     * Creates new form Inicio
     */
    public Consultas() {
        initComponents();
        jTableLivro.getColumnModel().getColumn(3).setCellRenderer(new JEstadoCellRenderer());
        jTableLivro.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(jComboBoxEstado));
        jTableLivro.getColumnModel().getColumn(4).setCellRenderer(new JButtonCellRenderer(jButtonAlterar));
        jTableLivro.getColumnModel().getColumn(4).setCellEditor(new JButtonCellEditor());
        jTableLivro.getColumnModel().getColumn(5).setCellRenderer(new JButtonCellRenderer(jButtonExcluir));
        jTableLivro.getColumnModel().getColumn(5).setCellEditor(new JButtonCellEditor());
        jTableUsuario.getColumnModel().getColumn(2).setCellRenderer(new JButtonCellRenderer(jButtonSenha));
        jTableUsuario.getColumnModel().getColumn(2).setCellEditor(new JButtonCellEditor());
        jTableUsuario.getColumnModel().getColumn(3).setCellRenderer(new JButtonCellRenderer(jButtonAlterar));
        jTableUsuario.getColumnModel().getColumn(3).setCellEditor(new JButtonCellEditor());
        jTableUsuario.getColumnModel().getColumn(4).setCellRenderer(new JButtonCellRenderer(jButtonExcluir));
        jTableUsuario.getColumnModel().getColumn(4).setCellEditor(new JButtonCellEditor());
        jScrollPaneResult.setViewportView(jTableUsuario);
        jScrollPaneResult.setVisible(false);
        jButtonVoltar.setVisible(false);
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

        jTableUsuario = new javax.swing.JTable();
        jTableLivro = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSenha = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jButtonBusca = new javax.swing.JButton();
        jRadioButtonUsuario = new javax.swing.JRadioButton();
        jRadioButtonLivro = new javax.swing.JRadioButton();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButtonCodigo = new javax.swing.JRadioButton();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPaneResult = new javax.swing.JScrollPane();
        jTextFieldCod = new javax.swing.JTextField();
        jLabelErro = new biblioteca.JErroLabel();

        jTableUsuario.setBackground(new java.awt.Color(255, 253, 238));
        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Senha", "Alterar", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jTableLivro.setBackground(new java.awt.Color(255, 253, 238));
        jTableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Editora", "Estado", "Alterar", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLivro.setGridColor(new java.awt.Color(255, 253, 238));

        jButtonAlterar.setBackground(new java.awt.Color(255, 253, 238));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/certo.png"))); // NOI18N

        jButtonExcluir.setBackground(new java.awt.Color(255, 253, 238));
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/fechar.png"))); // NOI18N

        jButtonSenha.setBackground(new java.awt.Color(255, 253, 238));
        jButtonSenha.setText("****");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Novo", "Bem conservado", "Pouco desgastados", "Perdido", "Danificado" }));
        jComboBoxEstado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxEstadoPropertyChange(evt);
            }
        });

        setMaximumSize(new java.awt.Dimension(351, 535));
        setMinimumSize(new java.awt.Dimension(351, 535));
        setPreferredSize(new java.awt.Dimension(351, 535));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Consultas");

        jLabelCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCodigo.setText("Código:");

        jButtonBusca.setText("Buscar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jRadioButtonUsuario.setBackground(new java.awt.Color(255, 253, 238));
        jRadioButtonUsuario.setSelected(true);
        jRadioButtonUsuario.setText("Usuário");
        jRadioButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUsuarioActionPerformed(evt);
            }
        });

        jRadioButtonLivro.setBackground(new java.awt.Color(255, 253, 238));
        jRadioButtonLivro.setText("Livro");
        jRadioButtonLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLivroActionPerformed(evt);
            }
        });

        jRadioButtonNome.setBackground(new java.awt.Color(255, 253, 238));
        jRadioButtonNome.setSelected(true);
        jRadioButtonNome.setText("Nome");
        jRadioButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNomeActionPerformed(evt);
            }
        });

        jRadioButtonCodigo.setBackground(new java.awt.Color(255, 253, 238));
        jRadioButtonCodigo.setText("Código");
        jRadioButtonCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCodigoActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jScrollPaneResult.setBackground(new java.awt.Color(255, 253, 238));
        jScrollPaneResult.setMaximumSize(new java.awt.Dimension(328, 328));
        jScrollPaneResult.setPreferredSize(new java.awt.Dimension(200, 328));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButtonLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jRadioButtonNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonCodigo)))
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCod))
                            .addComponent(jButtonBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelErro)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneResult, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelTitulo)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonLivro))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jRadioButtonNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCodigo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneResult, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        // TODO add your handling code here:
        jLabelErro.setText("");
        if (jTextFieldCod.getText() == null /*|| jTextFieldCod.getText().equals("")*/) {
            jLabelErro.setErroText("O Código deve ser infomado!");
        } else if (jRadioButtonUsuario.isSelected()) {
            try {
                Object table[][];
                if (jRadioButtonCodigo.isSelected()) {
                    table = banco.getUsuario(Integer.parseInt(jTextFieldCod.getText()));
                } else {
                    table = banco.getUsuario(jTextFieldCod.getText());
                }
                DefaultTableModel model = (DefaultTableModel) jTableUsuario.getModel();
                if (table.length > 0) {
                    apresentarBusca(true);
                    model.setNumRows(0);
                    for (Object[] table1 : table) {
                        model.addRow(table1);
                    }
                } else {
                    jLabelErro.setErroText("Não foram encontrado resultados!");
                }
            } catch (SQLException ex) {
                jLabelErro.setErroText(ex.getMessage());
            } catch (NumberFormatException e) {
                jLabelErro.setErroText("Deve ser informado um número inteiro!");
            }
        } else if (jRadioButtonLivro.isSelected()) {
            try {
                Object table[][];
                if (jRadioButtonCodigo.isSelected()) {
                    table = banco.getLivro(Integer.parseInt(jTextFieldCod.getText()));
                } else {
                    table = banco.getLivro(jTextFieldCod.getText());
                }
                DefaultTableModel model = (DefaultTableModel) jTableLivro.getModel();
                if (table.length > 0) {
                    apresentarBusca(true);
                    model.setNumRows(0);
                    for (int i = 0; i < table.length; i++) {
                        model.addRow(table[i]);
                    }
                } else {
                    jLabelErro.setErroText("Não foram encontrado resultados!");
                }
            } catch (SQLException ex) {
                jLabelErro.setErroText(ex.getMessage());
            } catch (NumberFormatException e) {
                jLabelErro.setErroText("Deve ser informado um número inteiro!");
            }
        } else {
            jLabelErro.setForeground(Color.GREEN);
            jLabelErro.setText("Livro " + jTextFieldCod.getText() + " adicionado com sucesso!");
        }
    }//GEN-LAST:event_jButtonBuscaActionPerformed

    private void jRadioButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUsuarioActionPerformed
        jRadioButtonUsuario.setSelected(true);
        jRadioButtonLivro.setSelected(false);
        jScrollPaneResult.setViewportView(jTableUsuario);
    }//GEN-LAST:event_jRadioButtonUsuarioActionPerformed

    private void jRadioButtonLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLivroActionPerformed
        jRadioButtonUsuario.setSelected(false);
        jRadioButtonLivro.setSelected(true);
        jScrollPaneResult.setViewportView(jTableLivro);
    }//GEN-LAST:event_jRadioButtonLivroActionPerformed

    private void jRadioButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNomeActionPerformed
        jRadioButtonNome.setSelected(true);
        jRadioButtonCodigo.setSelected(false);
    }//GEN-LAST:event_jRadioButtonNomeActionPerformed

    private void jRadioButtonCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCodigoActionPerformed
        jRadioButtonNome.setSelected(false);
        jRadioButtonCodigo.setSelected(true);
    }//GEN-LAST:event_jRadioButtonCodigoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        apresentarBusca(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxEstadoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxEstadoPropertyChange
        int linha = jTableLivro.getSelectedRow();
        if (linha != -1) {
            jTableLivro.setValueAt(jComboBoxEstado.getSelectedIndex() + 1, linha, 3);
        }
    }//GEN-LAST:event_jComboBoxEstadoPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSenha;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JLabel jLabelCodigo;
    private biblioteca.JErroLabel jLabelErro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JRadioButton jRadioButtonCodigo;
    private javax.swing.JRadioButton jRadioButtonLivro;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JRadioButton jRadioButtonUsuario;
    private javax.swing.JScrollPane jScrollPaneResult;
    private javax.swing.JTable jTableLivro;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldCod;
    // End of variables declaration//GEN-END:variables

    private void apresentarBusca(boolean b) {
        jButtonVoltar.setVisible(b);
        jScrollPaneResult.setVisible(b);
        jButtonBusca.setVisible(!b);
        jRadioButtonCodigo.setVisible(!b);
        jRadioButtonNome.setVisible(!b);
        jRadioButtonUsuario.setVisible(!b);
        jRadioButtonLivro.setVisible(!b);
        jLabelCodigo.setVisible(!b);
        jTextFieldCod.setVisible(!b);
    }

    private class JButtonCellRenderer implements TableCellRenderer {

        JButton jb;

        public JButtonCellRenderer(JButton var) {
            jb = var;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return jb;
        }
    }

    private static class JEstadoCellRenderer implements TableCellRenderer {

        JButton novo, conservado, gasto, perdido, danificado, erro;

        public JEstadoCellRenderer() {
            novo = new JButton("Novo");
            conservado = new JButton("Bem conservado");
            gasto = new JButton("Pouco desgastados");
            perdido = new JButton("Perdido");
            danificado = new JButton("Danificado");
            erro = new JButton("Erro");
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Integer val = (Integer) value;
            if (val == null) {
                val = -1;
            }
            switch (val) {
                case 1:
                    return novo;
                case 2:
                    return conservado;
                case 3:
                    return gasto;
                case 4:
                    return perdido;
                case 5:
                    return danificado;
                default:
                    return erro;
            }
        }
    }

    private class JButtonCellEditor extends DefaultCellEditor {

        public JButtonCellEditor() {
            super(jcb);
        }

        @Override
        public Object getCellEditorValue() {
            if (jRadioButtonLivro.isSelected()) {
                //alterar
                if (jTableLivro.getSelectedColumn() == 4) {
                    try {
                        int linha = jTableLivro.getSelectedRow();
                        Integer codigo = (Integer) jTableLivro.getValueAt(linha, 0);
                        String nome = (String) jTableLivro.getValueAt(linha, 1);
                        String editora = (String) jTableLivro.getValueAt(linha, 2);
                        Integer estado = (Integer) jTableLivro.getValueAt(linha, 3);
                        banco.setLivro(codigo, nome, editora, estado);
                    } catch (SQLException ex) {
                        jLabelErro.setErroText(ex.getMessage());
                    }
                } //excluir
                else if (jTableLivro.getSelectedColumn() == 5) {
                    try {
                        int linha = jTableLivro.getSelectedRow();
                        Integer codigo = (Integer) jTableLivro.getValueAt(linha, 0);
                        banco.removeLivro(codigo);
                        if (jTableLivro.getModel().getRowCount() != linha + 1) {
                            ((DefaultTableModel) jTableLivro.getModel()).removeRow(linha);
                        } else {
                            apresentarBusca(false);
                        }
                    } catch (SQLException ex) {
                        jLabelErro.setErroText(ex.getMessage());
                    }
                }
            } else if (jRadioButtonUsuario.isSelected()) {
                //alterar
                if (jTableUsuario.getSelectedColumn() == 3) {
                    try {
                        int linha = jTableUsuario.getSelectedRow();
                        Integer codigo = (Integer) jTableUsuario.getValueAt(linha, 0);
                        String nome = (String) jTableUsuario.getValueAt(linha, 1);
                        if (pwdTemp != null && pwdTemp.length >= 4) {
                            banco.setUsuario(codigo, nome, pwdTemp);
                            pwdTemp = null;
                        } else {
                            banco.setUsuario(codigo, nome);
                        }
                    } catch (SQLException ex) {
                        jLabelErro.setErroText(ex.getMessage());
                    }
                } //excluir
                else if (jTableUsuario.getSelectedColumn() == 4) {
                    try {
                        int linha = jTableUsuario.getSelectedRow();
                        Integer codigo = (Integer) jTableUsuario.getValueAt(linha, 0);
                        banco.removeUsuario(codigo);
                        if (jTableUsuario.getModel().getRowCount() != linha + 1) {
                            ((DefaultTableModel) jTableUsuario.getModel()).removeRow(linha);
                        } else {
                            apresentarBusca(false);
                        }
                    } catch (SQLException ex) {
                        jLabelErro.setErroText(ex.getMessage());
                    }
                } //senha
                else if (jTableUsuario.getSelectedColumn() == 2) {
                    JPasswordField pwd = new JPasswordField(10);
                    int action = JOptionPane.showConfirmDialog(null, pwd, "Informe a nova senha", JOptionPane.OK_CANCEL_OPTION);
                    if (action == JOptionPane.OK_OPTION && pwd.getPassword().length >= 4) {
                        pwdTemp = pwd.getPassword();
                    } else {
                        pwdTemp = null;
                    }
                }
            }
            return null;
        }
    }
}
