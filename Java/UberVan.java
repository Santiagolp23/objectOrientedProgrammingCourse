import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterials;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passengersNumber) {
        if (passengersNumber == 6){
            this.passengersNumber = passengersNumber;
        }
        else {
            System.out.println("You can only assign 6 passengers");
        }
    }
}
