package view.delete;

import data.Game;
import data.PreparedGamesDao;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class DeleteMainPanel extends javax.swing.JFrame {

    String labelsText[] = {"Nome do jogo: ", "Id do jogo: ", "Descrição do jogo: "};
    String searchBy = "Id";

    public DeleteMainPanel() {
        initComponents();
        this.setBackground(Color.lightGray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelWindow = new javax.swing.JLabel();
        labelSearchBy = new javax.swing.JLabel();
        opcoesDeBusca = new javax.swing.JComboBox<>();
        textGameInfo = new javax.swing.JTextField();
        labelGameInfo = new javax.swing.JLabel();
        labelDashes = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        labelAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar jogo para apagar");

        labelWindow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWindow.setText("EXCLUIR JOGO");

        labelSearchBy.setText("Procurar por: ");

        opcoesDeBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Id", "Descrição" }));
        opcoesDeBusca.setSelectedIndex(1);
        opcoesDeBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesDeBuscaActionPerformed(evt);
            }
        });

        textGameInfo.setMinimumSize(new java.awt.Dimension(200, 20));

        labelGameInfo.setText("Id do jogo:");

        labelDashes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDashes.setText("- - - - - - - - - - - - - -  - - - - - - - - - - - - - -");

        btnSearch.setBackground(new java.awt.Color(204, 255, 204));
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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
                            .addComponent(labelWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDashes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addComponent(labelAviso))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(labelGameInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textGameInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(labelSearchBy)
                                .addGap(18, 18, 18)
                                .addComponent(opcoesDeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnSearch)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelDashes, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGameInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGameInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcoesDeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchBy))
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAviso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* * * * * * * * * * * * * * * * * * * * */
    /* BUSCA E EXIBE O JOGO NUMA NOVA JANELA */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String value = getTextFromTextField();
        
        try{
            if(value.equals("")){
                throw new Exception("O campo não pode estar em branco");
            }

            PreparedGamesDao pgd = new PreparedGamesDao();

            // Cria a conexão com banco
            if (pgd.createDBConex()) {

                // Busca os dados de acordo com o campo
                if(searchBy.equals("Id")) {
                    Game jogo;
                    jogo = pgd.makeReadQueryById(Integer.parseInt(value));
                    
                    if(jogo != null){
                        DeleteOneGame dog = new DeleteOneGame();

                        dog.setGameInfos(jogo);
                        dog.setVisible(true);
                    }
                
                }else if(searchBy.equals("Nome")){
                    List<Game> jogo = pgd.makeReadQueryByGameName(value);
                    
                    if(jogo != null){
                        DeleteMultipleGames dmg = new DeleteMultipleGames();

                        dmg.adicionarItensAoPainelLateral(jogo);
                        dmg.setVisible(true);
                    }
                
                }else if(searchBy.equals("Descrição")){
                    List<Game> jogo = pgd.makeReadQueryByGameDescription(value);
                    
                    if(jogo != null){
                        DeleteMultipleGames dmg = new DeleteMultipleGames();

                        dmg.adicionarItensAoPainelLateral(jogo);
                        dmg.setVisible(true);
                    }                
                }else{
                    JOptionPane.showMessageDialog(null, "Campo '" + searchBy + "' não reconhecido!");
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Houve algum erro com o valor inserido, certifique-se de \ninserir o valor correspondente à caixa selecionada.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    /* * * * * * * * * * * * * * * * * * * * */

    /* * * * * * * * * * * * * * * * * **/
    /* ALTERA O TEXTO DA LABEL DE BUSCA */
    private void opcoesDeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesDeBuscaActionPerformed
        updateFieldOnComboBoxChange();
    }//GEN-LAST:event_opcoesDeBuscaActionPerformed
    /* * * * * * * * * * * * * * * * * **/
    
    // * * * * * * * * * * * * * * //
    /* RETORNA O ITEM SELECIONADO  */
    private String getComboBoxSelectedItem() {
        int index = opcoesDeBusca.getSelectedIndex();
        return opcoesDeBusca.getItemAt(index);
    }
    // * * * * * * * * * * * * * * //

    // * * * * * * * * * * * * //
    /* ALTERA O TEXTO DA LABEL */
    private void updateFieldOnComboBoxChange() {
        String actualItem = getComboBoxSelectedItem();
        searchBy = actualItem;

        switch (actualItem) {
            case "Nome" -> {
                labelGameInfo.setText(labelsText[0]);
            }

            case "Id" -> {
                labelGameInfo.setText(labelsText[1]);
            }

            case "Descrição" -> {
                labelGameInfo.setText(labelsText[2]);
            }

            default -> {/* nothing happens */
            }
        }
    }
    // * * * * * * * * * * * * //

    // * * * * * * * * * * * * * //
    /* RETORNA O TEXTO INSERIDO */
    public String getTextFromTextField() {
        try{
            String gameInfo = textGameInfo.getText();
            
            if(!gameInfo.equals("")){
                return gameInfo;
            }else{
                throw new Exception("Insira uma informação válida.");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return "";
        }
    }
    // * * * * * * * * * * * * * //


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelDashes;
    private javax.swing.JLabel labelGameInfo;
    private javax.swing.JLabel labelSearchBy;
    private javax.swing.JLabel labelWindow;
    private javax.swing.JComboBox<String> opcoesDeBusca;
    private javax.swing.JTextField textGameInfo;
    // End of variables declaration//GEN-END:variables
}
