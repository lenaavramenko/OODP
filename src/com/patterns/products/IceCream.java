package com.patterns.products;

import com.patterns.IMenu;

public class IceCream implements IMenu {
    @Override
    public void setMenu() {
        System.out.println("IceCream");
    }
}
