package services;

import Iface.HandlerCashierAbstract;

public class DispenseFiveHundred  extends HandlerCashierAbstract{
    
    @Override
    public void dispense(int amoutMoney){
        if(amoutMoney >= 50000){
            int num = amoutMoney / 50000;
            int  rest= amoutMoney % 50000;
            System.out.println("Depositando " + num + " " + "Billetes de 50.000");
            if(rest !=0) super.dispense(rest);
        }else {
            super.dispense(amoutMoney);
        }
    }

}
