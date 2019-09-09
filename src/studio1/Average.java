package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main (String[] args){

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Type the first number to be averaged.");
        int n2 = ap.nextInt("Type the second number to be averaged.");
        double avg = (double) (n1 + n2) / 2;
        System.out.println("The average for " + n1 + " and " + n2 + " is " + avg + ".");

    }
}
