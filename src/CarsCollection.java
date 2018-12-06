import org.json.simple.parser.ParseException;

import java.io.IOException;

public class CarsCollection {
    public static void main(String[] args) {
CarsFile carfile = new CarsFile();

carfile.extractCarsFromJsonFile();
    }
}
