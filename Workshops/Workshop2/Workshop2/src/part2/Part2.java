package part2;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cont = false;
        do {
            try {
                System.out.println("Enter the string: ");
                String s = sc.nextLine();

                if (!s.matches("[SE][\\d]{3}")) {
                    throw new Exception();
                }

                System.out.println("The string is " + s);

                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");

                cont = true;
            }
        } while (cont);
    }
}
