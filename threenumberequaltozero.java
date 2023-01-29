import java.util.Scanner;

public class threenumberequaltozero {
    public static void main(String[] args) {

         int[] arr= { 1,2,3};
        boolean found = false;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                for (int z = 0; z < arr.length; z++) {
                    if (arr[x] +arr[y] +arr[z]==0) {
                        found = true;
                        break;
                    }
                }
            }
        }
        if (found) {
            System.out.println("true");
        } else {
            System.out.println("not found");
        }
    }
}
