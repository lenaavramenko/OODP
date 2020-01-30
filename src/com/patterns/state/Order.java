package com.patterns.state;

public class Order {

        private OrderState currentState;

        public Order() {
            this.currentState = new notReady(this);
        }

        public void setNewState(final OrderState orderState) {
            currentState = orderState;
        }

        public String getStateDescription() {
            return currentState.getStateDescription();
        }

        public void changeOrderState() {
            currentState.changeState();
        }
}
