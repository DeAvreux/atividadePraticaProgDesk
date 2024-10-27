/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepratica.model;

/**
 *
 * @author abreu
 */
public class Cliente {
    
    private String nomeCliente;
    private String cpfCliente;
    private String emailCliente;
    private String telefoneCliente;
    
    public Cliente() {
        this.nomeCliente = "";
        this.cpfCliente = "";
        this.emailCliente = "";
        this.telefoneCliente = "";
    }
    
    public Cliente(String nomeCliente, String cpfCliente, String emailCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }
    
    public void mostraDados() {
        System.out.println("-> NomeCli: " + this.nomeCliente + " CPFCli: " + this.cpfCliente + " TelefoneCli: " +  this.telefoneCliente + " EmailCli: " + this.emailCliente);
    }
    
    
    
}
