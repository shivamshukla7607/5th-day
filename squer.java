import java.util.Scanner;

public class squer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B= sc.nextInt();
        int[][]X=new int[A][B];
        for(int i=0; i< X.length; i++) {
            for(int j=0; j< X.length; j++) {
                System.out.println(X[A][B]+ "  ");
            }
            System.out.println();
        }
    }
}
