package review3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 4) {
            System.out.println("Hello");
            i++;
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Are you tired?");

        boolean tired=s.hasNextBoolean();
        while (!tired) {

            System.out.println("This is great");
            System.out.println("Lets stady java");
            System.out.println("Are you tired?");
            tired = s.nextBoolean();
        }
    }
}