package Daneshjo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
            System.out.println("Enter ID:");
            int id=Integer.parseInt(scanner.nextLine());
            System.out.println("Enter name:");
            String name=scanner.nextLine();
            System.out.println("Enter score:");
            int score=Integer.parseInt(scanner.nextLine());

            Map map=new HashMap<>();

            map.put("id", Integer.valueOf(id));
            map.put("name", name);
            map.put("score",Integer.valueOf(score));

            System.out.println("your id is: "+ map.get("id"));
            System.out.println("your name is: "+ map.get("name"));
            System.out.println("your score is: "+ map.get("score"));

    }
}
