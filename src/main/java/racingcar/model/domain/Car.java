package racingcar.model.domain;

import racingcar.dto.CarDTO;
import racingcar.model.constants.ErrorMessage;
import racingcar.model.constants.GameRule;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > GameRule.NAME_LENGTH_UPPER_LIMIT) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_OVER);
        }
    }

    public void move(int number) {
        if (number > GameRule.CAR_FORWARD_LOWER_LIMIT) {
            position++;
        }
    }

    public CarDTO to() {
        return new CarDTO(name, position);
    }
}