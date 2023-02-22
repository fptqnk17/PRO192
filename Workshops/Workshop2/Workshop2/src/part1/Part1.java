package part1;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cont = false;

        do {
            try {
                int num;

                System.out.println("Enter the number: ");
                num = sc.nextInt();

                if (num < 1) {
                    throw new Exception();
                }

                System.out.println("The number is " + num);

                cont = false;
            } catch (Exception e) {
                System.out.println("The number is invalid");

                cont = true;
            }
        } while (cont);
    }
}
