package com.patterns;

/**
 * Bridge pattern.
 */
public abstract class DailyMenu {
    protected IMenu menu;

    public DailyMenu(IMenu m) {
        menu = m;
    }

    /**
     * Template-method with abstract method showType().
     */
    public abstract void showType();
    public void showDetails() {
        showType();
        menu.setMenu();
    }

}
