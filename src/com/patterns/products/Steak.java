package com.patterns.products;

import com.patterns.IMenu;

public class Steak implements IMenu {
    @Override
    public void setMenu() {
        System.out.println("Steak");
    }
}
