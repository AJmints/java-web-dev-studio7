package org.launchcode.studio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        MethodCaller.generateCollection();

        /** Let's make a method to try out Comparator **/
        /** This is the order of items before running the method, sorting in the method, then confirming that things are still sorted after the method has run **/

        int j = 1;
        System.out.println("\nBefore running the Comparator Method\n");
        for (DVD item : Storage.shelfDVD) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;

        MethodCaller.comparatorTests();

        System.out.println("\nLeft the method, and the DVD ArrayList after running the Comparator Method\n");
        for (DVD item : Storage.shelfDVD) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;





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
