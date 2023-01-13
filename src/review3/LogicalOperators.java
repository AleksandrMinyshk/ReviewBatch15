package review3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=true;
        if(loginButtonDisplayed && loginButtonClickable){
            System.out.println("good");

        }else{
            System.out.println("bad");
        }
        System.out.println("*************");
        boolean dB=true;
        String  message="Hello";
        if(dB|| message.equals("Welcome Admin")){
            System.out.println("good");
        }else{
            System.out.println("bad");
        }
        System.out.println("Logocal Not");

        boolean b=true;
        System.out.println(!true);

        boolean acb=true;

        if(!acb){
            System.out.println("click on check box");
        }
        System.out.println("click on submit button");
        System.out.println("***********");


    }
}
