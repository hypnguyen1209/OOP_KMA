package de4;

import java.util.ArrayList;

public class Dictionary {
    private static ArrayList<Word> list;

    public Dictionary() {
        list = new ArrayList<>();
        Word w1 = new Word(1, "one", "một");
        Word w2 = new Word(2, "two", "hai");
        Word w3 = new Word(3, "three", "ba");
        Word w4 = new Word(4, "four", "bốn");
        Word w5 = new Word(5, "five", "năm");
        Word w6 = new Word(6, "six", "sáu");
        Word w7 = new Word(7, "seven", "bảy");
        Word w8 = new Word(8, "eight", "tám");
        Word w9 = new Word(9, "nine", "chín");
        Word w10 = new Word(10, "ten", "mười");
        Word w11 = new Word(11, "eleven", "mười một");
        Word w12 = new Word(12, "twelve", "mười hai");
    }
}