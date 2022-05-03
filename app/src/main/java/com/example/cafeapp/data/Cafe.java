package com.example.cafeapp.data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Objects;

public class Cafe {

    private String name;
    private int score;
    private String location;
    private int numVisited;
    private Bitmap defaultImage;

    public Cafe(String name) {
        this.name = name;
        numVisited = 0;
        defaultImage = BitmapFactory.decodeFile("/Users/hansolyang/AndroidStudioProjects/CafeApp/app/src/main/java/com/example/cafeapp/image/cafe.png");
    }

    public void visitCafe() {
        numVisited++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getLocation() {
        return location;
    }

    public int getNumVisited() {
        return numVisited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafe cafe = (Cafe) o;
        return name.equals(cafe.name) &&
                Objects.equals(location, cafe.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
