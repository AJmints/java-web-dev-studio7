package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){


        DVD movie1 = new DVD(1098, "Die Hard", 2086, "Action", "Gordon Company Silver Pictures", 146, "John McTiernan");
        DVD movie2 = new DVD(1076, "Scott Pilgrim vs. the World", 2086, "Action", "Universal", 175, "Edgar Wright");
        DVD movie3 = new DVD(983, "Spirited Away", 2086, "Animation", "Studio Ghibli", 198, "Hayao Miyazaki");
        DVD movie4 = new DVD(1200, "Avengers: Endgame", 2086, "Action", "Marvel", 298, "Anthony Russo, Joe Russo");

        CD disc1 = new CD(400, "I'm wide awake, it's morning", 256, "Folk Rock", "", "Bright Eyes");
        CD disc2 = new CD(378, "Bon Iver", 256, "Folk", "", "Bon Iver");
        CD disc3 = new CD(329, "Dreaming Tree", 256, "Jam Rock", "", "Dave Matthews Band");
        CD disc4 = new CD(419, "Whale Song", 256, "Indie Rock", "", "Modest Mouse");

        disc1.addTracks(8);
        disc2.addTracks(8);
        disc3.addTracks(8);
        disc4.addTracks(8);

        Storage.shelf1.add(movie1);
        Storage.shelf1.add(movie2);
        Storage.shelf1.add(movie3);
        Storage.shelf1.add(movie4);
        Storage.shelf1.add(disc1);
        Storage.shelf1.add(disc2);
        Storage.shelf1.add(disc3);
        Storage.shelf1.add(disc4);

//        CD.getSongTimeDisplay();
        Storage.getShelfContents();
        for (Disc item : Storage.shelf1) {
            System.out.println(item.getSpinSpeed());
        }




    }
}
