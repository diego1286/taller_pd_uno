package Iface;



public interface IHandlerCashier {

    void setNext(IHandlerCashier nextHandler); //menejador 

    void dispense(int amoutMoney);

}
