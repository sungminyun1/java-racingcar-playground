import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingGameTest {

    RacingGame racingGame = new RacingGame("aa,bb,cc");

    @DisplayName(",를 구분자로 자동차들의 이름을 가져와 생성한다")
    @Test
    void createCars(){
        List<Car> cars = racingGame.createCars("aa,bb,cc");
        assertThat(cars.size()).isEqualTo(3);
        assertThat(cars.get(0)).isEqualTo(new Car("aa"));
        assertThat(cars.get(1)).isEqualTo(new Car("bb"));
        assertThat(cars.get(2)).isEqualTo(new Car("cc"));
    }
}