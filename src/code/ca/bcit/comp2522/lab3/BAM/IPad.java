package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

/**
 * IPad
 *
 * @author Ben, Andre, Marcus BAM BAM
 * Version 1.0
 */
public class IPad extends IDevice {
    private final boolean hasCase;
    private final String systemVersion;

    /**
     * Constructs an IPad with a case status and system version.
     *
     * @param hasCase whether the iPad has a case
     * @param systemVersion the version of the iPad system
     */
    public IPad(final boolean hasCase, final String systemVersion) {
        super("learning");
        // Remember to validate
        systemVersionValidation(systemVersion);
        this.hasCase = hasCase; // Removed the unnecessary validation method
        this.systemVersion = systemVersion;
    }

    /**
     * Validates the system version.
     *
     * @param systemVersion the version of the system
     */
    private static void systemVersionValidation(final String systemVersion) {
        if (systemVersion == null || systemVersion.isEmpty()) {
            throw new IllegalArgumentException("System version cannot be null or empty");
        }
    }

    /**
     * Returns the purpose of the device.
     *
     * @return the purpose of this iDevice as a string
     */
    public String getPurpose() {
        return "The purpose of this iDevice is learning.";
    }

    /**
     * Returns details of the iPad.
     *
     * @return details of the iPad as a string
     */
    public String getDetails() {
        return toString();
    }

    /**
     * Prints the details of the iPad.
     */
    public void printDetails() {
        System.out.println(toString());
    }

    /**
     * Retrieves the details of the iPad as a String.
     *
     * @return a string representing whether it has a case and the system version
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Do we have a case? ")
                .append(this.hasCase)
                .append(", system version: ")
                .append(this.systemVersion);
        return str.toString();
    }

    /**
     * Compares the system version of two iPads.
     *
     * @param obj the object to compare to
     * @return true if the system versions are the same, false otherwise
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final IPad other = (IPad) obj;
        return systemVersion.equalsIgnoreCase(other.systemVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemVersion);
    }
}
