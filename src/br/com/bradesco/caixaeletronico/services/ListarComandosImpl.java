package br.com.bradesco.caixaeletronico.services;

import java.sql.SQLOutput;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Escolha uma das opções!");
        System.out.println("0 para encerrar");
        System.out.println("1 para efetuar saque");
        System.out.println("2 para efetuar deposito");
        System.out.println("3 para abrir uma conta");
        System.out.println("4 para Transferência");
        System.out.println("5 para Pix");


    }
}
