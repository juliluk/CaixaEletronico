package Generics;

import br.com.bradesco.caixaeletronico.model.Conta;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class GenericsList {
//array
    public static void main(String[] args) {
//        int[] nomeDaVariavel = new int[10];//o array não pode ser alterado de tamanho de 10 para 11
//        nomeDaVariavel[0] = 5;
//        nomeDaVariavel[1] = 6;
//        nomeDaVariavel[2] = 7;
//        nomeDaVariavel[4] = 8;
//
//        nomeDaVariavel = "Hello Word!";
//
//        System.out.println(nomeDaVariavel);
//
        List lista = new ArrayList();
        lista.add("Elemento 1");//add
        lista.add(1);
        lista.add(new Conta());

        System.out.println(lista);

        List primos = new ArrayList();
        primos.add(1);



    }
}
