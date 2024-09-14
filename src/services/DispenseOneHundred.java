package services;

import Iface.IHandlerCashier;
import Iface.HandlerCashierAbstract;

public class DispenseOneHundred  extends HandlerCashierAbstract {
    @Override
    public void dispense(int amoutMoney) {
        if (amoutMoney >= 100000) {
            int num = amoutMoney / 100000;
            int remainder = amoutMoney % 100000;
            System.out.println("Depositando " + num + " billetes de 100.000");
            if (remainder != 0) super.dispense(remainder);
        } else {
            super.dispense(amoutMoney);
        }
    }

}
