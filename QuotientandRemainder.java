import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Divident ");
        int p= sc.nextInt();
        Scanner wc =new Scanner(System.in);
        System.out.println("Enter Diviser  ");
        int q= wc.nextInt();

        int Quotient= p / q;
        int Remainder= p % q;
        System.out.println("Quotient =" + Quotient);
        System.out.println("Remainder = " + Remainder);

    }
    }

