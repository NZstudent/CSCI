package com.company;
import java.util.ArrayList;

public class Maze {

    static char[][] maze = new char[12][12];

    public Maze(){

    }

    static void generateMaze(ArrayList<String> temps){
        int y = -1;
        for (String s : temps) {
            int x = 0;
            y++;
            for(int i = 0; i <= (s.length()-1); i++) {
                maze[x][y] = s.charAt(i);
                x++;
            }
        }



    }
        static String removeWhiteSpace(String input) {
            StringBuilder newSentence = new StringBuilder();

            for (int i = 0; i < input.length(); ++i) {
                if (input.charAt(i) != ' ') {
                    newSentence.append(input.charAt(i));
                }
            }

            return newSentence.toString();
        }

        static void Print(){
            for(int i = 0; i <= 11; i++){
                System.out.print("\n");
                for(int j=0; j <= 11; j++){
                    System.out.print(Maze.maze[j][i] +" ");
                }
            }
        }


        static void mazeRunner(char[][] maze, int col, int row, int hCol, int hRow){
            int xtemp;
            int ytemp;
            int direction = 1;

            if(maze[col + 1][row] == 'F'||maze[col][row - 1] == 'F'||maze[col][row + 1] == 'F'){
                maze[col][row] = 'o';
                Print();
                System.out.println();
                System.out.println("Maze Complete");
            }else {

                xtemp = col;
                ytemp = row;

                maze[col][row] = 'o';
                Print();
                System.out.println("------------------------");
                System.out.println("Curr position is " + col + ", " + row);
                System.out.println("Hand position is " + hCol + ", " + hRow);

                if (hRow > row) direction = 1;//Facing East
                else if (hCol > col) direction = 2;//Facing North
                else if (row > hRow) direction = 3;//Facing West
                else if (col > hCol) direction = 4; //Facing South

                switch (direction) {
                    case 1://Facing East
                        System.out.println("facing east");
                        if (maze[hCol][hRow] == '.' || maze[hCol][hRow] == 'x') {
                            row++;
                            hCol = col - 1;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col + 1][row] == '.' || maze[col + 1][row] == 'x') {//If facing empty space, move to that space,MOve hand as well
                            col++;
                            hCol++;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col + 1][row] == '#') { //Rotate but no move placing hand on side wall
                            hCol++;
                            hRow--;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col + 1][row] == 'F') {//If facing empty space, move to that space,MOve hand as well
                            mazeRunner(maze, col, row, hCol, hRow);

                        }
                        break;

                    case 2://Facing North
                        System.out.println("Facing North");
                        if (maze[hCol][hRow] == '.' || maze[hCol][hRow] == 'x') {
                            col++;
                            hRow++;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col][row - 1] == '.' || maze[col][row - 1] == 'x') {
                            row--;
                            hRow--;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col][row - 1] == '#') {
                            hRow--;
                            hCol--;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col][row - 1] == 'F') {
                            mazeRunner(maze, col, row, hCol, hRow);

                        }
                        break;

                    case 3://Facing West
                        System.out.println("Facing West");
                        if (maze[hCol][hRow] == '.' || maze[hCol][hRow] == 'x') { //open right pathway go north
                            row--;
                            hCol = col + 1;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col - 1][row] == '.' || maze[col - 1][row] == 'x') {
                            col--;
                            hCol--;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col - 1][row] == '#') {
                            hRow++;
                            hCol--;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        }else if (maze[col - 1][row] == 'F') {
                            mazeRunner(maze, col, row, hCol, hRow);

                        }
                        break;

                    case 4://Facing South
                        System.out.println("Facing South");
                        if (maze[hCol][hRow] == '.' || maze[hCol][hRow] == 'x') {
                            col--;
                            hRow--;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col][row + 1] == '.' || maze[col][row + 1] == 'x') {
                            row++;
                            hRow++;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col][row + 1] == '#') {
                            hCol++;
                            hRow++;
                            maze[xtemp][ytemp] = 'x';
                            mazeRunner(maze, col, row, hCol, hRow);
                        } else if (maze[col][row + 1] == 'F') {
                            mazeRunner(maze, col, row, hCol, hRow);

                        }
                        break;
                    default:
                        break;

                }
            }
    }
}

