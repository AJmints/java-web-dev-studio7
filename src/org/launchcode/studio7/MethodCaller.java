package org.launchcode.studio7;

import org.launchcode.studio7.comparatorClasses.DVDComparator;
import org.launchcode.studio7.comparatorClasses.DiscComparator;
import org.launchcode.studio7.comparatorClasses.CDComparator;

import java.util.Comparator;

public class MethodCaller {

    public static void generateCollection() {
        DVD movie1 = new DVD(1098, "Die Hard", 2086, "Action", "Gordon Company Silver Pictures", 146, "John McTiernan");
        DVD movie2 = new DVD(1076, "Scott Pilgrim vs. the World", 2086, "Action", "Universal", 175, "Edgar Wright");
        DVD movie3 = new DVD(983, "Spirited Away", 2086, "Animation", "Studio Ghibli", 198, "Hayao Miyazaki");
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

        Storage.shelfDVD.add(movie1);
        Storage.shelfDVD.add(movie2);
        Storage.shelfCD.add(disc1);
        Storage.shelfCD.add(disc2);
        Storage.shelfDVD.add(movie3);
        Storage.shelfDVD.add(movie4);
        Storage.shelfCD.add(disc3);
        Storage.shelfCD.add(disc4);

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

    public static void comparatorTests() {
        Comparator<DVD> comparator = new DVDComparator();
        Comparator<Disc> comparator1 = new DiscComparator();
        Comparator<CD> comparator2 = new CDComparator();
        int j = 1;

        System.out.println("\nInside comparatorTests() before sorting DVDs by name:\n");
        for (DVD item : Storage.shelfDVD) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;

        Storage.shelfDVD.sort(new DVDComparator());
        Storage.shelf1.sort(new DiscComparator());
        Storage.shelfCD.sort((new CDComparator()));

        System.out.println("\nAfter sorting DVDs by name:\n");
        for (DVD item : Storage.shelfDVD) {
            System.out.println(j + ": " + item.getDiscName());
            j++;
        }
        j = 1;

    }

}
