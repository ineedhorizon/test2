package ru.gost.interview.issueone;

public class TwoSevenPrinter {

    public static final int TWO = 2;
    public static final int SEVEN = 7;

    /**
     * Print numbers from {@param start} to {@param end},
     * instead numbers of multiples of 2 print "Two"
     * instead numbers of multiples of 7 print "Seven"
     * instead numbers of multiples both of 2 and 7 print "TwoSeven"
     *
     * @param start
     * @param end
     */
    public void print(int start, int end) {
        int fourteen = TWO * SEVEN;

        for (int i = start; i <= end; ++i) {
            if (i % fourteen == 0) {
                System.out.println("TwoSeven");
            } else if (i % TWO == 0) {
                System.out.println("Two");
            } else if (i % SEVEN == 0) {
                System.out.println("Seven");
            } else {
                System.out.println(i);
            }
        }
    }
}
