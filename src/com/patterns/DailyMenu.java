package com.patterns;

/**
 * Bridge pattern.
 */
public abstract class DailyMenu {
    protected IMenu IMenu;
    public DailyMenu(IMenu m) {
        IMenu = m;}

    /**
     * Template-method with abstract method showType().
     */
    public abstract void showType();
    public void showDetails() {
        showType();
        IMenu.setMenu();
    }

}
