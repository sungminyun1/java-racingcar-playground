import java.util.Objects;

public class Car {

    private final static int MOVEABLE_POWER = 4;

    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        position = new Position(0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int power){
        if(!moveable(power)) return;
        position.move();
    }

    private boolean moveable(int power){
        return power >= MOVEABLE_POWER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
