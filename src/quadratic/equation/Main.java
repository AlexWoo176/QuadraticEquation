package quadratic.equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter number c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("QuadraticEquation has two Root: x1 = %.6f, x2 = %.6f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.printf("QuadraticEquation has one Root: x = %.6f", quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        }
    }
}
