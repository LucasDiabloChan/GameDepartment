package view.read;

import data.Game;
import data.PreparedGamesDao;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ReadMainPanel extends javax.swing.JFrame {
    public ReadMainPanel() {
        initComponents();
        this.setBackground(Color.lightGray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();
        labelDoCampo = new javax.swing.JLabel();
        labelDoJBox = new javax.swing.JLabel();
        caixaDeOpcoes = new javax.swing.JComboBox<>();
        botaoBuscar = new javax.swing.JButton();
        labelAviso = new javax.swing.JLabel();
        labelDashes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar jogo");
        setResizable(false);

        titlePanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titlePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePanel.setText("Consultar Jogos");

        labelDoCampo.setText("Id do jogo:");

        labelDoJBox.setText("Buscar por:");

        caixaDeOpcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nome", "Descrição" }));
        caixaDeOpcoes.setMinimumSize(new java.awt.Dimension(85, 20));

        botaoBuscar.setBackground(new java.awt.Color(204, 255, 204));
        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        labelAviso.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelAviso.setText("Ao clicar em buscar, você será redirecionado para outra tela.");

        labelDashes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDashes.setText("- - - - - - - - - - - - - -  - - - - - - - - - - - - - -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelDashes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(botaoBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(labelDoJBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caixaDeOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAviso)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDoCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel)
                .addGap(2, 2, 2)
                .addComponent(labelDashes, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoCampo)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaDeOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDoJBox))
                .addGap(24, 24, 24)
                .addComponent(botaoBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAviso)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        
        String key = campoBuscar.getText();
        
        PreparedGamesDao gd = new PreparedGamesDao();
        
        if(gd.createDBConex()){
            Game jogo = gd.makeReadQueryByGameName(key);
            
            if(jogo != null){
                ShowGameInfo edj = new ShowGameInfo();
                edj.setMultipleValues(jogo);
                edj.setVisible(true);
            }
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ReadMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadMainPanel().setVisible(true);
            }
        });
    }
    
    public String getSelectedItem(){
        int index = caixaDeOpcoes.getSelectedIndex();
        
        return caixaDeOpcoes.getItemAt(index);
    }
    
    public String getCampoBuscar(){
        return campoBuscar.getText();
    }
    
    //public int getCampoBuscar(){
    //    return Integer.parseInt(campoBuscar.getText());
    //}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JComboBox<String> caixaDeOpcoes;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelDashes;
    private javax.swing.JLabel labelDoCampo;
    private javax.swing.JLabel labelDoJBox;
    private javax.swing.JLabel titlePanel;
    // End of variables declaration//GEN-END:variables
}
