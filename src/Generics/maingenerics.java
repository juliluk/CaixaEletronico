package Generics;

public class maingenerics {

    public static void main(String[] args) {

        EXEMPLOGENERICS<Integer> inteira = new EXEMPLOGENERICS<>(20);
        inteira.printar();
        EXEMPLOGENERICS<Double> flutuante = new EXEMPLOGENERICS<>(20.0);
        inteira.printar();

    }

}
