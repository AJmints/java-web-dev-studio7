package org.launchcode.studio7.comparatorClasses;

import org.launchcode.studio7.DVD;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class DVDComparator implements Comparator<DVD> {
    @Override
    public int compare(DVD o1, DVD o2) {
        return o1.getDiscName().compareTo(o2.getDiscName());
    }

    @Override
    public Comparator<DVD> thenComparingInt(ToIntFunction<? super DVD> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<DVD> thenComparingDouble(ToDoubleFunction<? super DVD> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
