package org.launchcode.studio7.comparatorClasses;

import org.launchcode.studio7.CD;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class CDComparator implements Comparator<CD> {
    @Override
    public int compare(CD o1, CD o2) {
        return 0;
    }

    @Override
    public Comparator<CD> thenComparingInt(ToIntFunction<? super CD> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<CD> thenComparingDouble(ToDoubleFunction<? super CD> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
