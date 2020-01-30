package com.patterns.menu;

import com.patterns.DailyMenu;
import com.patterns.IMenu;

public class Soup extends DailyMenu {
 public Soup(IMenu m) {
     super(m);
 }
    @Override
    public void showType() {
        System.out.print("Soup - ");
    }
}
