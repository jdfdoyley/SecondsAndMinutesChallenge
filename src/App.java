/**
 * Author: Jason D'Oyley
 * Date: Jan 11, 2023
 * Challenge: Seconds and Minutes Challenge
 */

public class App {
    public static void main(String[] args) {
        // Error! - incompatible types: java.lang.String cannot be converted to int
        // System.out.println(getDurationString("Hello"));

        // Invalid Value: Seconds must be an integer whole number and greater than or equal to 0.
        System.out.println(getDurationString(-3));

        // Invalid Value: Minutes must be an integer whole number and greater than or equal to 0.
        System.out.println(getDurationString(-3, 58));

        // Invalid Value: Seconds must be an integer whole number and between 0 and 59 (inclusive).
        System.out.println(getDurationString(120, 60));

        System.out.println(getDurationString(0));                   // 0h 0m 0s
        System.out.println(getDurationString(150, 59));     // 2h 30m 59s
        System.out.println(getDurationString(9020));                // 2h 30m 20s
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value: Seconds ( " + seconds + " ) must be an integer whole number " +
                    "and greater than or equal to 0.";
        }

        return  getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid Value: Minutes ( " + minutes + " ) must be an integer whole number " +
                    "and greater than or equal to 0.";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid Value: Seconds ( " + seconds + " ) must be an integer whole number " +
                    "and between 0 and 59 (inclusive).";
        }

        return "%dh %dm %ds".formatted(minutes / 60, minutes % 60, seconds);
    }
}
