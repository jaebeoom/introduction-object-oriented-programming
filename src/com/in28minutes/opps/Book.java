package com.in28minutes.opps;

public class Book {
    private int numOfCopies;

    Book (int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }
    void setNumOfCopies(int numOfCopies) {
        if (numOfCopies > 0)
            this.numOfCopies = numOfCopies;
    }

    void increaseNumOfCopies(int howMuch) {
        setNumOfCopies(this.numOfCopies + howMuch);
    }

    void decreaseNumOfCopies(int howMuch) {
        setNumOfCopies(this.numOfCopies - howMuch);
    }

    void read() {
        System.out.println("Book read");
    }
}
