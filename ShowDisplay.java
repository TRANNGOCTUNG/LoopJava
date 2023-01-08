import java.util.Scanner;

public class ShowDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.isosceles triangle");
        System.out.println( "5.Enter your choice:");

        int choice = input.nextInt();
        switch (choice){
            case 1:
                for(int i = 0; i < 3; i++){
                    for(int j = 0 ; j < 7; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i = 1; i <= 5; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 5; i >= 1; i--){
                    for(int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 4:
                for(int i = 0; i < 10; i++){
                    for(int j = 0; j <= 10 - i; j++ ){
                        System.out.print(" ");
                    }
                    for(int h = 0; h <= 2 * i ; h++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Enter your choice:");
        }
    }
}
