
package view.update;

import data.Game;
import data.PreparedGamesDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author LUCAS
 */
public class UpdateSelectedGame extends javax.swing.JFrame {

    List<Game> jogosRecebidos;
    
    public UpdateSelectedGame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GameListButton = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        btnFecharJanela = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        PainelLateral = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaComJogos = new javax.swing.JList<>();
        PainelComUmJogo = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelValue = new javax.swing.JLabel();
        labelCover = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        campoCover = new javax.swing.JTextField();
        campoValue = new javax.swing.JTextField();
        campoName = new javax.swing.JTextField();
        labelValue1 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar registro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECIONADO");

        btnFecharJanela.setBackground(new java.awt.Color(119, 241, 89));
        btnFecharJanela.setText("FECHAR");
        btnFecharJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(250, 100, 100));
        btnAlterar.setText("Salvar alterações");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        PainelLateral.setBackground(new java.awt.Color(153, 204, 255));

        listaComJogos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaComJogosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaComJogos);

        javax.swing.GroupLayout PainelLateralLayout = new javax.swing.GroupLayout(PainelLateral);
        PainelLateral.setLayout(PainelLateralLayout);
        PainelLateralLayout.setHorizontalGroup(
            PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelLateralLayout.setVerticalGroup(
            PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        labelName.setText("Jogo:");

        labelValue.setText("Valor:");

        labelCover.setText("Capa:");

        labelDescricao.setText("Descrição:");

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        jScrollPane1.setViewportView(campoDescricao);

        labelValue1.setText("id:");

        campoId.setEditable(false);
        campoId.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PainelComUmJogoLayout = new javax.swing.GroupLayout(PainelComUmJogo);
        PainelComUmJogo.setLayout(PainelComUmJogoLayout);
        PainelComUmJogoLayout.setHorizontalGroup(
            PainelComUmJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComUmJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelComUmJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelComUmJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelCover, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelComUmJogoLayout.createSequentialGroup()
                            .addComponent(labelName)
                            .addGap(20, 20, 20)
                            .addComponent(campoName))
                        .addComponent(campoCover, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PainelComUmJogoLayout.createSequentialGroup()
                            .addComponent(labelValue)
                            .addGap(18, 18, 18)
                            .addComponent(campoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(labelValue1)
                            .addGap(40, 40, 40)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelComUmJogoLayout.setVerticalGroup(
            PainelComUmJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComUmJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelComUmJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PainelComUmJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValue)
                    .addComponent(campoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValue1)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelComUmJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCover))
                .addGap(18, 18, 18)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESULTADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(PainelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PainelComUmJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharJanela)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelComUmJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFecharJanela)
                            .addComponent(btnAlterar))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(PainelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
            Game game = getGameAlterations();

            System.out.println(game);

            if(game == null){
                throw new Exception("Preencha todos os dados para enviar!");
            }

            PreparedGamesDao pgd = new PreparedGamesDao();
            pgd.createDBConex();
            pgd.makeUpdateQueryById(game);
            pgd.closeConnection();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Houve algum erro ao salvar os dados...");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnFecharJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharJanelaActionPerformed

    private void listaComJogosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaComJogosValueChanged
        int jogoSelecionado = listaComJogos.getSelectedIndex();
        
        displayGameInfo(jogosRecebidos.get(jogoSelecionado));
    }//GEN-LAST:event_listaComJogosValueChanged
    
    
    public void setGameCollection(List<Game> game){
        
        // Salva uma cópia dos jogos na classe
        jogosRecebidos = game;
        
        // Adiciona o jogo atual ao painel lateral
        adicionarItensAoPainelLateral(game);
    }
    
    /* * * * * * * * * */
    // PEGA ALTERAÇÕES //
    public Game getGameAlterations(){
        Game jogo = new Game();
        
        try{    
            // ID //
            int id = Integer.parseInt(campoId.getText());
            jogo.setId(id);
            
            // NOME //
            String name = campoName.getText();
            if(name.isBlank() || name.isEmpty()){
                throw new Exception("O campo do nome não pode ser vazio!");
            }else{
                jogo.setName(name);
            }
            
            // PREÇO //
            double valor = Double.parseDouble(campoValue.getText());
            jogo.setValue(valor);
            
            // CAPA //
            jogo.setCover(campoCover.getText());
            
            // DESCRIÇÃO //
            String desc = campoDescricao.getText();
            if(desc.isBlank() || desc.isEmpty()){
                throw new Exception("O campo da descrição não pode ser vazio!");
            }else{
                jogo.setDescricao(desc);
            }
            
            return jogo;
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Algum valor inserido é inválido!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    /* * * * * * * * * */

    private void adicionarItensAoPainelLateral(List<Game> g){
        // Cria o botão
        String nomesDosJogos[] =  new String[g.size()];
        
        for (int i = 0; i < nomesDosJogos.length; i++) {
            Game jogo = g.get(i);
            nomesDosJogos[i] = jogo.getId() + " | " + jogo.getName();
        }
        
        listaComJogos.setListData(nomesDosJogos);
        
        listaComJogos.setSelectedIndex(0);
        
        displayGameInfo(g.get(0));
    }    
    
     private void adicionarItensAoPainelLateral(Game g){        
        String nome[] = {g.getId() + " | " + g.getName()};
         
        listaComJogos.setListData(nome);
        
        listaComJogos.setSelectedIndex(0);
        
        displayGameInfo(g);
    }    
     
    public void displayGameInfo(Game g){
        // Coloca as informações na tela
        campoName.setText(g.getName());
        campoId.setText(String.valueOf(g.getId()));
        campoValue.setText(g.getValue() + "");
        campoCover.setText(g.getCover());
        campoDescricao.setText(g.getDescricao());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GameListButton;
    private javax.swing.JPanel PainelComUmJogo;
    private javax.swing.JPanel PainelLateral;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnFecharJanela;
    private javax.swing.JTextField campoCover;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoName;
    private javax.swing.JTextField campoValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCover;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelValue;
    private javax.swing.JLabel labelValue1;
    private javax.swing.JList<String> listaComJogos;
    // End of variables declaration//GEN-END:variables
}
