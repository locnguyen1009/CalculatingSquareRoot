import java.util.Scanner;

public class CalculatingSquareRoot {
    public static void main(String[] args) {
        double number;
        System.out.print("Enter a number?");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextDouble();

        while(number <=0){
            System.out.println("Invalid Entry. Please enter again");
            number = scanner.nextDouble();
        }

        double numberSquareRoot = Math.sqrt(number);
        System.out.println("The square root of number " + number + " is " + numberSquareRoot);
    }
}
