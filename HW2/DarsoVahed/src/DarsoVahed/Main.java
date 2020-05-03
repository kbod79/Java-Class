package DarsoVahed;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Name dars:");
        String s = scanner.nextLine();
        DarsoVahed dars=new DarsoVahed();
        switch (s){
            case "Riazi2":
            case "riazi2":
                dars.riazi();
                break;
            case "Fizik2":
            case "fizik2":
                dars.fizik();
                break;
            case "Zaban":
            case "zaban":
                dars.zaban();
                break;
            case "Programming":
            case "programming":
                dars.programming();
                break;
            default:
                System.out.println("name dars ghalat ast");
        }

    }
}
