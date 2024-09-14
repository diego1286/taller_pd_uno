package services;

import Iface.HandlerCashierAbstract;


public class DispenseTenthousand extends HandlerCashierAbstract{

    @Override
    public void dispense(int amoutMoney){
        if(amoutMoney >=10000){
            int num = amoutMoney / 10000;
            int rest = amoutMoney % 10000;
            System.out.println("Depositando " + num + " billetes de 10.000");
            if(rest !=0)super.dispense(rest);
        }else{
            super.dispense(amoutMoney);
        }

    }

}
