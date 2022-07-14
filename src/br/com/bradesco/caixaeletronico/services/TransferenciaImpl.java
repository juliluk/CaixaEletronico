package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia{


    public TransferenciaImpl(MemoriaContaRepository memoriaContaRepository) {

    }

    @Override
    public void execute(double valor, String numeroDaConta) {
        System.out.println("Informa o Número da Conta: " + numeroDaConta);
        System.out.println("Informe o valor de: R$ " + valor);

        System.out.println("Transferencia realizada com sucesso!");

    }
}
