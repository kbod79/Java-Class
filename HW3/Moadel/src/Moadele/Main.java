package Moadele;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int delta;
            System.out.println("Enter a , b , c : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            delta = (b * b) - ((4) * (a * c));

            if (delta > 0) {
                float x1;
                x1 = (float) ((-b) + (Math.sqrt(delta)) / (2 / a));

                float x2 = (float) ((-b) - ( Math.sqrt(delta)) / (2 * a));
                System.out.println("javab1: " + x1 + " javab2: " + x2);

            } else if (delta == 0) {
                float yek = ((-b) / (2 * a));
                System.out.println("javab: "+ yek);
            }
            if (delta < 0) {
                System.out.println("Reyshe Nadara");
            }

        }
    }