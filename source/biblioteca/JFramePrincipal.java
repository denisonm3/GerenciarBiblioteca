/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFramePrincipal.java
 *
 * Created on 11/07/2012, 12:28:34
 */
package biblioteca;

import biblioteca.db.ControleBanco;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author denison_usuario
 */
public class JFramePrincipal extends javax.swing.JFrame {
    
    public static final Image FOLHA_DIREITA = Toolkit.getDefaultToolkit().getImage( JFramePrincipal.class .getResource("imagens/folha_direita.jpg"));
    private final ControleBanco banco;
    
    /** Creates new form JFramePrincipal */
    public JFramePrincipal() {
        banco = new ControleBanco();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarUsuario = new biblioteca.CadastrarUsuario();
        consultas = new biblioteca.Consultas();
        devolucao = new biblioteca.Devolucao();
        emprestimo = new biblioteca.Emprestimo();
        historico = new biblioteca.Historico();
        cadastrarLivro = new biblioteca.CadastrarLivro();
        sumario = new biblioteca.Sumario();
        jLabelSumario = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelCad = new javax.swing.JLabel();
        jLabelCadUsuario = new javax.swing.JLabel();
        jLabelCadLivro = new javax.swing.JLabel();
        jLabelConsultas = new javax.swing.JLabel();
        jLabelEmprestimo = new javax.swing.JLabel();
        jLabelDevolucao = new javax.swing.JLabel();
        jLabelSair = new javax.swing.JLabel();
        jLabelConsultaLU = new javax.swing.JLabel();
        jLabelHistorico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inicio = new biblioteca.Inicio();

        cadastrarUsuario.setBanco(banco);

        consultas.setBanco(banco);

        devolucao.setBanco(banco);

        emprestimo.setBanco(banco);

        historico.setBanco(banco);

        cadastrarLivro.setBanco(banco);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagens/livro.png")));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabelSumario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelSumario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSumario.setText("Sumário");

        jLabelInicio.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelInicio.setText("1 - Inicio .................... 1");
        jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseClicked(evt);
            }
        });

        jLabelCad.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelCad.setText("2 - Cadastros ................. 2");
        jLabelCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadMouseClicked(evt);
            }
        });

        jLabelCadUsuario.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabelCadUsuario.setText("  2.1 - Usuário ............... 2");
        jLabelCadUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadUsuarioMouseClicked(evt);
            }
        });

        jLabelCadLivro.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabelCadLivro.setText("  2.2 - Livro ................. 3");
        jLabelCadLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadLivroMouseClicked(evt);
            }
        });

        jLabelConsultas.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelConsultas.setText("3 - Consultas ................. 4");
        jLabelConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConsultasMouseClicked(evt);
            }
        });

        jLabelEmprestimo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelEmprestimo.setText("4 - Emprestimo ................ 6");
        jLabelEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmprestimoMouseClicked(evt);
            }
        });

        jLabelDevolucao.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelDevolucao.setText("5 - Devolução ................. 7");
        jLabelDevolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDevolucaoMouseClicked(evt);
            }
        });

        jLabelSair.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelSair.setText("6 - Sair ...................... 8");
        jLabelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSairMouseClicked(evt);
            }
        });

        jLabelConsultaLU.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabelConsultaLU.setText("  3.1 - Livros e Usuários ..... 4");
        jLabelConsultaLU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConsultaLUMouseClicked(evt);
            }
        });

        jLabelHistorico.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabelHistorico.setText("  3.2 - Histórico ............. 5");
        jLabelHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHistoricoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sumarioLayout = new javax.swing.GroupLayout(sumario);
        sumario.setLayout(sumarioLayout);
        sumarioLayout.setHorizontalGroup(
            sumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sumarioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(sumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSair, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addGroup(sumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelDevolucao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(jLabelEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHistorico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelConsultaLU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelConsultas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSumario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        sumarioLayout.setVerticalGroup(
            sumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sumarioLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelSumario)
                .addGap(36, 36, 36)
                .addComponent(jLabelInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCadUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCadLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConsultaLU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDevolucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSair)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(sumario);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(351, 535));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(351, 535));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(351, 535));
        jScrollPane1.setViewportView(inicio);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        jScrollPane1.setViewportView(inicio);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jLabelCadUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadUsuarioMouseClicked
        jScrollPane1.setViewportView(cadastrarUsuario);
    }//GEN-LAST:event_jLabelCadUsuarioMouseClicked

    private void jLabelCadLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadLivroMouseClicked
        jScrollPane1.setViewportView(cadastrarLivro);
    }//GEN-LAST:event_jLabelCadLivroMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            banco.fechar();
        } finally{
            System.exit(0);
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void jLabelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSairMouseClicked
        formWindowClosing(null);
    }//GEN-LAST:event_jLabelSairMouseClicked

    private void jLabelConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultasMouseClicked
        jScrollPane1.setViewportView(consultas);
    }//GEN-LAST:event_jLabelConsultasMouseClicked

    private void jLabelEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmprestimoMouseClicked
        jScrollPane1.setViewportView(emprestimo);
    }//GEN-LAST:event_jLabelEmprestimoMouseClicked

    private void jLabelDevolucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDevolucaoMouseClicked
        jScrollPane1.setViewportView(devolucao);
    }//GEN-LAST:event_jLabelDevolucaoMouseClicked

    private void jLabelCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadMouseClicked
        jScrollPane1.setViewportView(cadastrarUsuario);
    }//GEN-LAST:event_jLabelCadMouseClicked

    private void jLabelConsultaLUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaLUMouseClicked
        jScrollPane1.setViewportView(consultas);
    }//GEN-LAST:event_jLabelConsultaLUMouseClicked

    private void jLabelHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHistoricoMouseClicked
        jScrollPane1.setViewportView(historico);
    }//GEN-LAST:event_jLabelHistoricoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private biblioteca.CadastrarLivro cadastrarLivro;
    private biblioteca.CadastrarUsuario cadastrarUsuario;
    private biblioteca.Consultas consultas;
    private biblioteca.Devolucao devolucao;
    private biblioteca.Emprestimo emprestimo;
    private biblioteca.Historico historico;
    private biblioteca.Inicio inicio;
    private javax.swing.JLabel jLabelCad;
    private javax.swing.JLabel jLabelCadLivro;
    private javax.swing.JLabel jLabelCadUsuario;
    private javax.swing.JLabel jLabelConsultaLU;
    private javax.swing.JLabel jLabelConsultas;
    private javax.swing.JLabel jLabelDevolucao;
    private javax.swing.JLabel jLabelEmprestimo;
    private javax.swing.JLabel jLabelHistorico;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelSair;
    private javax.swing.JLabel jLabelSumario;
    private javax.swing.JScrollPane jScrollPane1;
    private biblioteca.Sumario sumario;
    // End of variables declaration//GEN-END:variables
}
