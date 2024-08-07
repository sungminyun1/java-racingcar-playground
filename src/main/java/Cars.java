import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars;

    public Cars(String carNames) {
        this.cars = listCars(carNames);
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private String[] parseString(String carNames) {
        return carNames.split(",");
    }

    private List<Car> listCars(String carNames) {
        String[] parsed = parseString(carNames);
        return Arrays.stream(parsed)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public Cars getWinningCars() {
        Car maxCar = getMaxCar();
        return new Cars(cars.stream()
                .filter(car -> car.isWinningCar(maxCar))
                .collect(Collectors.toList()));
    }

    private Car getMaxCar() {
        return cars.stream()
                .max(Car::compareTo)
                .orElseThrow(RuntimeException::new);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cars);
    }
}
