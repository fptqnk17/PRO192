package DTO;

public class FPTUniversity extends University implements Role {

    private String address;

    public FPTUniversity() {
        super();
    }

    public FPTUniversity(int size, String name, String address) {
        super(size, name);

        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

    @Override
    public void createWorker() {
        System.out.println("providing human resources");
    }
}
