package com.patterns.state;

public abstract class OrderState {

    public abstract void changeState();
    public abstract String getStateDescription();
    protected final Order order;

    public OrderState(Order order) {
        this.order = order;
    }

}
