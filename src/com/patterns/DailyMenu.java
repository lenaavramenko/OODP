package com.patterns;


public abstract class DayliMenu {
    protected Menu menu;
    public DayliMenu(Menu m) {menu = m;}
    public abstract void showType();
    void showDetails() {
        showType();
        menu.setMenu();
    }

}
