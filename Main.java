package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        try {
            new FileOpen("input.txt");

        } catch (Exception e) {
            System.out.println("Usage: Need file input name");
            System.err.println(e);
        }

    }
}


class FileOpen {

    Scanner fin;
    int i;

    FileOpen(String fileName) {
        try {
            fin = new Scanner(new File(fileName));
            while(fin.hasNextLine()){
                i++;
                //System.out.println(removeWhiteSpace(fin.nextLine()));
                String line = fin.nextLine();
                System.out.println(removeWhiteSpace(line));
                System.out.println(i);

                //new Maze(line);


            }

        } catch (IOException e) {
            System.err.println(e);
        }
//        while (fin.hasNextLine()) {
//            String line = fin.nextLine();
//            System.out.println(line);
//            String output = removeWhiteSpace(line);
//            System.out.println(output);

//
//
//
//
//                //This calls the methods which runs the whole selection process
//
//            if (!line.equals("0 0 0")) {
//
//                System.exit(0);
//            } else {
//                System.exit(0);
//            }
//        }
    }

    private static String[] Splitter(String input) {
        return input.split(" ");
    }


    public static String removeWhiteSpace(String input) {
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) != ' ') {
                newSentence.append(input.charAt(i));
            }
        }

        return newSentence.toString();
    }
}