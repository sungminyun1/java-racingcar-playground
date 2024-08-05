public class Car {
    private String name;

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
}
