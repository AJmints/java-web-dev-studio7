package org.launchcode.studio7;

import java.util.ArrayList;

public class Storage {

    public static ArrayList<Disc> shelf1 = new ArrayList<>();

    public static void getShelfContents() {
        for (Disc item : shelf1) {
            if (item instanceof CD) {
                System.out.println("ALBUM: " + ((Disc) item).discName);
            }
            if (item instanceof DVD) {
                System.out.println("MOVIE: " + ((Disc) item).discName);
            }
        }
    }



}