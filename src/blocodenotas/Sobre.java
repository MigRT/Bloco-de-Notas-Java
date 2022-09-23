/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocodenotas;

/**
 *
 * @author Migue
 */
public class Sobre {
    
    BlocoDeNotas blocoN;
    
    public Sobre(BlocoDeNotas blocoN){
    
        this.blocoN = blocoN;
    }
    
    public void sobre(){
        blocoN.areaTexto.setText("Bloco de notas criado em aula. Possui as opções de novo arquivo, abrir, salvar, copiar, colar e recortar.");
    }
}
