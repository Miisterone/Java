package fr.Joris;

import java.util.Scanner;

public class Main {
    private static Car A;

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Color: ");
        String color = sc.nextLine();

        System.out.print("Diameter(float): ");
        float diameter = sc.nextFloat();


        System.out.print("Speed(float): ");
        float speed = sc.nextFloat();

        A = new Car();
        A.Car(brand,color,diameter,speed);
    }

    public static void getInfo(){
        if (A == null){
            System.out.println("No car.Build one");
            return;
        }
        A.getAllInfo();
    }

    public static void getInfoWheel(){
        if (A == null){
            System.out.println("No car.Build one");
            return;
        }
        A.getAllInfoRoue();
    }
}
