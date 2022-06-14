class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car1 = new Car();
        car1.driver = "Santiago Lopez";
        car1.license = "AMQ123";
        car1.passengersNumber = 4;
        car1.printCarData();

        Car car2 = new Car();
        car1.driver = "Fulanito Detal";
        car1.license = "QMG843";
        car1.passengersNumber = 3;
        car1.printCarData();
    }
}