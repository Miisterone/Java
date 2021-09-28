package fr.Joris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Voiture A = new Voiture();
        A.Voiture("test",20);
    }

    private static void Convert(){
        Scanner temp = new Scanner(System.in);

        System.out.println("Convert: ");
        System.out.println("F : F -> C");
        System.out.println("C : C ->  F");

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
        }
    }

    private static void FtoC(int temp){
        int C = ((temp - 32)*5) / 9;
        System.out.print("C: "+C);
    }
    private static void CtoF(int temp){
        int F = (9/5) * temp + 32;
        System.out.print("C: "+F);
    }
}
