/**
 *
 * @author LUCAS
 */

package view;

import view.read.ReadMainPanel;
import view.update.UpdateMainPanel;
import view.create.CreateMainPanel;
import view.delete.DeleteMainPanel;
import java.awt.Color;
import javax.swing.JFrame;

public class TelaInicial extends javax.swing.JFrame {
    // Formulário de CADASTRO
    CreateMainPanel telaDeCadastro = new CreateMainPanel();
    
    // Formulário de ATUALIZAÇÃO
    UpdateMainPanel telaDeAtualizacao = new UpdateMainPanel();

    // Formulário de CONSULTA
    ReadMainPanel telaDeConsulta = new ReadMainPanel();
    
    // Formulário de REMOÇÃO
    DeleteMainPanel telaDeRemocao = new DeleteMainPanel();
    
    public TelaInicial() {
        initComponents();
        this.setBackground(Color.lightGray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JLabel();
        devTitle = new javax.swing.JLabel();
        btnAtualizarJogo = new javax.swing.JButton();
        btnProcurarJogo = new javax.swing.JButton();
        btnCadastrarJogo = new javax.swing.JButton();
        btnExcluirJogo = new javax.swing.JButton();
        gamesTitle = new javax.swing.JLabel();
        devTitle3 = new javax.swing.JLabel();
        btnFecharApp = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        devTitle4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Department Manager");

        panelTitle.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        panelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelTitle.setText("Game Department");

        devTitle.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        devTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devTitle.setText("By LucDev");

        btnAtualizarJogo.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarJogo.setText("atualizar");
        btnAtualizarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarJogoActionPerformed(evt);
            }
        });

        btnProcurarJogo.setBackground(new java.awt.Color(153, 204, 255));
        btnProcurarJogo.setText("procurar");
        btnProcurarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarJogoActionPerformed(evt);
            }
        });

        btnCadastrarJogo.setBackground(new java.awt.Color(153, 255, 153));
        btnCadastrarJogo.setText("inserir");
        btnCadastrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarJogoActionPerformed(evt);
            }
        });

        btnExcluirJogo.setBackground(new java.awt.Color(255, 153, 153));
        btnExcluirJogo.setText("excluir");
        btnExcluirJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirJogoActionPerformed(evt);
            }
        });

        gamesTitle.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        gamesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamesTitle.setText("JOGOS:");

        devTitle3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        devTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devTitle3.setText("APLICATIVO:");

        btnFecharApp.setBackground(new java.awt.Color(204, 204, 204));
        btnFecharApp.setText("fechar");
        btnFecharApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAppActionPerformed(evt);
            }
        });

        devTitle4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        devTitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devTitle4.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(devTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnCadastrarJogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizarJogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurarJogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirJogo)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gamesTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(devTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(devTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFecharApp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitle)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(devTitle)
                .addGap(1, 1, 1)
                .addComponent(devTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gamesTitle)
                .addGap(12, 12, 12)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcurarJogo)
                    .addComponent(btnExcluirJogo)
                    .addComponent(btnAtualizarJogo)
                    .addComponent(btnCadastrarJogo))
                .addGap(18, 18, 18)
                .addComponent(devTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarJogoActionPerformed
        mudarVisibilidade(telaDeAtualizacao);
    }//GEN-LAST:event_btnAtualizarJogoActionPerformed

    private void btnProcurarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarJogoActionPerformed
        mudarVisibilidade(telaDeConsulta);
    }//GEN-LAST:event_btnProcurarJogoActionPerformed

    private void btnCadastrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarJogoActionPerformed
        mudarVisibilidade(telaDeCadastro);
    }//GEN-LAST:event_btnCadastrarJogoActionPerformed

    private void btnExcluirJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirJogoActionPerformed
        mudarVisibilidade(telaDeRemocao);
    }//GEN-LAST:event_btnExcluirJogoActionPerformed

    private void btnFecharAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAppActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharAppActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    private void mudarVisibilidade(JFrame panel){
        if(panel.isVisible()){
            panel.setVisible(false);
        }else{
            panel.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarJogo;
    private javax.swing.JButton btnCadastrarJogo;
    private javax.swing.JButton btnExcluirJogo;
    private javax.swing.JButton btnFecharApp;
    private javax.swing.JButton btnProcurarJogo;
    private javax.swing.JLabel devTitle;
    private javax.swing.JLabel devTitle3;
    private javax.swing.JLabel devTitle4;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel gamesTitle;
    private javax.swing.JLabel panelTitle;
    // End of variables declaration//GEN-END:variables
}
