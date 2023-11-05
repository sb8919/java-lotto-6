package lotto.controller;

public class Validator {
    public static boolean validateInputPurchaseAmount(String input){
        return Integer.parseInt(input) % 1000 == 0 && Integer.parseInt(input) > 0;
    }
    public static boolean validateNumberRange(int num){
        return 1 <= num && num <= 45;
    }

}
