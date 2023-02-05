package DTO;

import java.util.Scanner;
import validation.Validation;

public class Vase extends Item {

    private int height;
    private String marterial;

    public Vase() {
        super();
    }

    public Vase(int value, String creator, int height, String marterial) {
        super(value, creator);

        this.height = height;
        this.marterial = marterial;
    }

    public int getHeight() {
        return height;
    }

    public String getMarterial() {
        return marterial;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMarterial(String marterial) {
        this.marterial = marterial;
    }

    public void outputVase() {
        super.output();

        System.out.println("Height: " + this.height);
        System.out.println("Marterial: " + this.marterial);
    }

    public void inputVase() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height: ");
        this.height = Validation.checkInputIntLimit(0, Integer.MAX_VALUE);

        System.out.println("Enter marterial: ");
        this.marterial = sc.nextLine();
    }
}
