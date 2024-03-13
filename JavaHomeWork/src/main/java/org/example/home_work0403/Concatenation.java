package org.example.home_work0403;

public class Concatenation {
    String word1;
    String word2;

    public Concatenation() {}
    public Concatenation(String word1) {
        this.word1 = word1;
    }

    public Concatenation(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public void concatStrings() {
        System.out.println("This is word one: "+ word1 +", this is word two:"+ word2);
    }

}


