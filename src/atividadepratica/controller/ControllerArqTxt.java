/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepratica.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author abreu
 */
public class ControllerArqTxt extends ControllerArq{

    private String texto = null;
    private BufferedReader scanner = null;
    private BufferedWriter registrador = null;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
    @Override
    public boolean ler() {
       StringBuilder linha = new StringBuilder();
       try {
           scanner = new BufferedReader(new FileReader(arq));
           while (scanner.ready()) {
               linha.append(scanner.readLine()).append("\n");
           }
           scanner.close();
           setTexto(linha.toString());
           return true;
       } catch (FileNotFoundException erro) {
           System.err.println(erro.getMessage() + "Arquivo não encontrado");
           return false;
        } catch (IOException erro) {
            System.err.println(erro.getMessage() + "Erro ao Ler Arquivo");
            return false;
        }
    }

    @Override
    public boolean escrever(boolean append) {
        if (arq != null) {
            try {
                registrador = new BufferedWriter(new FileWriter(arq, append));
                registrador.write(getTexto());
                registrador.close();
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao gravar arquivo!!!");
                return false;
            }
        } else {
            return false;
        }
    }
    
}
