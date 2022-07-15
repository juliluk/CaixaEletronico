package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

    private final Saque saque;

    private final Deposito deposito;

    private final AbrirConta abrirConta;

    private final Transferencia transferencia;

    private final Pix pix;



    public ExecutarComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new DepositoImpl(repository);
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.transferencia = new TransferenciaImpl(repository);
        this.pix = new PixImpl(repository);


    }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Encerrando o programa");
            resultado = false;
        } else if (comando == 1) {
            System.out.println("Digite o numero da Conta");
            int numero = entrada.nextInt();

            System.out.println("Informe valor de Saque");
            double valor = entrada.nextDouble();
            this.saque.execute(valor,numero);

        } else if (comando == 2) {
            System.out.println("Digite o numero da Conta");
            int numero = entrada.nextInt();

            System.out.println("Informe valor de deposito");
            double valor = entrada.nextDouble();
            this.deposito.execute(valor,numero);

            System.out.println("\nDepósito realizado!");

        } else if (comando == 3) {
            abrirConta.execute();

        } else if (comando == 4) {

            System.out.println("Informe o numero da Conta");
            int numero = entrada.nextInt();

            System.out.println("Informe o valor ");
            double valor = entrada.nextDouble();
            this.transferencia.execute(valor, numero);

        } else if (comando == 5) {
            System.out.println("Digite o número da conta: ");
            int numeroDaConta = entrada.nextInt();

            System.out.println("Digite a chave pix do favorecido: ");
            String chavePix = entrada.next();

            System.out.println("Digite o valor a ser transferido: ");
            double valor = entrada.nextInt();

            this.pix.execute( valor, numeroDaConta,chavePix);



        } else {
            System.out.println("Comando Inválido");
        }

        return resultado;


    }

}
