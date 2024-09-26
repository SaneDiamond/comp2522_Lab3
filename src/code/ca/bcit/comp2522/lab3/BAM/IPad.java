package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

/**
 * IPad
 *
 * @author Ben, Andre, Marcus BAM BAM
 * @version 1.0
 */
public class IPad extends IDevice {
    private final boolean iPadCase;
    private final String systemVersion;

    /**
     * Constructs an IPad with a case status and system version.
     *
     * @param iPadCase whether the iPad has a case
     * @param systemVersion the version of the iPad system
     */
    public IPad(final boolean iPadCase,
                final String systemVersion) {
        super("learning");
        systemVersionValidation(systemVersion);
        this.iPadCase = iPadCase;
        this.systemVersion = systemVersion;
    }

    /**
     * Returns the purpose of the device.
     *
     * @return the purpose of this iDevice as a string
     */
    @Override
    public String getPurpose() {
        return "The purpose of this iDevice is learning.";
    }

    /**
     * Prints the details of the iPad.
     */
    public void printDetails() {
        System.out.println(this);
    }

    /**
     * Retrieves the details of the iPad as a String.
     *
     * @return a string representing whether it has a case and the system version
     */
    @Override
    public String toString() {
        final StringBuilder str;
        str = new StringBuilder();

        str.append("Do we have a case? ")
                .append(this.iPadCase)
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
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof IPad)) {
            return false;
        }

        final IPad other;
        final boolean equals;

        other = (IPad) obj;
        equals = Objects.equals(this.systemVersion, other.systemVersion);
        return equals;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(systemVersion);
    }

    /**
     * Validates the system version.
     *
     * @param systemVersion the version of the system
     */
    private static void systemVersionValidation(final String systemVersion) {
        if (systemVersion == null || systemVersion.isEmpty() || systemVersion.isBlank()) {
            throw new IllegalArgumentException("System version cannot be null or empty");
        }
    }
}
