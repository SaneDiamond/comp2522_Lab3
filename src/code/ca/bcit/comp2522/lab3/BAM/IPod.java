package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

/**
 * Class that represents an IPod as a "music" type IDevice that
 * stores an amount of songs and has a current max volume in dB.
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 */
public class IPod extends IDevice {
    private static final int MIN_SONGS = 0;
    private static final double MIN_VOLUME_DB = 0.0f;
    private static final double MAX_VOLUME_DB = 100.0f;

    private final int songsStored;
    private final double currMaxVolumeDb;

    /**
     * Creates an IPod object based on amount of songs stored and
     * max volume in DB.
     *
     * @param songsStored       amount of songs stored
     * @param currMaxVolumeDb   max volume in decibels
     */
    public IPod(final int songsStored,
                final double currMaxVolumeDb) {
        super("music");
        validateSongs(songsStored);
        validateMaxVolume(currMaxVolumeDb);

        this.songsStored = songsStored;
        this.currMaxVolumeDb = currMaxVolumeDb;
    }

    /**
     * Checks if two IPod objects are the same.
     *
     * @param compareIPodObj IPod object to be compared to
     * @return true if compareIPodObj has the same amount of songs stored
     */
    @Override
    public boolean equals(final Object compareIPodObj) {
        if (compareIPodObj == null) {
            return false;
        }

        if (compareIPodObj == this) {
            return true;
        }

        if (!(compareIPodObj instanceof IPod)) {
            return false;
        }

        final IPod compareIPod;
        final boolean equals;

        compareIPod = (IPod) compareIPodObj;
        equals = this.songsStored == compareIPod.songsStored;

        return equals;
    }

    /**
     * Creates a unique hash code based on the songs stored in
     * the IPod.
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(songsStored);
    }

    /**
     * Prints the details of the IPod in the console.
     */
    @Override
    public void printDetails() {
        System.out.println(this);
    }

    /**
     * Returns a String representation of IPod's details with song count
     * and current max volume.
     *
     * @return details about the IPod
     */
    @Override
    public String toString() {
        final StringBuilder iPodStrBuilder;
        final String iDeviceString;
        final String iPodStr;

        iPodStrBuilder = new StringBuilder();
        iDeviceString = super.toString();

        iPodStrBuilder.append(iDeviceString)
                .append("Ipad. Songs: ")
                .append(songsStored)
                .append("Volume: ")
                .append(currMaxVolumeDb)
                .append("dB");

        iPodStr = iPodStrBuilder.toString();
        return iPodStr;
    }

    // Validates the song stored to not be below MIN_SONGS
    private static void validateSongs(final int songsStored) {
        if (songsStored < MIN_SONGS) {
            throw new IllegalArgumentException("Minimum amount of songs is " +
                    MIN_SONGS + ". You have " + songsStored + " songs.");
        }
    }

    // Validates the current volume in dB to be between a range of
    // MIN_VOLUME_DB and MAX_VOLUME_DB
    private static void validateMaxVolume(final double curVolumeDb) {
        if (curVolumeDb < MIN_VOLUME_DB) {
            throw new IllegalArgumentException("The minimum volume is " +
                    MIN_VOLUME_DB + "dB. You have " + curVolumeDb + "dB.");
        } else if (curVolumeDb > MAX_VOLUME_DB) {
            throw new IllegalArgumentException("The maximum volume is " +
                    MAX_VOLUME_DB + "dB. You have " + curVolumeDb + "dB.");
        }
    }

}
