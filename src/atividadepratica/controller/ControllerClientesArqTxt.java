/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepratica.controller;

import java.util.StringTokenizer;
import atividadepratica.model.Cliente;

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

public class ControllerClientesArqTxt extends  ControllerArqTxt{
    
    protected Cliente cliente = new Cliente();
    
    public void scanCliente() {
        //setArquivo("Abrir");
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
            //setArquivo("Salvar");
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

