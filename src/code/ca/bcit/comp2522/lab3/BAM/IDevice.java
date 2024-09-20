package ca.bcit.comp2522.lab3.BAM;

public abstract class IDevice {
    private final String purpose;

    // Constructor
    public IDevice(String purpose) {
        this.purpose = purpose;
    }

    // Concrete method
    public String getPurpose() {
        return purpose;
    }

    // Abstract method to print details
    public abstract void printDetails();
}

