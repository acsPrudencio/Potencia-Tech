package org.desafios;

import java.util.*;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        if(s.charAt(0) == '[' && s.charAt(1) == ']'){
            return true;
        } if(s.charAt(0) == '(' && s.charAt(1) == ')'){
            return true;
        }else {
            return false;
        }
    }
}
