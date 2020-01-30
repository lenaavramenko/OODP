package com.patterns;

import com.patterns.products.*;
import com.patterns.menu.Desert;
import com.patterns.menu.MainCourse;
import com.patterns.menu.Soup;
import com.patterns.state.Order;

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

        printComplexLunchInfo(complexLunch);

        final Order order = new Order();
        System.out.println("Order is created. The initial state is: " + order.getStateDescription());

        order.changeOrderState();
        System.out.println("Let's see if your Order is ready: " + order.getStateDescription());

    }

    private static void printComplexLunchInfo(final ComplexLunch complexLunch) {
        complexLunch.print();
    }
}