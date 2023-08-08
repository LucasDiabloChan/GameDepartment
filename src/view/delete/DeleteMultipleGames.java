
package view.delete;

import data.Game;
import data.PreparedGamesDao;
import java.util.List;
import javax.swing.JOptionPane;

public class DeleteMultipleGames extends javax.swing.JFrame {
    public DeleteMultipleGames() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        labelValue = new javax.swing.JLabel();
        campoValue = new javax.swing.JTextField();
        campoCover = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        labelCover = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        campoName = new javax.swing.JTextField();
        labelSelecionado = new javax.swing.JLabel();
        btnFecharJanela = new javax.swing.JButton();
        campoId = new javax.swing.JTextField();
        labelValue1 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDeJogos = new javax.swing.JList<>();
        labelResultados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultado da busca");

        labelName.setText("Jogo:");

        labelValue.setText("Valor:");

        campoValue.setEditable(false);
        campoValue.setFocusable(false);

        campoCover.setEditable(false);
        campoCover.setFocusable(false);

        labelDescricao.setText("Descrição:");

        labelCover.setText("Capa:");

        campoDescricao.setEditable(false);
        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        campoDescricao.setFocusable(false);
        jScrollPane1.setViewportView(campoDescricao);

        campoName.setEditable(false);
        campoName.setFocusable(false);
        campoName.setRequestFocusEnabled(false);

        labelSelecionado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSelecionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSelecionado.setText("SELECIONADO");

        btnFecharJanela.setBackground(new java.awt.Color(119, 241, 89));
        btnFecharJanela.setText("FECHAR");
        btnFecharJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaActionPerformed(evt);
            }
        });

        campoId.setEditable(false);
        campoId.setFocusable(false);
        campoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdActionPerformed(evt);
            }
        });

        labelValue1.setText("id:");

        btnExcluir.setBackground(new java.awt.Color(250, 100, 100));
        btnExcluir.setText("Excluir Jogo");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaDeJogos);

        labelResultados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelResultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResultados.setText("RESULTADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharJanela)
                        .addGap(27, 27, 27))
                    .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCover, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelName)
                        .addGap(20, 20, 20)
                        .addComponent(campoName))
                    .addComponent(campoCover, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelValue)
                        .addGap(18, 18, 18)
                        .addComponent(campoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelValue1)
                        .addGap(18, 18, 18)
                        .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelName)
                            .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelValue)
                            .addComponent(campoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelValue1)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCover))
                        .addGap(18, 18, 18)
                        .addComponent(labelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluir)
                            .addComponent(btnFecharJanela)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int confirmado = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse jogo?");
        
        if(confirmado == 1){
            try{
                int id = Integer.parseInt(campoId.getText());
                
                PreparedGamesDao pgd = new PreparedGamesDao();
                pgd.createDBConex();
                
                if(pgd.makeDeleteQueryById(id) == 1){
                    JOptionPane.showMessageDialog(null, "Jogo excluído com sucesso!");
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Falha ao excluir jogo...");
                }
                
            }catch(NumberFormatException ex){
                System.out.println("Algo deu errado bixo...");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharJanelaActionPerformed

    // Coloca as informações no painel lateral
    public void adicionarItensAoPainelLateral(List<Game> g){
        
        String[] nomeDosJogos = new String[g.size()];
        
        for (int i = 0; i < g.size(); i++){
            Game jogo = g.get(i);
            
            nomeDosJogos[i] = jogo.getId() + " | " + jogo.getName();
        }
        
        listaDeJogos.setListData(nomeDosJogos);
    }
    
    // Coloca as informações na tela
    public void setGameInfos(Game g){
        if(g != null){
            campoId.setText(String.valueOf(g.getId()));
            campoName.setText(g.getName());
            campoValue.setText(String.valueOf(g.getValue()));
            campoCover.setText(g.getCover());
            campoDescricao.setText(g.getDescricao());
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFecharJanela;
    private javax.swing.JTextField campoCover;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoName;
    private javax.swing.JTextField campoValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCover;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelResultados;
    private javax.swing.JLabel labelSelecionado;
    private javax.swing.JLabel labelValue;
    private javax.swing.JLabel labelValue1;
    private javax.swing.JList<String> listaDeJogos;
    // End of variables declaration//GEN-END:variables
}
