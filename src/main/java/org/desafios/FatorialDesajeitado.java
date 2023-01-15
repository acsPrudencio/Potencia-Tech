package org.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        int temp = 0;

        List<Integer> numeros = new ArrayList<>();


        while (n >= 3) {
            temp = n * (n - 1) / (n - 2);
            n -= 3;
            numeros.add(numeros.isEmpty() ? temp : temp * -1);
            numeros.add(n--);
        }

        if (n == 2){
            temp = n * (n - 1);
            numeros.add(temp*(-1));
        }else if (n == 1){
            numeros.add(n*(-1));
        }

        int resultado = numeros.stream().mapToInt(Integer::valueOf).sum();


        System.out.println(resultado);
    }
}
