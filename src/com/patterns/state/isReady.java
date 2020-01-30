package com.patterns.state;

/**
 * State pattern.
 */
public class isReady extends OrderState {
    @Override
    public void changeState() {
        System.out.println("Button pushed in " + getStateDescription() + " state");
        System.out.println("Switching state to OFF");
        order.setNewState(new notReady(order));
    }

    @Override
    public String getStateDescription() {
        return "IS READY";
    }

    public isReady(Order order) {
        super(order);
    }
}
