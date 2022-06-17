class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengersNumber;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printCarData() {
        System.out.println("License is: " + license + " Driver: " + driver.name + 
        " with " + passengersNumber + " passenger seats.");
    }

    public Integer getPassenger(){
        return passengersNumber;
    }

    public void setPassenger(Integer passengersNumber){
        if (passengersNumber == 4){
            this.passengersNumber = passengersNumber;
        }
        else {
            System.out.println("You can only assign 4 passengers");
        }
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
}
