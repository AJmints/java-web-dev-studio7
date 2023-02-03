package org.launchcode.studio7;

import java.util.HashMap;
public class CD extends Disc implements OpticalDisc{

    HashMap<String, Integer> trackDetails;
    double totalTime;

    public CD(HashMap<String, Integer> trackDetails, double totalTime) {
        this.trackDetails = trackDetails;
        this.totalTime = totalTime;
    }

    public CD(int spinSpeed, String discName, double storageCapacity, String genre, String studio, HashMap<String, Integer> trackDetails, double totalTime) {
        super(spinSpeed, discName, storageCapacity, genre, studio);
        this.trackDetails = trackDetails;
        this.totalTime = totalTime;
    }

    @Override
    public void spinDisc() {

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

}
