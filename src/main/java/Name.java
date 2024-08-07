import java.util.Objects;

public class Name {

    private String name;

    public Name(String carName) {
        if(!validateName(carName)) {
            throw new IllegalArgumentException("Invalid car name");
        }
        this.name = carName;
    }

    private boolean validateName(String name) {
        return !name.isEmpty() && name.length() < 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(this.name, name.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
