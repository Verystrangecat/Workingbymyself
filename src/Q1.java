import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b, p, h, e;
        double lastc=0;
        System.out.println("Please enter your bagrut result:");
        b=input.nextInt();
        if (b>=120)
            System.out.println("Good job! You are accepted");
        else {
            System.out.println("Please enter you psichhometry result");
            p=input.nextInt();
            if (p>=700){
                System.out.println("Please enter your חלק הכמותי grade and your english grade");
                h= input.nextInt();
                e= input.nextInt();
                if (h>=145 && e>=120)
                    System.out.println("Good job! You are accepted");}
            else {
                lastc=p*0.8+b/1.2;
                if (lastc>600)
                    System.out.println("Good job! You are accepted");
            else
                System.out.println("Sorry,you failed");}

            }
        }
    }

