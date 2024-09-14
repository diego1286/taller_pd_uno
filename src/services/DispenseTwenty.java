package services;

import Iface.HandlerCashierAbstract;

public class DispenseTwenty extends HandlerCashierAbstract{

    @Override
    public void dispense(int amoutMoney){
        if(amoutMoney >= 20000){
            int num = amoutMoney / 20000;
            int rest = amoutMoney % 20000;
            System.out.println("Depositando " + num + " " + "Billetes de 20.000");
            if(rest !=0)super.dispense(rest);
        }else{
            super.dispense(amoutMoney);
        }
    }


}
