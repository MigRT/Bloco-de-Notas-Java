/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocodenotas;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author migue
 */
public class Arquivo {
    
    BlocoDeNotas blocoN;
    String nomeArquivo;
    String enderecoArquivo;
    
    public Arquivo(BlocoDeNotas blocoN){
    
        this.blocoN = blocoN;
    }
    
    public void novoArquivo(){
        
        blocoN.areaTexto.setText("");
        blocoN.janela.setTitle("Novo Arquivo");
        nomeArquivo = null;
        enderecoArquivo = null;
    }
    public void abrir(){
    
        FileDialog fd = new FileDialog(blocoN.janela, "Abrir", FileDialog.LOAD);
        fd.setVisible(true);
        
        if(fd.getFile()!=null){
        
            nomeArquivo = fd.getFile();
            enderecoArquivo = fd.getDirectory();
            blocoN.janela.setTitle(nomeArquivo);
        }
        try {
            BufferedReader ler = new BufferedReader(new FileReader(enderecoArquivo + nomeArquivo));
            
            blocoN.areaTexto.setText("");
            
            String linha = null;
            
            while((linha = ler.readLine())!=null){
            
                blocoN.areaTexto.append(linha + "\n");
            }
            ler.close();
        }   catch(Exception e){
            
            System.out.println("Arquivo não pode ser aberto");
        }
    }
    public void salvar(){
        
        FileDialog fd = new FileDialog(blocoN.janela, "Salvar", FileDialog.SAVE);
        fd.setVisible(true);
        
        if(fd.getFile()!=null){
        
            nomeArquivo = fd.getFile();
            enderecoArquivo = fd.getDirectory();
            blocoN.janela.setTitle(nomeArquivo);
        }
        
        try{
            FileWriter escrever = new FileWriter(enderecoArquivo + nomeArquivo);
            escrever.write(blocoN.areaTexto.getText());
            escrever.close();
            
        }   catch(Exception e){
            
                System.out.println("ERRO");
        }
    }
}
