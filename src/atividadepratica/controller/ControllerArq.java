/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepratica.controller;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * Daniel de Abreu - RA:1914731
 * Bruna de Paula Oliveira - RA: 2312778
 * 
 * Curso: Engenharia de Software 
 * Turma: ES48S - Programação Desktop - ES81 (2024_02)
 * 
 * ATIVIDADE PRÁTICA EM DUPLA
 * 
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
