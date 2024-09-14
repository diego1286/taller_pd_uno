package Iface;

import java.util.logging.Handler;

public abstract class HandlerCashierAbstract implements IHandlerCashier {

    protected IHandlerCashier nextHandler;

    @Override
    public void setNext(IHandlerCashier nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void dispense(int amoutMoney) {
        if (nextHandler != null) {
            nextHandler.dispense(amoutMoney);
        } else {
            System.out.println("En este momento no se puede depositar esta cantidad: " + amoutMoney);
        }
    }

}
