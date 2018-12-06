import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CarsFile {

    private static String model;
    private static Long year;
    private static String color;
    private static double price;

   public static void extractCarsFromJsonFile()  {

        JSONParser parser = new JSONParser();

        Object object = null;
        try {
            object = parser.parse(new FileReader("cars.json"));
        } catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }

        //convert Object to JSONObject
        JSONObject jsonObject = (JSONObject) object;

        JSONArray getCarFromJsonObject = (JSONArray) jsonObject.get("Mercedes");
        model = (String)getCarFromJsonObject.get(0);
        year = (Long) getCarFromJsonObject.get(1);
        color = (String)getCarFromJsonObject.get(2);
        price = (double) getCarFromJsonObject.get(3);

       System.out.println(model + "\n" + year + "\n" + color + "\n" + price);
    }

}

