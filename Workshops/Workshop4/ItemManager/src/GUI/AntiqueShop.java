package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

public class AntiqueShop {

    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }

        System.out.println("Choice 1.." + options.length + ": ");

        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        String[] options = {
            "Create a Vase",
            "Create a Statue",
            "Create a Painting",
            "Display the Item"
        };

        Item item = null;
        int choice = 0;

        Scanner sc = new Scanner(System.in);

        do {

            choice = getChoice(options);

            switch (choice) {
                case 1 -> {
                    item = new Vase();
                    ((Vase) item).inputVase();
                }

                case 2 -> {
                    item = new Statue();
                    ((Statue) item).inputStatue();
                }

                case 3 -> {
                    item = new Painting();
                    ((Painting) item).inputPainting();
                }

                case 4 -> {
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object");
                    }
                }
            }
        } while (choice <= 4);
    }
}
