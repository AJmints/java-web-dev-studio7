package org.launchcode.studio7;

public abstract class Disc {

    public int spinSpeed;
    public String discName;
    private double storageCapacity;
    public String genre;
     public String studio;

    public Disc() {
    }

    public Disc(int spinSpeed, String discName, double storageCapacity, String genre, String studio) {
        this.spinSpeed = spinSpeed;
        this.discName = discName;
        this.storageCapacity = storageCapacity;
        this.genre = genre;
        this.studio = studio;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
