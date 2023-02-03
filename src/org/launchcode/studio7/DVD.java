package org.launchcode.studio7;

public class DVD extends Disc implements OpticalDisc{

    double totalTime;
    String director;

    public DVD(double totalTime, String director) {
        this.totalTime = totalTime;
        this.director = director;
    }

    public DVD(int spinSpeed, String discName, double storageCapacity, String genre, String studio, double totalTime, String director) {
        super(spinSpeed, discName, storageCapacity, genre, studio);
        this.totalTime = totalTime;
        this.director = director;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
