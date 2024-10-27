/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepratica;
import atividadepratica.view.Cadastro_Clientes;

/**
 *
 * @author abreu
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
