package Convertisseur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Convert();
    }

    private static void Convert() {
        Scanner temp = new Scanner(System.in);

        System.out.println("Convert: ");
        System.out.println("F : Fahrenheit -> Celsius");
        System.out.println("C : Celsius ->  Fahrenheit ");

        System.out.print("Choix: ");
        String rep = temp.nextLine();

        switch (rep) {
            case "F" -> {
                System.out.print("Temp: ");
                int respF = temp.nextInt();
                FtoC(respF);
            }
            case "C" -> {
                System.out.print("Temp: ");
                int respC = temp.nextInt();
                CtoF(respC);
            }
            default -> {
                System.out.print("Erreur Input");
            }
        }
    }

    private static void FtoC(int temp) {
        int C = ((temp - 32) * 5) / 9;
        System.out.print("C: " + C);
    }

    private static void CtoF(int temp) {
        int F = (9 / 5) * temp + 32;
        System.out.print("C: " + F);
    }
}

