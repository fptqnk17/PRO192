package part2;

import java.util.Scanner;

public class Part2_2 {

    private static Scanner sc = new Scanner(System.in);
    private static String pattern = "[SE][\\d]{3}";

    public String inputString() throws Exception {
        System.out.println("Input the string: ");

        String s = sc.nextLine();

        if (!s.matches(pattern)) {
            throw new Exception();
        }

        return s;
    }

    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();

        boolean cont = false;

        do {
            try {
                System.out.println("The string is " + obj.inputString());

                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");

                cont = true;
            }
        } while (cont);
    }
}
