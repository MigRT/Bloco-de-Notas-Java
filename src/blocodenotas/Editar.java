/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocodenotas;


import java.awt.Frame;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

/**
 *
 * @author migue
 */
public class Editar extends Frame{
    Clipboard clipbd = getToolkit().getSystemClipboard();
    BlocoDeNotas blocoN;
    
    public Editar(BlocoDeNotas blocoN){
        this.blocoN = blocoN;
    }
    public void copiar(){
        String selection = blocoN.areaTexto.getText();
            StringSelection clipString = new StringSelection(selection);
            clipbd.setContents(clipString, clipString);
    }
    public void colar(){
        
            Transferable clipData = clipbd.getContents(Editar.this);
            try {
                String ClipString = (String) clipData.getTransferData(DataFlavor.stringFlavor);
                blocoN.areaTexto.replaceRange(ClipString, blocoN.areaTexto.getSelectionStart(), blocoN.areaTexto.getSelectionEnd());
            } catch (Exception e) {
                System.out.println("Erro");
            }
    }
    public void recortar(){
        
            String selection = blocoN.areaTexto.getText();
            StringSelection clipString = new StringSelection(selection);
            clipbd.setContents(clipString, clipString);
            blocoN.areaTexto.replaceRange("", blocoN.areaTexto.getSelectionStart(), blocoN.areaTexto.getSelectionEnd());
            blocoN.areaTexto.setText("");
        }
    }
