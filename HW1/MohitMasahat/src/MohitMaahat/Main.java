package MohitMaahat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        //WR= weight of Rectangle
        //HR= hight of Rectangle
        //WS= weight of square
        System.out.print("Enter Your WR & HR & WS:");
        int wR=scanner.nextInt();
        int hR=scanner.nextInt();
        int wS=scanner.nextInt();
        Shape r1=new Shape (wR,hR,wS);
        System.out.println(" Area Rectangle="+r1.areaR());
        System.out.println(" Perimeter Rectangle="+r1.perimeterR());
        System.out.println("Area Square= "+r1.areaS());
        System.out.println("Perimeter Square= "+r1.perimeterS());
    }
}
