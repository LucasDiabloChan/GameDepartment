package view.update;

import data.Game;
import data.PreparedGamesDao;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/* === === === === === === === === === === === === === */
public class UpdateMainPanel extends javax.swing.JFrame {

    /* == == == == == == ATRIBUTOS == === == == == == */
    String searchBy = "Id";

    /* == == */
 /* == == == == == == ATRIBUTOS == === == == == == */
 /* == == == == == == MÉTODOS == == == == == == */
    public UpdateMainPanel() {
        initComponents();
        this.setBackground(Color.lightGray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPanelTitle = new javax.swing.JLabel();
        labelDashes = new javax.swing.JLabel();
        labelInformacao = new javax.swing.JLabel();
        textInformacao = new javax.swing.JTextField();
        caixaDeOpcoes = new javax.swing.JComboBox<>();
        labelProcurarPor = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        labelAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar jogo para atualizar");

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanelTitle.setText("Atualizar Jogo");

        labelDashes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDashes.setText("- - - - - - - - - - - - - -  - - - - - - - - - - - - - -");

        labelInformacao.setText("Id do jogo:");

        caixaDeOpcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Id", "Descrição" }));
        caixaDeOpcoes.setSelectedIndex(1);
        caixaDeOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaDeOpcoesActionPerformed(evt);
            }
        });

        labelProcurarPor.setText("Buscar por:");

        btnBuscar.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelAviso.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelAviso.setText("Ao clicar em buscar, você será redirecionado para outra tela.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDashes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAviso)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelInformacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(labelProcurarPor)
                                        .addGap(18, 18, 18)
                                        .addComponent(caixaDeOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(btnBuscar)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addGap(0, 0, 0)
                .addComponent(labelDashes, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInformacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaDeOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProcurarPor))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAviso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            PreparedGamesDao pgd = new PreparedGamesDao();

            String valor = textInformacao.getText();

            /* * * * * * * * * */
            // BUSCA PELO NOME // 
            if (searchBy.equals("Nome")) {
                List<Game> colecaoDeJogos;

                pgd.createDBConex();

                colecaoDeJogos = pgd.makeReadQueryByGameName(valor);

                if (colecaoDeJogos != null) {
                    for (int i = 0; i < colecaoDeJogos.size(); i++) {
                        System.out.println(">>> GAME " + i + " <<<");
                        Game jogo = colecaoDeJogos.get(i);

                        System.out.println("Id: " + jogo.getId());
                        System.out.println("Nome: " + jogo.getName());
                        System.out.println("Valor: " + jogo.getValue());
                        System.out.println("Capa: " + jogo.getCover());
                        System.out.println("Descrição: " + jogo.getDescricao());
                    }

                    UpdateSelectedGame usg = new UpdateSelectedGame();
                    usg.setVisible(true);
                    usg.setGameCollection(colecaoDeJogos);
                } else {
                    throw new Exception("Falha ao consultar informações...");
                }
            }
            /* * * * * * * * * */

            /* * * * * * * * * * * * */
            // BUSCAR PELA DESCRIÇÃO //
            if(searchBy.equals("Descrição")){
                List<Game> jogos;
                
                pgd.createDBConex();
                
                jogos = pgd.makeReadQueryByGameDescription(valor);

                if(jogos == null){
                    throw new Exception("Falha ao consultar informações...");
                }else{
                    UpdateSelectedGame usg = new UpdateSelectedGame();
                    usg.setGameCollection(jogos);
                    usg.setVisible(true);
                }
            }
            /* * * * * * */
            
            /* * * * * * * * */
            // BUSCA PELO ID //
            if (searchBy.equals("Id")) {
                Game jogo;

                int id = Integer.parseInt(valor);
                
                pgd.createDBConex();
                jogo = pgd.makeReadQueryById(id);

                if (jogo != null) {
                    UpdateSelectedGame usg = new UpdateSelectedGame();
                    usg.displayGameInfo(jogo);
                    usg.setVisible(true);
                } else {
                    throw new Exception("Falha ao consultar informações...");
                }
            }
            /* * * * * * * * */

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Atualização realizada", NORMAL);

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void caixaDeOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaDeOpcoesActionPerformed
        updateField();
    }//GEN-LAST:event_caixaDeOpcoesActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    private void updateField() {
        int id = caixaDeOpcoes.getSelectedIndex();
        searchBy = caixaDeOpcoes.getItemAt(id);
        labelInformacao.setText(searchBy + " do jogo:");
    }
    
/* == == == == == == MÉTODOS == == == == == == */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> caixaDeOpcoes;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelDashes;
    private javax.swing.JLabel labelInformacao;
    private javax.swing.JLabel labelProcurarPor;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JTextField textInformacao;
    // End of variables declaration//GEN-END:variables
}
/* === === === === === === === === === === === === === */
