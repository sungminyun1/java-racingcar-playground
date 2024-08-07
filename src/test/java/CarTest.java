import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @DisplayName("이름을 가진 자동차를 만들 수 있다")
    @Test
    void createCar(){
        Car car = new Car("aaa");

        assertThat(car).isEqualTo(new Car("aaa"));
    }

    @DisplayName("자동차의 이름은 5글자를 초과할 수 없다")
    @Test
    void createCarTooLongName(){
        assertThatThrownBy(() ->new Car("LOOOOONG")).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("4이상의 출력이라면 자동차는 전진한다")
    @Test
    void carMove(){
        Car car = new Car("aaa");
        car.move(4);

        Car car2 = new Car("bbb");
        car.move(3);

        assertThat(car).isEqualTo(new Car("aaa", 1));
        assertThat(car2).isEqualTo(new Car("bbb", 0));
    }

    @DisplayName(",를 기준으로 자동차 여러대를 만들 수 있다")
    @Test
    void createCars(){
        Cars cars = new Cars("aaa,bbb,ccc");
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("aaa"));
        carList.add(new Car("bbb"));
        carList.add(new Car("ccc"));
        Cars cars2 = new Cars(carList);


        assertThat(cars).isEqualTo(cars2);
    }
}