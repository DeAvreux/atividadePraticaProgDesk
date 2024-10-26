/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepratica.controller;

import java.io.File;
import javax.swing.JFileChooser;
/**
 *
 * @author abreu
 */
public abstract class ControllerArq {
    protected File arq = null;
    public abstract boolean ler();
    public abstract boolean escrever(boolean  append);
    
    public File getArq() {
        return arq;
    }

    public void setArq(File arq) {
        this.arq = arq;
    }
    
    public void setArquivo(String nomePasta){
        arq = null;
        String pastaInicial = System.getProperty("user.dir");
        JFileChooser seletor = new JFileChooser(pastaInicial);
        if (JFileChooser.APPROVE_OPTION != seletor.showDialog(null, nomePasta)) {
            System.out.println("Pasta não encontrada!!");
        } else {
            arq = seletor.getSelectedFile();
        }
    }
    
    
}
