package ca.bcit.comp2522.lab3.BAM;
import java.util.Objects;

/**
 * IPAD
 *
 * @author Ben,Andre,Marcus
 * Version 1.0
 */
public class IPad extends IDevice {
    private final boolean hasCase;
    private final String systemVersion;

    public IPad(final boolean hasCase ,final String systemVersion) {
        super("learning");
        //remember to validate
        systemVersionValidation(systemVersion);
        hasCaseValidation(hasCase);

        this.systemVersion = systemVersion;
        this.hasCase = hasCase;
    }

    /**
     * Validating the system version
     *
     * @param systemVersion the version of the system
     */
    private static void  systemVersionValidation(final String systemVersion) {
        if (systemVersion == null || systemVersion.isEmpty()) {
            throw new IllegalArgumentException("System version cannot be null");
        }
    }

    /**
     * Validating the case of the ipad
     *
     * @param hasCase check the case
     */
    private static void hasCaseValidation(final boolean hasCase) {
        if (!hasCase) {
            throw new IllegalArgumentException("hasCase cannot be null");
        }
    }
    public String getPurpose(){

        return "the purpose of this iDevice is “learning”";
    }

    public String getDetails(){
        return toString();
    }
    public void printDetails(){
        System.out.println(toString());
    }
    /**
     * Retrieves the details of the ipad as a String.
     *
     * @return an appended string
     */
    @Override
    public String toString() {
        StringBuilder str =  new StringBuilder();

        str.append("Do we have case? ")
                .append(this.hasCase)
                .append(" system version: ")
                .append(this.systemVersion);
        return str.toString();
    }


    /**
     * Comapares the version of two ipads
     *
     * @param version the version of the IPAD
     * @return a comparison of two ipad version
     */
    @Override
    public boolean equals(final Object version) {
        if (version == null){
            return false;
        }
        if (!(version instanceof IPad)){
            return false;
        }
        if (version == this){
            return true;
        }
        // cast
        final IPad version1 = (IPad) version;
        return systemVersion.equalsIgnoreCase(version1.systemVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode("0");
    }
}
