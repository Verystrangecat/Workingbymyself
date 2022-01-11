import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your id");
        int id = input.nextInt();
        int n1 = id % 10; //last number
        int n2 = (id % 100 - n1) / 10; //7
        int n3 = (id % 1000 - n1 - n2) / 100; //6
        int n4 = (id % 10000 - n1 - n2 - n3) / 1000; //5
        int n5 = (id % 100000 - n1 - n2 - n3 - n4) / 10000; //4
        int n6 = (id % 1000000 - n1 - n2 - n3 - n4 - n5) / 100000; //3
        int n7 = (id % 10000000 - n1 - n2 - n3 - n4 - n5 - n6) / 1000000; //2
        int n8 = (id % 100000000 - n1 - n2 - n3 - n4 - n5 - n6 - n7) / 10000000; //1

        n7=n7*2;
        n7=n7/10+n7%10;
        n5=n5*2;
        n5=n5/10+n5%10;
        n3=n3*2;
        n3=n3/10+n3%10;
        n1=n1*2;
        n1=n1/10+n1%10;
        int sum=n1+n2+n3+n4+n5+n6+n7+n8;
        sum=sum%10;
        sum=10-sum;
        System.out.println(sum);
    }
}