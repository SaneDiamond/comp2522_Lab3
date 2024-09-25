package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

/**
 * Represents an iPhone 16, a specific model of IPhone that includes
 * additional features such as a high-resolution camera and memory capacity.
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 */
public class IPhone16 extends IPhone {

    private static final int MEMORY_GIG_MIN = 0;

    public final boolean highResCam;

    public final int memoryGig;

    /**
     * Constructs a new IPhone16 with specified phone plan minutes, carrier,
     * high-resolution camera capability, and memory size.
     *
     * @param phonePlanMins the number of minutes in the phone plan, must be non-negative
     * @param phoneCarrier the carrier for the phone, must not be null
     * @param highResCam indicates if the iPhone has a high-resolution camera
     * @param memoryGig the memory capacity in gigabytes, must be greater than zero
     * @throws IllegalArgumentException if phonePlanMins is negative, phoneCarrier is null,
     *                                  or memoryGig is not greater than MEMORY_GIG_MIN
     */
    public IPhone16(final double phonePlanMins, final String phoneCarrier,
                    final boolean highResCam, final int memoryGig) {
        super(phonePlanMins, phoneCarrier);

        validateMemoryGig(memoryGig);

        this.highResCam = highResCam;
        this.memoryGig = memoryGig;
    }

    /**
     * Returns a string representation of the iPhone 16, including its features
     * such as phone plan minutes, carrier, high-resolution camera status,
     * and memory size.
     *
     * @return a String representing the details of the iPhone 16
     */
    @Override
    public String toString() {
        StringBuilder iPhone16;
        String iDeviceStr;
        String iPhone16Str;

        iPhone16 = new StringBuilder();
        iDeviceStr = super.toString();

        iPhone16.append(iDeviceStr)
                .append("This iPhone having a high-resolution camera is: ")
                .append(highResCam)
                .append(". The amount of memory in the phone is: ")
                .append(memoryGig);
        iPhone16Str = iPhone16.toString();
        return iPhone16Str;
    }

    /**
     * Checks if this iPhone 16 is equal to another object.
     *
     * @param compareObj the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object compareObj) {
        if (compareObj == null) {
            return false;
        }

        if (!(compareObj instanceof IPhone)) {
            return false;
        }

        if (compareObj == this) {
            return true;
        }

        final IPhone compareObjIPhone;
        compareObjIPhone = (IPhone) compareObj;

        // Compare the specific properties of IPhone16
        return this.phonePlanMins == compareObjIPhone.phonePlanMins;
    }

    /**
     * Returns a hash code value for the iPhone 16.
     *
     * @return an int hash code for the iPhone 16
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(phonePlanMins);
    }

    /**
     * Validates the memory capacity to ensure it is greater than zero.
     *
     * @param memoryGig the memory capacity to validate
     * @throws IllegalArgumentException if memoryGig is not greater than MEMORY_GIG_MIN
     */
    private static void validateMemoryGig(final int memoryGig) {
        if (memoryGig <= MEMORY_GIG_MIN) {
            throw new IllegalArgumentException("memoryGig must be greater than " + MEMORY_GIG_MIN);
        }
    }
}
