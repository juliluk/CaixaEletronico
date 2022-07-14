package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;

public interface Transferencia {


    void execute(double valor, int numeroDaConta);
}