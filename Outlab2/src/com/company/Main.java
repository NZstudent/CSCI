package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        

        Hash HT = new Hash(30);

        String[] Values = {"Hunter", "Jon", "Dave", "Jody"};
        String[] keys = {"1234", "5032", "1", "5031"};

        HT.add(Values,keys);
        HT.displayTheStack();

//        try {
//            Scanner file = new Scanner(new File("input.txt"));
//            while(file.hasNextLine()) {
//                String line = file.nextLine();
//
//            }
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Usage: Need file input name");
//            e.printStackTrace();
//        }
    }

}

class Hash {
    String[] Array;
    int arraySize;
    int count;

    public Hash(int size) {
        arraySize = size;
        Array = new String[size];
        Arrays.fill(Array, "-1");
    }


    public void add(String[] values, String[] key) {
        for (int i = 0; i < values.length; i++) {
            String newVal = values[i];
            String newkey = key[i];

            int index = Integer.parseInt(newkey) % arraySize;
            while (Array[index] != "-1") {
                ++index;
                System.out.println("Collision trying " + index + " instead.");
                index %= arraySize;
            }
            Array[index] = newVal;
        }


    }

    public void delete(int key, String Value) {

    }

    public void print() {

    }

    static String removeSpace(String input) {
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) != ' ') {
                newSentence.append(input.charAt(i));
            }
        }

        return newSentence.toString();
    }


    public void displayTheStack() {

        int increment = 0;

        for (int m = 0; m < 3; m++) {

            increment += 10;

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                System.out.format("| %3s " + " ", n);

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                if (Array[n].equals("-1"))
                    System.out.print("|      ");

                else
                    System.out
                            .print(String.format("| %3s " + " ", Array[n]));

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

        }
    }

}

class HT {
}


//https://www.youtube.com/watch?v=B4vqVDeERhI