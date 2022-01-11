import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=0, numd=Integer.MIN_VALUE, maxd=0, d=0;
        System.out.println("Please enter the temperature on the first day");
        int firtsTemp= input.nextInt();
        t=firtsTemp;
        while (t<=100){
            System.out.println("Pleese enter today's temperature:");
            t= input.nextInt();
            if (firtsTemp!=t)
                d++;
            else if (maxd<d){
                maxd=d;
                d=0;}
        }
        if (maxd==0)
            System.out.println("-1");
        else System.out.println(maxd);
    }
}
