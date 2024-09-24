package ca.bcit.comp2522.lab3.BAM;

/**
 * Abstract class representing a generic device.
 * This class provides a purpose for the device and an abstract method
 * for printing its details.
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 */
public abstract class IDevice {

    private final String purpose;

    /**
     * Constructs a new IDevice with the specified purpose.
     *
     * @param purpose a String describing the purpose of the device
     */
    public IDevice(final String purpose) {
        this.purpose = purpose;
    }

    /**
     * Retrieves the purpose of the device.
     *
     * @return a String representing the purpose of the device
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Abstract method to print details of the device.
     * This method must be implemented by subclasses to provide
     * specific details about the device.
     */
    public abstract void printDetails();
}
