/**
 * @Description: aplicativo Desktop para gerar arquivos .txt
 * @author: LucDev 
 * @Created: 13/07/2023
 * @Updated: 13/07/2023
 */

package data;

import java.io.File;
import java.io.IOException;



public class DocWriter {
    public static void main(String[] args) throws IOException {

        gerarUmTxt();
    }
    
    public static void gerarUmTxt(){
        // Lugar específico (...\\arq.txt) para salvar esse arquivo
        String pathToSave = "C:\\Users\\LUCAS\\Documents\\NetBeansProjects\\DocWriter\\TxtsGerados\\arq_01.txt";
        
        // Objeto para criar coisas
        File myText = new File(pathToSave);
        
        // Tenta criar o arquivo
        try{
            myText.createNewFile();
            System.out.println("Deu tudo certo!");
            
        }catch(IOException e){
            System.out.println("Deu ruim bixo: \n" + e.getMessage() + "\n");
        }
    }
}
