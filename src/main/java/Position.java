import java.util.Objects;

public class Position implements Comparable<Position> {
    private int position;

    public Position(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(position);
    }

    public void move() {
        position++;
    }

    @Override
    public int compareTo(Position o) {
        return position - o.position;
    }
}
