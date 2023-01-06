package org.desafios;

import java.util.Scanner;

public class ChecagemDePalindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
        StringBuilder palavraReverse = new StringBuilder(palavra);
        if (palavraReverse.reverse().toString().equals(palavra)){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }
}
