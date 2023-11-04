package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> lotto;

    public Lotto(List<Integer> lotto) {
        validate(lotto);
        this.lotto = lotto;
    }

    public static List<Integer> getLottoRandomNumber(){
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

    public static List<Integer> sortLottoNumber(List<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
}
