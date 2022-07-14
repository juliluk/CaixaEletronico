package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class PixImpl implements Pix {
    private final MemoriaContaRepository repository;

    public PixImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override
    public double execute(double valor, int numeroDaConta, String chavePix) {
        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.retirarSaldo(valor);

        System.out.println("Pix realizadao!");
        System.out.println("Saldo Atual é de R$" + conta.getSaldo());

        return valor;


    }
}

