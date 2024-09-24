package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

/**
 * Represents an iPhone, a type of IDevice specifically designed for talking.
 * It includes phone plan minutes and a phone carrier.
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 */
public class IPhone extends IDevice {

    private static final int PHONE_PLAN_MINS_MIN = 0;

    public final double phonePlanMins;

    public final String phoneCarrier;

    /**
     * Constructs a new IPhone with specified phone plan minutes and carrier.
     *
     * @param phonePlanMins the number of minutes in the phone plan, must be non-negative
     * @param phoneCarrier the carrier for the phone, must not be null
     * @throws IllegalArgumentException if phonePlanMins is negative or phoneCarrier is null
     */
    public IPhone(final double phonePlanMins, final String phoneCarrier) {
        super("talking");

        validatePhonePlanMins(phonePlanMins);
        validatePhoneCarrier(phoneCarrier);

        this.phonePlanMins = phonePlanMins;
        this.phoneCarrier = phoneCarrier;
    }

    /**
     * Retrieves the purpose of the iPhone.
     *
     * @return a String indicating the purpose of this iDevice
     */
    @Override
    public String getPurpose() {
        return "the purpose of this iDevice is “talking”";
    }

    /**
     * Prints the details of the iPhone.
     */
    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    /**
     * Returns a string representation of the iPhone, including its phone plan minutes
     * and carrier.
     *
     * @return a String representing the iPhone's details
     */
    @Override
    public String toString() {
        StringBuilder iPhoneStrBuilder;
        String iDeviceString;
        String iPhoneStr;

        iPhoneStrBuilder = new StringBuilder();
        iDeviceString = super.toString();

        iPhoneStrBuilder.append(iDeviceString)
                .append("iPhone. Phone plan minutes: ")
                .append(phonePlanMins)
                .append(". Phone carrier is: ")
                .append(phoneCarrier);

        iPhoneStr = iPhoneStrBuilder.toString();
        return iPhoneStr;
    }

    /**
     * Checks if this iPhone is equal to another object.
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
        final boolean equals;
        int compared;
        compareObjIPhone = (IPhone) compareObj;

        compared = Double.compare(this.phonePlanMins, compareObjIPhone.phonePlanMins);

        return compared == 0;
    }

    /**
     * Returns a hash code value for the iPhone.
     *
     * @return an int hash code for the iPhone
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(phonePlanMins);
    }

    /**
     * Validates the phone plan minutes to ensure they are non-negative.
     *
     * @param phonePlanMins the phone plan minutes to validate
     * @throws IllegalArgumentException if phonePlanMins is negative
     */
    private static void validatePhonePlanMins(final double phonePlanMins) {
        if (phonePlanMins < PHONE_PLAN_MINS_MIN) {
            throw new IllegalArgumentException("Phone plan minutes must be greater than zero");
        }
    }

    /**
     * Validates the phone carrier to ensure it is not null.
     *
     * @param phoneCarrier the phone carrier to validate
     * @throws IllegalArgumentException if phoneCarrier is null
     */
    private static void validatePhoneCarrier(final String phoneCarrier) {
        if (phoneCarrier == null) {
            throw new IllegalArgumentException("Phone carrier must not be null");
        }
    }
}
