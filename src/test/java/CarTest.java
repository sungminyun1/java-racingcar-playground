import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @DisplayName("자동차에 이름을 부과해 생성할 수 있다")
    @Test
    void createCar(){
        Car car = new Car("Boong");

        assertThat(car.getName()).isEqualTo("Boong");
    }

    @DisplayName("자동차의 이름은 5자를 초과할 수 없다.")
    @Test
    void createCarError(){
        assertThatThrownBy(()->new Car("BoongBoongE")).isInstanceOf(RuntimeException.class);
    }

    @DisplayName("자동차 출력이 4 이상이면 자동차가 전진한다")
    @Test
    void moveCar(){
        Car car = new Car("aa");
        car.move(4);

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @DisplayName("자동차 출력이 4 미만이면 자동차가 전진하지않는다")
    @Test
    void dontMoveCar(){
        Car car = new Car("aa");
        car.move(3);

        assertThat(car.getDistance()).isEqualTo(0);
    }
}