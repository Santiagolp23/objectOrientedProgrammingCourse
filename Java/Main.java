class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car1 = new Car("AMQ123", new Account("Santiago Lopez", 1234567890));
        car1.passengersNumber = 4;
        car1.printCarData();

        Car car2 = new Car("QMG843", new Account("Fulanito Detal", 987654321));
        car2.passengersNumber = 3;
        car2.printCarData();

        Driver Santiago = new Driver("Santiago Lopez", 123456789, "santiago@gmail.com", "aStrongPass123");
        Santiago.printAccountData();

        User fulanito = new User("Fulanito Detal", 987654321, "fulano@gmail.com", "anExtraordinaryPass321");
        fulanito.printAccountData();
    }
}