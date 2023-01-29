import java.util.Scanner;

public class Powerof2day5 {
public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                int base;
                int power;
                int result = 1;
                System.out.println("Enter base num = ");
                base= sc.nextInt();
                System.out.println("Enter power = ");
                power= sc.nextInt();
                for(int i=1; i<=power; i++) {
                        result *=base;
                }
                System.out.println("Result: " +result);
        }
}


