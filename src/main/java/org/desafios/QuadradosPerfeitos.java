package org.desafios;

import java.util.*;


public class QuadradosPerfeitos {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
//        int n = 10;
        int[] d = new int[n + 1];
        List<Integer> numeros = new ArrayList<>();

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        int soma = 0;
        for (int i = 1; i<n; i++){
            double sqrt = Math.sqrt(i);
            if (Math.pow(Math.floor(Math.sqrt(i)),2) == i){
                numeros.add(i);
            }
        }
        int somas = n;

        for (int i = 0; i< numeros.size(); i++){
            int aux = n;
            int contador = 0;

            for (int x = i+1; x <= numeros.size(); x++) {
                while (aux - numeros.get(numeros.size()-x) >= 0){
                    aux -= numeros.get(numeros.size()-x);
                    contador++;
                }
            }
            if (contador<somas){
                somas = contador;
            }

        }
        System.out.println(somas);
    }
}
