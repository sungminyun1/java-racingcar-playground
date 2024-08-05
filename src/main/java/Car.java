import java.util.Objects;

public class Car {
    private final String name;
    private int distance = 0;
    private final int MIN_POWER = 4;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if(name.length() > 5) {
            throw new RuntimeException("Name is too long");
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void move(int power) {
        if(canMove(power)) {
            distance++;
        }
    }

    private boolean canMove(int power) {
        return power >= MIN_POWER;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return distance == car.distance && Objects.equals(name, car.name);
    }
}
