package rewiev1;

public class WorkingWithVariables {
    public static void main(String[] args) {
        //store to
        int number=10;
        //just create
        int num; //declarations of a variable happens only once
        num=100;//initialaze the variable
        num=200; //reasigne the value
        num=2000;
        num=5000;

        System.out.println(num); //5000

        boolean hungry=false;
        hungry=true;
             //hungry="yes";error
        String myString="Hello";
        String name="Artem";
        String address="123 Test Drive";
           //Hello Artem
        System.out.println(myString+" "+name);

        int age=21;
        // Artem is 21 years old
        System.out.println(name +" is "+age+" years old ");
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;
        //December 14
        System.out.println(day+" "+month);

        char date='1';
        System.out.println(date+month);//63
        System.out.println(date+day);

    }
}
