package org.desafios;

import java.util.Scanner;

public class OsNumerosSaoIguais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        System.out.println(numero1==numero2?"Sao iguais!":"Nao sao iguais!");
    }
}