package DTO;

import validation.Validation;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);

        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        super.output();

        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Is Watercolour: " + this.isWatercolour);
        System.out.println("Is Framed: " + this.isFramed);
    }

    public void inputPainting() {
        super.input();

        System.out.println("Enter height: ");
        this.height = Validation.checkInputIntLimit(0, Integer.MAX_VALUE);
        
        System.out.println("Enter width: ");
        this.width = Validation.checkInputIntLimit(0, Integer.MAX_VALUE);

        System.out.println("Enter isWatercolour: ");
        this.isWatercolour = Validation.getBoolean();
        
        System.out.println("Enter isFramed: ");
        this.isFramed = Validation.getBoolean();
    }
}
