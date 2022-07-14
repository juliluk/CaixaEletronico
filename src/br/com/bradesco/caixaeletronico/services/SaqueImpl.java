package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

//    private final MemoriaContaRepository repository;
//
//    public SaqueImpl(MemoriaContaRepository repository) {
//        this.repository = repository;
//    }


    @Override

    public double execute(double valor, int numeroDaConta) {
//        Conta conta;
//
//        conta = repository.findById(numeroDaConta);//buscar o numero da contad
//
//        conta.adicionaSaldo(valor);
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.println("Sacando o valor de: R$ " + valor);
        System.out.println("Saque realizado com sucesso!");
        return valor;



    }
}


//    if(valor >= 1200){
//        System.out.println("Limite de saque Excedido");
//    } else if (valor <= 500) {
//        System.out.println("Saque no valor de R$: " + valor);
//    } else {
//        System.out.println("Valor indisponivel");
//    }


  //  return valor;


