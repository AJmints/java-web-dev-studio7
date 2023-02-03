package org.launchcode.studio7;

import org.launchcode.studio7.comparatorClasses.DVDComparator;
import org.launchcode.studio7.comparatorClasses.DiscComparator;
import org.launchcode.studio7.comparatorClasses.CDComparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import static org.launchcode.studio7.Storage.shelf1;
import static org.launchcode.studio7.Storage.testingIterator;

public class MethodCaller {

    public static void generateCollection() {
        DVD movie1 = new DVD(1098, "Die Hard", 2086, "Action", "Gordon Company Silver Pictures", 300, "John McTiernan");
        DVD movie2 = new DVD(1076, "Scott Pilgrim vs. the World", 2086, "Action", "Universal", 175, "Edgar Wright");
        DVD movie3 = new DVD(983, "Spirited Away", 2086, "Animation", "Studio Ghibli", 209, "Hayao Miyazaki");
        DVD movie4 = new DVD(1200, "Avengers: Endgame", 2086, "Action", "Marvel", 298, "Anthony Russo, Joe Russo");

        CD disc1 = new CD(400, "I'm Wide Awake, It's Morning", 256, "Folk Rock", "", "Bright Eyes");
        CD disc2 = new CD(378, "Bon Iver", 256, "Folk", "", "Bon Iver");
        CD disc3 = new CD(329, "Dreaming Tree", 256, "Jam Rock", "", "Dave Matthews Band");
        CD disc4 = new CD(419, "No Ones First and You're Next", 256, "Indie Rock", "", "Modest Mouse");

        disc1.addTracks(8);
        disc2.addTracks(8);
        disc3.addTracks(8);
        disc4.addTracks(8);

        Storage.shelf1.add(movie1);
        Storage.shelf1.add(movie2);
        Storage.shelf1.add(disc1);
        Storage.shelf1.add(disc2);
        Storage.shelf1.add(movie3);
        Storage.shelf1.add(movie4);
        Storage.shelf1.add(disc3);
        Storage.shelf1.add(disc4);

        Storage.shelfCD.add(disc1);
        Storage.shelfDVD.add(movie1);
        Storage.shelfDVD.add(movie2);
        Storage.shelfCD.add(disc1);
        Storage.shelfCD.add(disc2);
        Storage.shelfDVD.add(movie3);
        Storage.shelfDVD.add(movie4);
        Storage.shelfCD.add(disc3);
        Storage.shelfCD.add(disc4);

        testingIterator.add("a");
        testingIterator.add("b");
        testingIterator.add("c");
        testingIterator.add("d");
        testingIterator.add("e");
        testingIterator.add("f");
        testingIterator.add("g");
        testingIterator.add("h");


    }

    public static void getAllCollectionSpinSpeed() {
        System.out.println("\nDisc RPM details:\n");
        for (Disc item : Storage.shelf1) {
            if (item instanceof CD) {
                System.out.println("RPM: " + item.getSpinSpeed() + "  CD: " + ((CD) item).discName);
            }
            if (item instanceof DVD) {
                System.out.println("RPM: " + item.getSpinSpeed() + "  DVD: " + ((DVD) item).discName);
            }
        }
    }


    public static void CDTotalTime() {
        for (Disc item : Storage.shelf1) {
            if (item instanceof CD) {
                System.out.println("RPM: " + item.getSpinSpeed() + "  CD: " + ((CD) item).discName);
            }
            if (item instanceof DVD) {
                System.out.println("RPM: " + item.getSpinSpeed() + "  DVD: " + ((DVD) item).discName);
            }
        }
    }

    public static void getDiscSpinSpeed(String discTitle) {
        System.out.println("\nDisc RPM details for " + discTitle + ".");
        for (Disc item : Storage.shelf1) {
            if (item instanceof CD) {
                if (((CD) item).discName.equals(discTitle)) {
                    System.out.println("RPM: " + item.getSpinSpeed());
                }
            }
            if (item instanceof DVD) {
                if (((DVD) item).discName.equals(discTitle)) {
                    System.out.println("RPM: " + item.getSpinSpeed());
                }
            }
        }
    }

    public static void getTrackDetails(String albumName) {

        System.out.println("\nTracks for album " + albumName + "\n");
        for (Disc item : Storage.shelf1) {
            if (item instanceof CD) {
                if (((CD) item).discName.equals(albumName)) {
                    ((CD) item).getSongTimeDisplay();
                }
            }
        }
    }

    public static void comparatorTestsDVD() {
        Comparator<DVD> comparator = new DVDComparator();
        System.out.println("\nInside comparatorTestsDVD() before sorting DVDs by total time: Sorting...........");
        Storage.shelfDVD.sort(new DVDComparator());

    }

    public static void comparatorTestsDisc() {
        int j = 1;

        System.out.println("\nInside comparatorTestsDisc() before sorting Total Collection by name:\n");
        for (Disc item : Storage.shelf1) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;

        /** creating new comparator object inside sort arg **/
        Storage.shelf1.sort(new DiscComparator());

        System.out.println("\nAfter sorting DVDs by name:\n");
        for (Disc item : Storage.shelf1) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;

    }

    public static void comparatorTestsCD() {
        Comparator<CD> comparator = new CDComparator();
        int j = 1;

        System.out.println("\nInside comparatorTestsDisc() before sorting Total Collection by name:\n");
        for (CD item : Storage.shelfCD) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;

        /** Created comparator object and put it in sort arg **/
        Storage.shelfCD.sort(comparator);

        System.out.println("\nAfter sorting DVDs by name:\n");
        for (CD item : Storage.shelfCD) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;

    }

    public static void iteratorTest() {
        /** Array is made in Storage Class **/

        Iterator<Disc> it = shelf1.iterator();
        List<Disc> testing = Storage.shelf1;

        System.out.println("\nIterator class in action.\n");

        while (it.hasNext()) {
            System.out.println(it.next().discName);
        }

    }

}
