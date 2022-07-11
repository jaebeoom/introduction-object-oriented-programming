package com.in28minutes.opps;

public class BookReader {

    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(50);
        Book cleanCode = new Book(40);

        artOfComputerProgramming.read();
        effectiveJava.read();
        cleanCode.read();

        artOfComputerProgramming.setNumOfCopies(2);
        effectiveJava.setNumOfCopies(3);
        cleanCode.setNumOfCopies(1);

        artOfComputerProgramming.increaseNumOfCopies(1);
        effectiveJava.increaseNumOfCopies(2);
        cleanCode.increaseNumOfCopies(3);

        artOfComputerProgramming.decreaseNumOfCopies(3);
        effectiveJava.decreaseNumOfCopies(1);
        cleanCode.decreaseNumOfCopies(2);

        System.out.println(artOfComputerProgramming.getNumOfCopies());
        System.out.println(effectiveJava.getNumOfCopies());
        System.out.println(cleanCode.getNumOfCopies());
    }
}
