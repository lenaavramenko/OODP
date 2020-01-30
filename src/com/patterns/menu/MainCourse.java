package com.patterns.menu;

import com.patterns.DailyMenu;
import com.patterns.IMenu;

public class MainCourse extends DailyMenu {
    public MainCourse(IMenu m) {
        super(m);
    }
    @Override
    public void showType() {
        System.out.print("Main Course - ");
    }
}
