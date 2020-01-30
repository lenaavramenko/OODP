package com.patterns.state;

public class notReady extends OrderState {
    public notReady(Order order) {
        super(order);
    }

    @Override
    public void changeState() {
        System.out.println("Thank you for your Order. It's " + getStateDescription() + " yet.");
        System.out.println("Please wait 15 min...");
        order.setNewState(new isReady(order));
    }

    @Override
    public String getStateDescription() {
        return "NOT READY";
    }

}
