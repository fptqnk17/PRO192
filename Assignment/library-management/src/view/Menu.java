package view;

import utils.Validation;
import java.util.ArrayList;

public abstract class Menu<T> {

    private String title;
    private ArrayList<T> options;
    private boolean isStop;

    public Menu() {
        this.isStop = false;
    }

    public Menu(String title, String[] options) {
        this.title = title;

        this.options = new ArrayList<>();

        for (var option : options) {
            this.options.add((T) option);
        }
        
        this.isStop = false;
    }

    public void display() {
        System.out.println(this.title);

        System.out.println("--------------------------------");

        for (int i = 0; i < this.options.size(); i++) {
            System.out.println((i + 1) + "." + this.options.get(i));
        }

        System.out.println("--------------------------------");
    }

    public int getSelected() {
        this.display();

        return Validation.getInt("Enter selection: ", 1, this.options.size());
    }

    public abstract void execute(int choice);
    
    protected void stop() {
        this.isStop = true;
    }

    public void run() {
        while (!this.isStop) {
            int choice = getSelected();

            this.execute(choice);

            if (choice > this.options.size()) {
                break;
            }
        }
    }
}
