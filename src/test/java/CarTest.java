import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @DisplayName("이름을 가진 자동차를 만들 수 있다")
    @Test
    void createCar(){
        Car car = new Car("aaa");

        assertThat(car).isEqualTo(new Car("aaa"));
    }
}