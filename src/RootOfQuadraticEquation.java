import java.util.Scanner;

public class RootOfQuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Finding the root of ax^2+bx+c=0");
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Value a:");
        a = sc.nextDouble();
        System.out.print("Value b:");
        b = sc.nextDouble();
        System.out.print("value c:");
        c = sc.nextDouble();

        double determinant = b*b - 4*a*c;

        if (determinant > 0){
            System.out.println("There are 2 real root");
            double root1 = (-b + Math.sqrt(determinant))/(2*a);
            System.out.println("Root 1: " + root1);
            double root2 = (-b - Math.sqrt(determinant))/(2*a);
            System.out.println("Root 2: " + root2);
        }else if (determinant == 0){
            double oneRoot = -b/(2*a);
            System.out.println("There is 1 root: " + oneRoot);
        }else {
            System.out.println("There is no real root.");
        }
    }
}
