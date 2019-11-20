package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Maze {

    static int[][] maze = new int[11][11];
    public static int x = 0;
    public Maze(String line){

    }

    public static void generateMaze(char ch, int y){
        System.out.println();
        System.out.println("MAZE:"+ ch);
        System.out.println("MAZE NUMBER: "+x+ ", " +y);
        maze[x][y] = ch;
        x++;

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

        public static void Print(String input){
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (i > 0) {
                    result.append(" ");
                }

                result.append(input.charAt(i));
            }
            System.out.println(result.toString());
        }
}
