package com.example.recyclerviewcardview;

import java.util.ArrayList;


public class Data {


    public static ArrayList<Information> getData() {

        ArrayList<Information> data = new ArrayList<>();

        int[] images = {
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.seven,
                R.drawable.eight,

                R.drawable.house,
                R.drawable.photu,
                R.drawable.photos,
                R.drawable.hent,
                R.drawable.letssee,

                R.drawable.scene,
                R.drawable.rat};

        String[] Categories = {"Cat 1", "Cat 2", "Cat 3", "Cat 4" ,"Cat 5" ,"Cat 6","Cat 7",
                "Dog 1","Dog 2","Dog 3","Dog 4","Dog 5",
                "Deer 1","Deer 2","Deer 3"};

        for (int i = 0; i < images.length; i++) {

            Information current = new Information();
            current.title = Categories[i];
            current.imageId = images[i];

            data.add(current);
        }

        return data;
    }

}
