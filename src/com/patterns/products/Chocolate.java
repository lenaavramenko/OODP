package com.patterns.products;

import com.patterns.IMenu;

public class Chocolate implements IMenu {
    @Override
    public void setMenu() {
        System.out.println("Chocolate");
    }
}
