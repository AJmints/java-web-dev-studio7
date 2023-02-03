package org.launchcode.studio7.comparatorClasses;

import org.launchcode.studio7.Disc;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class DiscComparator implements Comparator<Disc> {
    @Override
    public int compare(Disc o1, Disc o2) {
        return o1.discName.compareTo(o2.discName);
    }

    @Override
    public Comparator<Disc> thenComparingInt(ToIntFunction<? super Disc> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Disc> thenComparingDouble(ToDoubleFunction<? super Disc> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
