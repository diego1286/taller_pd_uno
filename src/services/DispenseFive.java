package services;

import Iface.HandlerCashierAbstract;

public class DispenseFive extends HandlerCashierAbstract {

    @Override
    public void dispense(int amoutMoney){
        if(amoutMoney >=500){
            int num = amoutMoney /5000;
            int rest = amoutMoney % 5000;
            System.out.println("Depositando " + num + " billetes de 5.000");
            if(rest !=0)super.dispense(rest);
        }else{
            super.dispense(amoutMoney);
        }
    }
}

