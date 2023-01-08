import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        number = input.nextInt();
            if(number == 2){
                System.out.print( number + "is Not a prime number");
            } else {
                int count = 0;
                int N = 2;
                while(count < number) {
                    if(number % N == 0){
                        System.out.print(number + "is Not a prime number");
                    } else {
                        System.out.println(number + "isa prime number");
                    }
                    count++;
                }
            }
    }
}
