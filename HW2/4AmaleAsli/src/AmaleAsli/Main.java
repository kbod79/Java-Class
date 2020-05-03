package AmaleAsli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two number");
        int x =scanner.nextInt();
        int y =scanner.nextInt();
        System.out.println("jam is:"+ (x+y));
        System.out.println("tafrigh is"+(x-y));
        System.out.println("zarb is:"+ (x*y));
        System.out.println("taghsim is"+ (x/y));
    }
}
