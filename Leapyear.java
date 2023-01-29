import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        int a = sc.nextInt();
        if(a%4==0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Error");
        }


    }
}
