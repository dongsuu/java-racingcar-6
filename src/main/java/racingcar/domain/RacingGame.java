package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    List<Car> cars = new ArrayList<>();
    public void initGame(){

    }

    public void startGame(){

    }

    public void endGame(){

    }

    public void addCar(Car car){
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}