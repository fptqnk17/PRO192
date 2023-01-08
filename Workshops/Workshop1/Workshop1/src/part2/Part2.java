package part2;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1;
        float num2;
        String op;

        System.out.println("Input the number 1: ");
        num1 = sc.nextFloat();

        System.out.println("Input the number 2: ");
        num2 = sc.nextFloat();

        System.out.println("Input the operator: ");
        sc = new Scanner(System.in);
        op = sc.nextLine();

        if (op.equals("+")) {
            System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 * num2));
        } else if (op.equals("/")) {
            if (num2 != 0) {
                System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by 0");
            }
        }

    }
}
