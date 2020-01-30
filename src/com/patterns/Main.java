package com.patterns;

import com.patterns.products.*;
import com.patterns.menu.Desert;
import com.patterns.menu.MainCourse;
import com.patterns.menu.Soup;

/**
 * Main entry point in application.
 */
public class Main {
    public static void main(String[] args) {

        final ComplexLunch complexLunch = ComplexLunch.ComplexLunchBuilder.aComplexLunch()
                .withMainCourse(new MainCourse(new Chicken()))
                .withSoup(new Soup(new Pumpkin()))
                .withDesert(new Desert(new Chocolate()))
                .build();

        final ComplexLunch complexLunch2 = ComplexLunch.ComplexLunchBuilder.aComplexLunch()
                .withMainCourse(new MainCourse(new Steak()))
                .withSoup(new Soup(new Broccoli()))
                .withDesert(new Desert(new IceCream()))
                .build();

        printComplexLunchInfo(complexLunch);
        printComplexLunchInfo(complexLunch2);
    }

    private static void printComplexLunchInfo(final ComplexLunch complexLunch) {
        complexLunch.print();
    }
}