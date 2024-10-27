/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepratica.controller;

import java.util.StringTokenizer;
import atividadepratica.model.Cliente;

/**
 *0
 * @author abreu
 */
public class ControllerClientesArqTxt extends  ControllerArqTxt{
    
    protected Cliente cliente = new Cliente();
    
    public void scanCliente() {
        setArquivo("Abrir");
        ler();
        String aux = getTexto();
        
        StringTokenizer tokens = new StringTokenizer(aux, ";");
        //while (tokens.nextToken()) {
            cliente.setNomeCliente(tokens.nextToken());
            cliente.setCpfCliente(tokens.nextToken());
            cliente.setTelefoneCliente(tokens.nextToken());
            cliente.setEmailCliente(tokens.nextToken());
        //}
    }
        
    public void registrarCliente() {
            String aux = cliente.getNomeCliente() + ";" + cliente.getCpfCliente() + ";" + cliente.getTelefoneCliente() + ";" + cliente.getEmailCliente();
            setTexto(aux);
            setArquivo("Salvar");
            escrever(true);
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setCliente(String nome, String cpf,String telefone, String email) {
        this.cliente.setNomeCliente(nome);
        this.cliente.setCpfCliente(cpf);
        this.cliente.setTelefoneCliente(telefone);
        this.cliente.setEmailCliente(email);
    }
    
}

