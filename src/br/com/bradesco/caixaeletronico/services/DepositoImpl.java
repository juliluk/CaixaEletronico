package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito{

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override
    public void execute(double valor, int numeroDaConta){
        Conta conta;

        conta = repository.findById(numeroDaConta);//buscar o numero da contad

        conta.adicionaSaldo(valor);

        System.out.println("Depositando: " + valor);
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.printf("O saldo é de R$ " + conta.getSaldo());
    }


}
