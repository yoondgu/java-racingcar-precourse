package racingcar.controller;

import java.util.List;
import racingcar.model.RacingGame;
import racingcar.view.InputView;

public class RacingController {
    private static final InputView inputView = new InputView();
    private static final RacingGame racingGame = new RacingGame();

    public void run() {
        enrollCarToRace();
    }

    public void enrollCarToRace() {
        List<String> carNames = inputView.inputCarNames();
        racingGame.enrollCars(carNames);
    }
}
