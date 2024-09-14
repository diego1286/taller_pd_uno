
package services;

import Iface.IHandlerCashier;

public class AtmDispenser {

    private IHandlerCashier cash;

    public AtmDispenser() {
        this.cash = new DispenseOneHundred();

        IHandlerCashier dispenser50k = new DispenseFiveHundred();
        IHandlerCashier dispenser20k = new DispenseTwenty();
        IHandlerCashier dispenser10k = new DispenseTenthousand();
        IHandlerCashier dispenser5k = new DispenseFive();

        cash.setNext(dispenser50k);
        dispenser50k.setNext(dispenser20k);
        dispenser20k.setNext(dispenser10k);
        dispenser10k.setNext(dispenser5k);
    }

    public void dispense(int amount) {
        if (amount % 5000 != 0) {
            System.out.println("La cantidad debe ser un múltiplo de 5000.");
        } else {
            cash.dispense(amount);

        }
    }
}
