package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args){
        List<String> temps = new ArrayList<String>();

        try {
            Scanner file = new Scanner(new File("input.txt"));
            while(file.hasNextLine()) {
                String line = file.nextLine();
                temps.add(Maze.removeWhiteSpace(line));
            }


        } catch (FileNotFoundException e) {
            System.out.println("Usage: Need file input name");
            e.printStackTrace();
        }

        String[] tempsArray = temps.toArray(new String[0]);


        int y = -1;
        for (String s : tempsArray) {
            y++;
            for(int i = 0; i < (s.length()-1); i++) {
                System.out.print("Character: "+s.charAt(i));
                Maze.generateMaze(s.charAt(i), y);
            }
            System.out.print("\n");

            System.out.println("Maze" + Maze.maze[1][0]);
        }

        System.out.println("Maze::::::::::::::");
        for(int i = 0; i <= 11; i++){
            for(int j=0; j <= 11; j++){
                System.out.println(Maze.maze[i][j]);
            }

        }


        }
    }



//class FileOpen {
//
//    Scanner fin;
//    int x;
//    ArrayList[][] maze = new ArrayList[12][12];
//    int y = 0;
//    String ar[];
//
//    FileOpen(String fileName) {
//        try {
//            fin = new Scanner(new File(fileName));
//            while(fin.hasNextLine()){
//                y++;
//                //System.out.println(removeWhiteSpace(fin.nextLine()));
//                String line = fin.nextLine();
//                System.out.println(removeWhiteSpace(line));
//                ar[y] = line;
//                //maze[x][y].add(Splitter(line));
//
//
//
//            }
//        } catch (IOException e) {
//            System.err.println(e);
//        }
//
////        while (fin.hasNextLine()) {
////            String line = fin.nextLine();
////            System.out.println(line);
////            String output = removeWhiteSpace(line);
////            System.out.println(output);
//
////
////
////
////
////                //This calls the methods which runs the whole selection process
////
////            if (!line.equals("0 0 0")) {
////
////                System.exit(0);
////            } else {
////                System.exit(0);
////            }
////        }
//    }
//
//    private static String[] Splitter(String input) {
//        return input.split(" ");
//    }
//
//

