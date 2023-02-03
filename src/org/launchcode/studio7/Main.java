package org.launchcode.studio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MethodCaller.generateCollection();



        /** Let's make a method to try out Comparator **/
        /** This is the order of items before running the method, sorting in the method, then confirming that things are still sorted after the method has run **/

        int j = 1;
        System.out.println("\nBefore running the Comparator Method, sorting based on total time.");
        for (DVD item : Storage.shelfDVD) {
            System.out.println(j + ": " + item.getDiscName() + "  ||  Total Movie Time: " + item.getTotalTime());
            j++;
        }
        j = 1;

        MethodCaller.comparatorTestsDVD();

        System.out.println("\nLeft the method. This is the DVD ArrayList from Main after running the Comparator Method");
        for (DVD item : Storage.shelfDVD) {
            System.out.println(j + ": " + item.getDiscName() + "  ||  Total Movie Time: " + item.getTotalTime());
            j++;
        }
        j = 1;


        /** Included a duplicate CD to see how comparator would behave **/
        /** Other comparator Test sort based on name. Uncomment to see in action. **/
//        MethodCaller.comparatorTestsDisc();
//        MethodCaller.comparatorTestsCD();


        /** This method is testing the Iterator Class **/
        MethodCaller.iteratorTest();







        /** Unorganized collection of DVDs and CDs **/
//        Storage.getShelfContents();

        /** Display the RPM of each disc **/
//        MethodCaller.getAllCollectionSpinSpeed();

        /** Get track details based on album name input **/
//        MethodCaller.getTrackDetails("Bon Iver");

        /** Get individual disc spin speed based on title of disc input **/
//        MethodCaller.getDiscSpinSpeed("Die Hard");















    }
}
