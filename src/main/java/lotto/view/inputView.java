package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class inputView {
    static final String GET_INPUT_PURCHASE_AMOUNT_MESSAGE = "당첨 번호를 입력해 주세요.";

    public static String getInputPurchaseAmount(){
        System.out.println(GET_INPUT_PURCHASE_AMOUNT_MESSAGE);
        return Console.readLine();
    }


}
