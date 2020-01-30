package com.patterns.products;

import com.patterns.IMenu;

public class Tomato implements IMenu {
    @Override
    public void setMenu() {
        System.out.println("Tomato");
    }
}
