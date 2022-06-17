class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        UberX car1 = new UberX("AMQ123", new Account("Santiago Lopez", 1234567890), 
        "Chevrolet", "sonic");
        car1.setPassenger(4);
        car1.printCarData();

        UberPool car2 = new UberPool("QMG843", new Account("Fulanito Detal", 987654321),"BMW", "X5");
        car2.setPassenger(4);
        car2.printCarData();

        Driver Santiago = new Driver("Santiago Lopez", 123456789, "santiago@gmail.com", "aStrongPass123");
        Santiago.printAccountData();

        User fulanito = new User("Fulanito Detal", 987654321, "fulano@gmail.com", "anExtraordinaryPass321");
        fulanito.printAccountData();
    }
}