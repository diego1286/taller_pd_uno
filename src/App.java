import services.AtmDispenser;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Bienvenido a el dispensador de dinero con patron cadena de responsabilidad");

        AtmDispenser atmDispenser = new AtmDispenser();

        atmDispenser.dispense(285000);
    }
}
