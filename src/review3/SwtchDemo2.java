package review3;

import java.util.Locale;
import java.util.Scanner;

public class SwtchDemo2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter favorite browser");
        String browser=s.nextLine();

        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "safari":
                System.out.printf("Test case executed in "+browser);
                break;
            case "microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is un know");
        }

    }
}
