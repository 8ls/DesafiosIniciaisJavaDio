package me.dio.desafios;

import java.util.Scanner;

public class ConsumoMedioDeCoxinhas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");

        double media = Double.parseDouble(inputSplit[0])/Double.parseDouble(inputSplit[1]);

        System.out.printf("%.2f", media);
    }
}
