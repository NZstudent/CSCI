package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Maze {

    static char[][] maze = new char[12][12];

    static char c;
    public Maze(String line){

    }

    public static void generateMaze(ArrayList<String> temps){
        int y = -1;
        for (String s : temps) {
            int x = 0;
            y++;
            for(int i = 0; i <= (s.length()-1); i++) {
                System.out.print("Character: "+s.charAt(i));
                System.out.println();
                System.out.println("MAZE NUMBER: "+x+ ", " +y);
                maze[x][y] = s.charAt(i);
                System.out.println("----------------------------");
                x++;
            }
        }



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

        public static void Print(){
            for(int i = 0; i <= 11; i++){
                System.out.print("\n");
                for(int j=0; j <= 11; j++){
                    System.out.print(Maze.maze[j][i] +" ");
                }
            }
        }


        public static void mazeRunner(char[][] maze, int x, int y, int handLocX, int handLocY ){
            int xtemp;
            int ytemp;
            if(x == 'F'){
                System.out.println("Maze Complete");
            }else{

//                xtemp = x;
//                ytemp = y;
//                maze[xtemp][ytemp] = 'x';
                maze[x][y] = 'x';
                Print();
                System.out.println("\n--------------------------");
                //Making the Move//

                if(maze[x+1][y] == '.'){
                    x++;
                    mazeRunner(maze,x,y,handLocX,handLocY);
                }if(maze[x][y-1]== '.'){
                    y--;
                    mazeRunner(maze,x,y,handLocX,handLocY);
                }if(maze[x][y+1]=='.'){
                    y++;
                    mazeRunner(maze,x,y,handLocX,handLocY);
                }if(maze[x-1][y]=='.'){
                    x--;
                    mazeRunner(maze,x,y,handLocX,handLocY);

                }else{}

            }



        }
}
