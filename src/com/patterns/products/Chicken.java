package com.patterns.products;

import com.patterns.IMenu;

public class Chicken implements IMenu {
    @Override
    public void setMenu() {
        System.out.println("Chicken");
    }
}
