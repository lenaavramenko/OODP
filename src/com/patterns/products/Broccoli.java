package com.patterns.products;

import com.patterns.IMenu;

public class Broccoli implements IMenu {
    @Override
    public void setMenu() {
        System.out.println("Broccoli");
    }
}
