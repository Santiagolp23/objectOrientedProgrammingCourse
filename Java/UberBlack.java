import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterials;

    public UberBlack(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, 
    ArrayList<String> seatsMaterials) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterials = seatsMaterials;
    }
}
