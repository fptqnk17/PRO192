package GUI;

import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

public class Tester {

    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "honey", "land");
        // go to toString of Colony, toString of BeeColony exist, run it
        System.out.println(obj1);
        
        // run grow of BeeColony
        obj1.grow();
        // run reproduce of BeeColony
        obj1.reproduce();
        
        System.out.println("");
        
        University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
        // go to toString of University, toString of FPTUniversity exist, run it
        System.out.println(obj2);
        
        // run grow of University
        obj2.enroll();
        // run grow of University
        obj2.educate();
        
        System.out.println("");

        Role df = new BeeColony(3000, "wasp", "land");
        // go to toString of BeeColony
        System.out.println(df);
        // go to createWorker of BeeColony
        df.createWorker();
        
        System.out.println("");

        df = new FPTUniversity(100000, "FPT", "Hanoi");
        // go to toString of FPTUniversity
        System.out.println(df);
        // go to createWorker of FPTUniversity
        df.createWorker();
    }
}