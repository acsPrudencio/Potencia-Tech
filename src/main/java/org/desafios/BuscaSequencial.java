package org.desafios;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        String msg = "";
        for (int i = 0; i < elementos.length; i++) {
            if (num == elementos[i]) {
                msg += ("Achei " + num + " na posicao " + i);
            }
        }
        if (msg.isEmpty()) {
            msg += ("Numero " + num + " nao encontrado!");
        }
        System.out.println(msg);

    }
}
