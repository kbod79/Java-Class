package Daneshjo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter zarib takhasosi:");
        int zaribT=scanner.nextInt();
        System.out.println("Enter zarib omomi:");
        int zaribO=scanner.nextInt();
        System.out.println("Enter score takhasosi:");
        int scoreT=scanner.nextInt();
        System.out.println("Enter score omomi:");
        int scoreO=scanner.nextInt();
        String moadel1 ;
        Score nomre=new Score(zaribT,zaribO,moadel1);

        System.out.println("nomre takhasosi is "+ nomre.takhasosi());
        System.out.println("nomre omomi is: "+ nomre.omomi());
        System.out.println("moadel is: "+ nomre.moadel);
    }
}
