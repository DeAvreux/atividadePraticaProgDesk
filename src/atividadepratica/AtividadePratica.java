/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepratica;
import atividadepratica.view.Cadastro_Clientes;

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

public class AtividadePratica {

    /**
     * @param args the command line arguments
     */
    static void abrirJanela() {
        Cadastro_Clientes cad = new Cadastro_Clientes();
        cad.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        abrirJanela();
    }
    
}
