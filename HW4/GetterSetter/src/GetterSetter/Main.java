package GetterSetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Object> list=new ArrayList<>();
        Gneric gneric=new Gneric();
        Score s=new Score();
        System.out.println("Enter your name: ");
        list.add( gneric.x=scanner.nextLine());
        System.out.println("Enter your id: ");
        list.add( gneric.y=scanner.nextLine());
        System.out.println("Enter your fathers name: ");
        list.add(gneric.z=scanner.nextLine());
        System.out.println("Enter score1: ");
        s.setS1(scanner.nextInt());
        System.out.println("Enter score2");
        s.setS2(scanner.nextInt());
        System.out.println("Enter score3");
        s.setS3(scanner.nextInt());
        System.out.println("Enter score4");
        s.setS4(scanner.nextInt());
        System.out.println("Enter score5");
        s.setS5(scanner.nextInt());

        System.out.println("Score1 is:"+s.getS1());
        System.out.println("Score2 is:"+s.getS2());
        System.out.println("Score3 is:"+s.getS3());
        System.out.println("Score4 is:"+s.getS4());
        System.out.println("Score5 is:"+s.getS5());
    }
}
