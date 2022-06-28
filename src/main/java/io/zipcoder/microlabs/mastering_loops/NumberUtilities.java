package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumString = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenNumString += Integer.toString(i);
            }
        }
        return evenNumString;
    }

    public static String getOddNumbers(int start, int stop) {
        String oddNumString = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddNumString += Integer.toString(i);
            }
        }
        return oddNumString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(Integer.toString((i * i)));
        }
        return str.toString();
    }
    public static String getRange(int stop) {
        return NumberUtilities.getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        String myString = "";
        for(int i = start; i < stop; i++){
            myString += Integer.toString(i);
        }
        return myString;
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(i);
        }
        return str.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String myString = "";
        for (int i = start; i < stop; i += step){
            myString = myString + String.valueOf((int) Math.pow(i, exponent));
        }
        return myString;
    }
}
