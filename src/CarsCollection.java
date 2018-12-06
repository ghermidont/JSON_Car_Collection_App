import org.json.simple.parser.ParseException;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;

public class CarsCollection {

    private Car MercedesCar = new Car("Mercedes");
    private Car BMWCar = new Car("BMW");
    private Car FordCar = new Car("Ford");
    private Car JaguarCar = new Car("Jaguar");
    private Car RenaultCar = new Car("Renault");

    private HashMap<String, Car> carsCollection;
    private Scanner askUser = new Scanner(System.in);

    public CarsCollection() throws IOException, ParseException {
        createList();
    }

    private void createList () throws IOException, ParseException {
        carsCollection = new HashMap<>();
        carsCollection.put("mercedes", MercedesCar);
        carsCollection.put("bmw", BMWCar);
        carsCollection.put("ford", FordCar);
        carsCollection.put("jaguar", JaguarCar);
        carsCollection.put("renault", RenaultCar);
    }

    private void showTheCollectionState() {
        carsCollection.forEach((k, v) -> System.out.println("Car: " + v));
    }

    protected void start() throws IOException, ParseException {
        System.out.println("Hello!" +
                "\n Nice to see you back in the cars showroom.\n" +
                "Would you like to take any of the cars for a ride today?\n" +
                "In order to choose please input the name of the specific\n" +
                "car... If you have changed your mind and decide to leave,\n" +
                "please type \"n\"\n" +
                "****************************************\n");
        askForAction();
    }

    private void askForAction(){
        for(;;) {
            showTheCollectionState();

            String answer = askUser.next();
            System.out.println("\n");

            remove(answer.toLowerCase());

            if(answer.equalsIgnoreCase("n")){
                System.out.println( "Have a great day! See you next time!" );
                break;
            }else{
                System.out.println("What is you next choice?\n");
                if(carsCollection.isEmpty()) {
                    System.out.println( "No more cars! Please return next week!\n");
                    break;
                }
            }
        }
    }

    private void remove(String answer){
      carsCollection.remove(answer);
    }

}
