package com.company;
import java.util.ArrayList;

public class Maze {

    static char[][] maze = new char[12][12];

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


        public static void mazeRunner(char[][] maze, int col, int row, int hCol, int hRow){
            int xtemp;
            int ytemp;

            if(col == 'F'){
                System.out.println("Maze Complete");
            }else{
                maze[col][row] = 'x';
                maze[hCol][hRow] = '*';
                Print();
                //Check down
                if(maze[hCol][hRow]=='.'
                ){

                    mazeRunner(maze, col, row, hCol, hRow);
                //CHeck right
                }else if(maze[hCol+1][hRow-1]=='.' ){
                    col++;
                    hCol = col;
                    mazeRunner(maze, col, row, hCol, hRow);
                //check up
                }else if(maze[hCol][hRow-2]=='.' ){
                    row--;
                    hRow = row;
                    hCol++;
                    mazeRunner(maze, col, row, hCol, hRow);
                //check left
                }else if(maze[hCol-1][hRow]=='.'){
                    col--;
                    hRow = row-1;
                    mazeRunner(maze, col, row, hCol, hRow);
                }
                maze[col][row] = 'x';
                //maze[handLocX][handLocY] = 'o';
                Print();
                System.out.println("\n---------------------------");


//                //Go right
//                if(maze[x+1][y]=='.') {
//                    x++;
//                    handLocX++;
//                    mazeRunner(maze, x, y, handLocX, handLocY);
//                }
//                //Go Directly Down
//                if(maze[handLocX][handLocY] == '.'){
//                    y++;
//                    handLocX--;
//                    mazeRunner(maze,x,y,handLocX,handLocY);
//                //go Directly up
//                }if(maze[handLocX][handLocY] == '#' && maze[x+1][y]=='#'){
//                    y--;
//
//                    mazeRunner(maze,x,y,handLocX,handLocY);
//
//                }
                //go straight down
//                if(maze[handLocX][handLocY] == '#' &&)

//                xtemp = x;
//                ytemp = y;
//                maze[xtemp][ytemp] = 'x';

                //System.out.println("\n--------ruck------------------");
                //Making the Move//

//                if(maze[x+1][y] == '.'){
//                    x++;
//                    mazeRunner(maze,x,y,handLocX,handLocY);
                //Go Right
//                }if(maze[x][y-1]== '.'){
//                    y--;
//                    mazeRunner(maze,x,y,handLocX,handLocY);
                //Go up
//                }if(maze[x][y+1]=='.'){
//                    y++;
//                    mazeRunner(maze,x,y,handLocX,handLocY);
                //Go Down
//                }if(maze[x-1][y]=='.'){
//                    x--;
//                    mazeRunner(maze,x,y,handLocX,handLocY);
                //Go left

//                }else{}

            }



        }
}
