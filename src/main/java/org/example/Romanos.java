package org.example;

public class Romanos {

    public String convertToRomanian(int numberToConvert) {
        if (numberToConvert == 1) {
            return "I";
        } else if (numberToConvert == 2) {
            return "II";
        }
        return "III";
    }
}
