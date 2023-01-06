package org.desafios;

import javax.swing.text.html.parser.Parser;
import java.util.*;


public class QuadradosPerfeitos {
    public static void main(String[] args) {
//        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int n = 12;
        int[] d = new int[n + 1];
        List<Integer> numeros = new ArrayList<>();

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        int quadrados = 0;
        for (int i = 1; i<n; i++){
            double sqrt = Math.sqrt(i);
            if (Math.pow(Math.floor(Math.sqrt(i)),2) == i){
                numeros.add(i);
            }
        }

        System.out.println(numeros);
    }
}
