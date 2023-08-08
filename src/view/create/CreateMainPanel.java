package view.create;

/**
 * Description: classe responsável por inserir jogos no banco de dados
 * @author LUCAS
 */
import data.Game;
import data.GamesDao;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CreateMainPanel extends javax.swing.JFrame {

    public CreateMainPanel() {
        initComponents();
        this.setBackground(Color.lightGray);
    }
    
    private ArrayList<String> errorCauses = new ArrayList<>();
    private boolean hasErrorInAnyData = false;
    
    
    private boolean errorOnName = false;
    private boolean errorOnCover = false;
    private boolean errorOnDesc = false;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelDoNome = new javax.swing.JLabel();
        campoDoNome = new javax.swing.JTextField();
        labelDoValor = new javax.swing.JLabel();
        campoDoValor = new javax.swing.JTextField();
        labelDaCapa = new javax.swing.JLabel();
        labelDaDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDaDescricao = new javax.swing.JTextArea();
        campoDaFoto = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Jogos");

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Cadastrar novo jogo");

        labelDoNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDoNome.setText("Nome*: ");

        campoDoNome.setForeground(new java.awt.Color(51, 51, 51));
        campoDoNome.setToolTipText("Insira o nome do jogo.");

        labelDoValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDoValor.setText("Valor:");

        campoDoValor.setForeground(new java.awt.Color(51, 51, 51));
        campoDoValor.setToolTipText("Insira o preço do jogo.");

        labelDaCapa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDaCapa.setText("Capa*:");

        labelDaDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDaDescricao.setText("Descrição*:");

        campoDaDescricao.setColumns(20);
        campoDaDescricao.setForeground(new java.awt.Color(51, 51, 51));
        campoDaDescricao.setRows(5);
        campoDaDescricao.setTabSize(4);
        campoDaDescricao.setToolTipText("descreva o jogo.");
        campoDaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDaDescricaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(campoDaDescricao);

        campoDaFoto.setForeground(new java.awt.Color(51, 51, 51));
        campoDaFoto.setToolTipText("Insira o nome da imagem do jogo.");

        botaoEnviar.setBackground(new java.awt.Color(182, 252, 202));
        botaoEnviar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoEnviar.setForeground(new java.awt.Color(51, 51, 51));
        botaoEnviar.setText("SALVAR");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("Campos marcados com (*) são obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(botaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDoValor)
                        .addGap(18, 18, 18)
                        .addComponent(campoDoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelDaDescricao)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelDaCapa)
                            .addGap(18, 18, 18)
                            .addComponent(campoDaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelDoNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoDoNome))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoNome)
                    .addComponent(campoDoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoValor)
                    .addComponent(campoDoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDaCapa))
                .addGap(18, 18, 18)
                .addComponent(labelDaDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(botaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed

        // Classe relativa ao banco de dados
        GamesDao dao;
        dao = new GamesDao();

        // Classe relativa às informações dos jogos
        Game jogo = new Game();
        
        /* * * * * * * * * * * * * * * * */
        /* PEGA OS VALORES DO FORMULÁRIO */
        String nome = this.getCampoDoNome();
        double valor = this.getCampoDoValor();
        String capa = this.getCampoDaFoto();
        String descricao = this.getCampoDaDescricao();
        /* * * * * * * * * * * * * * * * */
        
        hasErrorInAnyData = (errorOnCover || errorOnDesc || errorOnName);
        
        /* * * * * * * * * * * * * * */
        /* SALVA O REGISTRO NO BANCO */
        try{
            // Caso encontre qualquer erro, para a inserção
            if(hasErrorInAnyData){
                throw new Exception();
            }

            /* * * * * * * * * * * * * * * */
            /* INSERE OS VALORES NO OBJETO */
            jogo.setName(nome);
            jogo.setValue(valor);
            jogo.setCover(capa);
            jogo.setDescricao(descricao);
            /* * * * * * * * * * * * * * * */

            // Verifica se a conectou
            if (!dao.createDBConex()) {
                JOptionPane.showMessageDialog(rootPane, "Algo errado não está certo...");
                throw new Exception("Deu ruim na conexão!");
            }

            // Verifica se o insert se procedeu certinho
            int response = dao.makeInsertQuery(jogo);
            if (response != 1) {
                JOptionPane.showMessageDialog(rootPane, "Algo errado não está certo...");
                throw new Exception("Deu ruim no cadastramento!");
            }

            // Encerra a conexão
            dao.closeConnection();

            clearFields(); // Limpa a tela

            // Feedback q deu tudo certo!
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        } catch (HeadlessException ex) {
            System.out.println("Se liga no erro bobão: " + ex.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Verifique se todos os campos marcados com (*) foram preenchidos.");
            System.out.println("Se liga no erro bobão: " + ex.getMessage());
        }
        /* * * * * * * * * * * * * * */
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void campoDaDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDaDescricaoKeyPressed
        System.out.println(evt.getKeyCode());
        
        if(evt.getKeyCode() == 10){
            botaoEnviar.requestFocus();
            botaoEnviar.doClick();
        }
    }//GEN-LAST:event_campoDaDescricaoKeyPressed

// ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  --- //
    /* * * * * * * * * */
    /* LIMPA OS CAMPOS */
    private void clearFields() {
        campoDaDescricao.setText("");
        campoDaFoto.setText("");
        campoDoNome.setText("");
        campoDoValor.setText("");
    }
    /* * * * * * * * * */
// ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  --- //
    /* * * * * * * * * * * * * * */
    /* RETORNA OS NOMES TRATADOS */
    public String getCampoDoNome() {
        try{
            String name = campoDoNome.getText();
            
            if(name.isBlank()){
                throw new Exception();
            }
            
            errorOnName = false;
            return name;
            
        }catch(Exception ex){
            errorOnName = true;
            
            return "false";
        }
    }
    /* * * * * * * * * * * * * * */
    
    /* * * * * * * * * */
    /* RETORNA O VALOR */
    public double getCampoDoValor() {
        double val = 0.0;

        try{
            val = Double.parseDouble(campoDoValor.getText());
        }catch(NumberFormatException numEx){
            JOptionPane.showMessageDialog(null, "Valor inserido inválido!");
        }

        campoDoValor.setText("0.0");
        
        return val;
    }
    /* * * * * * * * * */
    
    /* * * * * * * * * * * * * * * */
    /* RETORNA A STRING DE CAMINHO */
    public String getCampoDaFoto() {
        try{
            String txt = campoDaFoto.getText();
            
            if(txt.isBlank()){
                throw new Exception();
            }
            
            errorOnCover = false;            
            return txt;
            
        }catch(Exception ex){
            errorOnCover = true;
            return "false";
        }
    }
    /* * * * * * * * * * * * * * * */
    
    /* * * * * * * * * * * */
    /* RETORNA A DESCRIÇÃO */
    public String getCampoDaDescricao() {
        try{
            String desc = campoDaDescricao.getText();
            
            if(desc.isBlank()){
                throw new Exception();
            }
            
            errorOnDesc = false;
            return desc;
            
        }catch(Exception ex){
            errorOnDesc = true;
            
            return "false";
        }
    }
    /* * * * * * * * * * * */
// ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  --- //
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JTextArea campoDaDescricao;
    private javax.swing.JTextField campoDaFoto;
    private javax.swing.JTextField campoDoNome;
    private javax.swing.JTextField campoDoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDaCapa;
    private javax.swing.JLabel labelDaDescricao;
    private javax.swing.JLabel labelDoNome;
    private javax.swing.JLabel labelDoValor;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
