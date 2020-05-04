package Karbar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String a = scanner.nextLine();
        System.out.println("Enter Your Password: ");
        String b= scanner.nextLine();
        //int b = Integer.parseInt(scanner.nextLine());
        Generic generic = new Generic();
        generic.x = a;
        generic.y = b;
        System.out.println("Name is: " + generic.x);
        System.out.println("Password is: " + generic.y);

        Clone p1 = new Clone();
        //Clone p2=new Clone();
        //Clone p3=new Clone();
        p1.name = a;
        p1.password = b;
        Clone p2 = null;
        Clone p3 = null;

        try {
            p2 = (Clone) p1.clone();
            p3 = (Clone) p1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Clone not supported");
        }
        if (!p1.equals(p2)) {
            System.out.println(p1.name+ '\n' +p1.password );
            System.out.println(p2.name+'\n'+ p2.password);
            System.out.println(p3.name+ '\n'+ p3.password);
            //System.out.println (p1.hairColor);
            //System.out.println (p2.hairColor);
        }
    }
}
