package com.patterns.menu;

import com.patterns.DailyMenu;
import com.patterns.IMenu;

public class Desert extends DailyMenu {
    public Desert(IMenu m) {
        super(m);
    }
    @Override
    public void showType() {
        System.out.print("Desert - ");
    }
}
