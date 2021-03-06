package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ArrayList<String> temps = new ArrayList<>();

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

        Maze.generateMaze(temps);
        Maze.Print();
        Maze.mazeRunner(Maze.maze, 0,2, 0, 3);


        }
    }