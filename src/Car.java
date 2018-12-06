import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Car {

    private String model, year, color, price;

    public Car(String carModel) throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        Object object = parser.parse(new FileReader("cars.json"));

        //convert Object to JSONObject
        JSONObject jsonObject = (JSONObject) object;

        JSONArray getCarFromJsonObject = (JSONArray) jsonObject.get(carModel);

        this.model = (String) getCarFromJsonObject.get(0);
        this.year = (String) getCarFromJsonObject.get(1);
        this.color = (String) getCarFromJsonObject.get(2);
        this.price = (String) getCarFromJsonObject.get(3);

    }

    @Override
    public String toString() {
        return   model + "\n" +
                "prod. year: "  + year + "\n" +
                "color: " + color + "\n" +
                "price: " + price + "\n";
    }

}
