package com.company;

import java.util.ArrayList;

public class Maze {
    ArrayList[][] maze = new ArrayList[12][12];
    int y = 0;

    public Maze(String line){
        generateMaze(line);

    }

    public void generateMaze(String line){
        System.out.println();
        System.out.println("MAZE:");
        String output = FileOpen.removeWhiteSpace(line);

        for (int i = 0; i < output.length(); ++i) {
            maze[y][i].add(output.charAt(i));
            y++;
            }
        System.out.println(maze);
    }
}
