package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess33(int guess) {
        return guess == 33;
    }

    public String countTo(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<= number; i++) {
            stringBuilder.append(i);
            if(i < number) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
