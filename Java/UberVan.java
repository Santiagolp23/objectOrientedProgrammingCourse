import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterials;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, 
    ArrayList<String> seatsMaterials) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterials = seatsMaterials;
    }
}
