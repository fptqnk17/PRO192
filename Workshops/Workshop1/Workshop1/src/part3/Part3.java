package part3;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        String[] list = new String[10];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the student name: ");
            list[i] = sc.nextLine();
            
            list[i] = list[i].toUpperCase();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("The student name: " + list[i]);
        }
    }
}