import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingGame {

    List<Car> cars;

    public RacingGame(String carsName) {
        cars = createCars(carsName);
    }

    public List<Car> createCars(String carsName){
        List<String> parsedName = parseNames(carsName);
        List<Car> result = new ArrayList<>();
        parsedName.forEach(name -> result.add(new Car(name)));
        return result;
    }

    private List<String> parseNames(String carsName){
        return Arrays.asList(carsName.split(","));
    }

    public void play(){
        cars.forEach(car -> car.move(generateRandomPower()));
    }

    private int generateRandomPower(){
        return Utility.generateRandomNumber(0, 9);
    }
}
