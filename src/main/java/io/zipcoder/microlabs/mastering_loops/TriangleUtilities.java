package io.zipcoder.microlabs.mastering_loops;

import java.util.SplittableRandom;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <numberOfStars;i++){
            sb.append("*");
        }
        return sb.toString();
    }



    public static String getTriangle(int numberOfRows) {

        StringBuilder sb = new StringBuilder();

        //rows start at 1, and as numberofstars is called, we increase intStar by one
        // while int star is less than the value given for numberOfRows
        int intStar =1;
        while (intStar < numberOfRows) {
        //the Row is being stored in thisRow
            String thisRow = getRow(intStar);
            //appending this row and then again appending \n
            sb.append(thisRow).append("\n");
            //counter at the end bc after row appended ^ while loop reapeated until intStar r
            //reaches the input-1 for numberOfRows
            intStar++;
        }
        return sb.toString();
    }


    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
