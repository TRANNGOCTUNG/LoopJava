import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("\n Input n:");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < n - i ; j++){
                System.out.print(" ");
            }
            for(int l = 1; l <= 2 * i -1 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
