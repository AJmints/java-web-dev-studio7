package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.HashMap;
public class CD extends Disc implements OpticalDisc{

    public static ArrayList<HashMap<String, Double>> trackDetails = new ArrayList<>();

    public final String artist;
    public double totalTime = 0;

    public CD(ArrayList<HashMap<String, Double>> trackDetails, String artist, double totalTime) {
        this.artist = artist;
        this.totalTime = totalTime;
    }

    public CD(int spinSpeed, String discName, double storageCapacity, String genre, String studio, String artist) {
        super(spinSpeed, discName, storageCapacity, genre, studio);
        this.artist = artist;
    }


    @Override
    public void spinDisc() {
        System.out.println(this.getSpinSpeed());

        for (Disc item : Storage.shelf1) {
            System.out.println(item.getSpinSpeed());
        }


    }

    public static void spinning() {

    }

    @Override
    public void storeData() {

    }

    @Override
    public void laserWriteDisc() {

    }

    @Override
    public void laserReadDisc() {

    }

    @Override
    public void loadData() {

    }

    public void addTracks(int total) {
        HashMap<String, Double> track = new HashMap<>();
        /** This is currently deactivated until I decide to make a user input **/
        if (false) {
            int totalTracks = total;
            int j = 1;
            for (int i = 0; i < totalTracks; i++) {

                String song = "test track";
                double time = 3.47;

                /** Set input up here **/

                track.put(song, time);
                trackDetails.add(track);

            }
        }

        HashMap<String, Double> track1 = new HashMap<>();
        HashMap<String, Double> track2 = new HashMap<>();
        HashMap<String, Double> track3 = new HashMap<>();
        HashMap<String, Double> track4 = new HashMap<>();
        HashMap<String, Double> track5 = new HashMap<>();
        HashMap<String, Double> track6 = new HashMap<>();
        HashMap<String, Double> track7 = new HashMap<>();
        HashMap<String, Double> track8 = new HashMap<>();


        track1.put("Plainclothes Man", 2.50);
        track2.put("Low-Flying Jets", 6.67);
        track3.put("Rest My head Against the Wall", 3.80);
        track4.put("Eagle Eye", 2.80);
        track5.put("Half Right", 4.25);
        track6.put("Blue Highway", 3.90);
        track7.put("The Fix Is In", 4.31);
        track8.put("Pop In G", 6.28);

        trackDetails.add(track1);
        trackDetails.add(track2);
        trackDetails.add(track3);
        trackDetails.add(track4);
        trackDetails.add(track5);
        trackDetails.add(track6);
        trackDetails.add(track7);
        trackDetails.add(track8);

    }

    public static void getSongTimeDisplay() {

        /** this is the display get Song name and length method. **/
        /** this is the display get Song name and length method. **/
        /** this is the display get Song name and length method. **/

        for (HashMap<String, Double> item : trackDetails) {
            String str = "";
            Double dub = 0.0;
            ArrayList<String> maybe = new ArrayList<>();
            ArrayList<Double> maybe2 = new ArrayList<>();

            for (String key : item.keySet()) {
                str = key;
                maybe.add(key);
//                System.out.println(str);
            }

            for (Double key : item.values()) {
                dub = key;
                maybe2.add(key);
//                System.out.println(dub);
            }


            for (int i = 0; i < maybe.size(); i++) {
                System.out.println(maybe.get(i) + " : " + maybe2.get(i));
            }




        }

        System.out.println("\nThese are the songs in the totalTracks ArrayList");



    }





}
