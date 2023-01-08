import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Draw the triangle");
//                System.out.println("******");
//                System.out.println("*****");
//                System.out.println("****");
//                System.out.println("***");
//                System.out.println("**");
//                System.out.println("*");
                for( int g = 0; g < 6;g++){
                    for(int l = g; l < 6; l++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Draw the triangle");
//                System.out.println("* * * * * *");
//                System.out.println("* * * * * *");
//                System.out.println("* * * * * *");
//                System.out.println("* * * * * *");
//                System.out.println("* * * * * *");
//                System.out.println("* * * * * *");
                for(int i = 0; i < 5 ; i++){
                    for( int j = 0; j <= 5; j++ ){
                        System.out.print("*" + " ");
                    }
                    System.out.println();
            }
                break;
            case 3:
                System.out.println("Draw the rectangle");
//                System.out.println("* * * * * *");
//                System.out.println("* * * * * *");
//                System.out.println("* * * * * *");
                for(int h = 0; h < 3; h ++){
                    for(int k = 0; k < 6; k++){
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Enter your choice:");

        }
    }
}
