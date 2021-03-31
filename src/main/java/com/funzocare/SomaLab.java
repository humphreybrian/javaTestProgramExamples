package com.funzocare;

public class SomaLab {
    public String soma(int number){
        if (number ==0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fungua Kitabu";
        if (number % 5 == 0) return "Funga Kitabu";
        return String.valueOf(number);
    }
}
