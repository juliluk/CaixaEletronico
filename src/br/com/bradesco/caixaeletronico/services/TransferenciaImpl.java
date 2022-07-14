package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia{

    private final MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }



    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta;


        conta = repository.findById(numeroDaConta);//buscar o numero da contad

        conta.adicionaSaldo(valor);

        System.out.println("Informa o Número da Conta: " + numeroDaConta);
        System.out.println("Informe o valor de: R$ " + valor);
        System.out.printf("\nO saldo é de R$ " + conta.getSaldo());
        System.out.println("\nTransferência realizada com sucesso!");

    }


}
