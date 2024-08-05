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
}