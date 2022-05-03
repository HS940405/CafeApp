package com.example.cafeapp.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CafeList implements Iterable<Cafe> {
    List<Cafe> cafes;

    public CafeList() {
        cafes = new ArrayList<>();
    }

    public Iterator<Cafe> iterator() {
        return cafes.iterator();
    }

    public void addCafe(Cafe cafe) {
        cafes.add(cafe);
    }

    public void removeCafe(Cafe cafe) {
        cafes.remove(cafe);
    }

    public boolean isCafeAdded(Cafe cafe) {
        return cafes.contains(cafe);
    }

    public boolean hasLargerScore(int score) {
        for (Cafe cafe : cafes) {
            if (cafe.getPreference() > score) {
                return true;
            }
        }
        return false;
    }

    public Cafe getLargestScore() {
        Cafe largest = null;
        for (Cafe cafe : cafes) {
            largest = largest == null || cafe.getPreference() > largest.getPreference() ? cafe : largest;
        }
        return largest;
    }

    //best cafe algorithm score: score*0.8 + numVisited*0.2
    //add distance if locational info. is added
    public Cafe chooseBestCafe() {
        int score = 0;
        Cafe best = null;
        for (Cafe c : cafes) {
            best = (c.getPreference() * 0.8 + c.getNumVisited() * 0.2) > score ? c : best;
        }
        return best;
    }
}
