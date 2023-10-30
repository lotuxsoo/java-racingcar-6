package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.Car;
import racingcar.model.RandomNumber;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Game {
    List<Car> racingCars;
    public void start() {
        OutputView.printStartMessage();
        makeCarList(InputView.getRacingCars());
        Race race = new Race(racingCars);
        OutputView.printTryMessage();
        int tryNumber = InputView.getTryNumber();
        OutputView.printShowResultString();
        for (int i = 0; i < tryNumber; i++) {
            race.run();
            System.out.println();
        }
    }

    private void makeCarList(List<String> stringCars) {
        racingCars = new ArrayList<>();
        for (String stringCar : stringCars) {
            Car car = new Car(stringCar, 0);
            racingCars.add(car);
        }
    }
}