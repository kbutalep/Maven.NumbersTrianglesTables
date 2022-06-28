package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String newString = "";
        for (int i = 1; i < numberOfRows; i++) {

            newString += getRow(i) + "\n";
        }
        return newString;
    }

    public static String getRow(int numberOfStars) {
            String newString ="";
            for (int i = 0; i < numberOfStars; i++) {
                newString += "*";
            }
        return newString;
    }

    public static String getSmallTriangle() { return getTriangle(5);
    }

    public static String getLargeTriangle() {return getTriangle(10);
    }
}
