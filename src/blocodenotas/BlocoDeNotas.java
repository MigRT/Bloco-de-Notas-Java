/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blocodenotas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author migue
 */
public class BlocoDeNotas implements ActionListener{
    
    JFrame janela;
    JTextArea areaTexto;
    JMenuBar menuFerramentas;
    JMenu menuArquivo, menuEditar, menuSobre;
    JMenuItem opcaoNovo, opcaoAbrir, opcaoSalvar, opcaoCopiar, opcaoColar, opcaoRecortar, opcaoAjuda;
    
    Arquivo arquivo = new Arquivo(this);
    Editar editar = new Editar(this);
    Sobre sobre = new Sobre(this);
    
    public static void main(String[] args) {
        
        new BlocoDeNotas();
        
    }
    public BlocoDeNotas(){
        
        criarJanela();
        criarAreaTexto();
        criarMenuFerramentas();
        criarOpcoesMenu();
        janela.setVisible(true);
    
    }
    public void criarJanela(){
    
        janela = new JFrame("Bloco de notas");
        janela .setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void criarAreaTexto(){
    
        areaTexto = new JTextArea();
        janela.add(areaTexto);
    }
    public void criarMenuFerramentas(){
    
        menuFerramentas = new JMenuBar();
        janela.setJMenuBar(menuFerramentas);
        
        menuArquivo = new JMenu("Arquivo");
        menuFerramentas.add(menuArquivo);
        menuEditar = new JMenu("Editar");
        menuFerramentas.add(menuEditar);
        menuSobre = new JMenu("Sobre");
        menuFerramentas.add(menuSobre);
    }
    public void criarOpcoesMenu(){
    
        opcaoNovo = new JMenuItem("Novo");
        opcaoNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opcaoNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Downloads\\novo.png"));
        opcaoNovo.addActionListener(this);
        opcaoNovo.setActionCommand("Novo");
        menuArquivo.add(opcaoNovo);
        
        opcaoAbrir = new JMenuItem("Abrir");
        opcaoAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opcaoAbrir.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Downloads\\abrir.png"));
        opcaoAbrir.addActionListener(this);
        opcaoAbrir.setActionCommand("Abrir");
        menuArquivo.add(opcaoAbrir);
        
        opcaoSalvar = new JMenuItem("Salvar");
        opcaoSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opcaoSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Downloads\\salvar.png"));
        opcaoSalvar.addActionListener(this);
        opcaoSalvar.setActionCommand("Salvar");
        menuArquivo.add(opcaoSalvar);
        
        opcaoCopiar = new JMenuItem("Copiar");
        opcaoCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opcaoCopiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Downloads\\copiar.png"));
        opcaoCopiar.addActionListener(this);
        opcaoCopiar.setActionCommand("Copiar");
        menuEditar.add(opcaoCopiar);
        
        opcaoColar = new JMenuItem("Colar");
        opcaoColar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opcaoColar.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Downloads\\colar.png"));
        opcaoColar.addActionListener(this);
        opcaoColar.setActionCommand("Colar");
        menuEditar.add(opcaoColar);
        
        opcaoRecortar = new JMenuItem("Recortar");
        opcaoRecortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opcaoRecortar.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\Downloads\\recortar.png"));
        opcaoRecortar.addActionListener(this);
        opcaoRecortar.setActionCommand("Recortar");
        menuEditar.add(opcaoRecortar);
        
        opcaoAjuda = new JMenuItem("Ajuda");
        opcaoAjuda.addActionListener(this);
        opcaoAjuda.setActionCommand("Ajuda");
        menuSobre.add(opcaoAjuda);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand();
        
        switch(comando){
            case "Novo" -> arquivo.novoArquivo();
            case "Abrir" -> arquivo.abrir();
            case "Salvar" -> arquivo.salvar();
            case "Copiar" -> editar.copiar();
            case "Colar" -> editar.colar();
            case "Recortar" -> editar.recortar();
            case "Ajuda" -> sobre.sobre();
        }
    }
    
}
