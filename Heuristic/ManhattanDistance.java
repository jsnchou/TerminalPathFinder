package Heuristic;

import Grid.Grid;
import Grid.Cell;

/**
 * This is the Manhattan Distance Heuristic Class.
 */
public class ManhattanDistance extends Heuristic {
    @SuppressWarnings("unused")
    // Global Variables
    private Grid grid;
    private int end_x;
    private int end_y;

    /**
     * This is the constructor of the ManhattanDistance() class.
     * @param grid the grid
     */
    public ManhattanDistance(Grid grid) {
        super(grid);
        this.end_x = grid.getEndCell()[0][0];
        this.end_y = grid.getEndCell()[0][1];
    } // ends the ManhattanDistance() constructor


    /**
     * This method will get the Manhattan Distance heurisitc for a node.
     * @param cell the current cell
     * @return a float value that will be used as a heurisitic (represents distance to goal) found using the Manhattan Distance
     */
    public float getHeuristic(Cell cell) {
        return (float) Math.abs(cell.getX()-end_x) + Math.abs(cell.getY()-end_y);
    }
} // ends the ManhattanDistance() class
