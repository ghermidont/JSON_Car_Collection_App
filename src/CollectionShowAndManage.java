import org.json.simple.parser.ParseException;
import java.io.IOException;

public class CollectionShowAndManage {
    public static void main(String[] args) throws IOException, ParseException {
        CarsCollection carsShowroom = new CarsCollection();
            carsShowroom.start();
    }
}
