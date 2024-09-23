package ca.bcit.comp2522.lab3.BAM;

// Importing the abstract class and interfaces
public abstract class IDevice {

    private final String purpose;

    // Constructor
    public IDevice(final String purpose) {
        this.purpose = purpose;
    }

    // Concrete method
    public String getPurpose() {
        return purpose;
    }

    // Abstract method to print details
    public abstract void printDetails();
}

