package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    //this is a boolean method that returns integers whos modulator of 2 is not zero..thus not even
    public static boolean isEven(int n) { return (n % 2 ==0);}


    public static String getEvenNumbers(int start, int stop) {

        //create a String builder and then use a for loop to append the even numbers together using to toString

        StringBuilder sb = new StringBuilder();
        // iterates from start to stop (not including stop)
        for (int i = start; i<stop; i++) {
        //iteration is called in isEven method and appends only the even ones
            //im confused the test wants the odd numbers?
                if (!isEven(i)) {
                sb.append(i);
            }
        }
        // method to create the final string object representation
        return sb.toString();
    }


    //as per test im actually going to get the even numbers
    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i=start; i<stop;i++) {
            if (isEven(i)){
                sb.append(i);
            }
        }
        return sb.toString();
    }

    //we can call getExp method and add '2' for the power
    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step,2);
    }

    //test code actually wants range until stop
    public static String getRange(int start) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<start; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for (int i=start; i<stop; i++) {
            sb.append(i);
        }
        return sb.toString();

    }

    //1 in 4th arguement bc can imagine exponent of 1
    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop,step,1);
    }

    //kris said could help with cleaner code if you start with the harder cases bc could call it into the related cases above
    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder sb = new StringBuilder();
        //not iteration by 1, iterating by step
        for (int i = start; i < stop; i+= step) {
            //use Math.pow for exponential, results in a double so cast it to an int to truncate the decimal
            sb.append((int) Math.pow(i, exponent));
        }
        return sb.toString();
    }
}

