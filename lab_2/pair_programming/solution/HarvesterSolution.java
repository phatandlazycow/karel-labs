package lab_2.pair_programming.solution;

import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class HarvesterSolution extends UrRobot
{   //Instance variables (fields) are declared
    
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public HarvesterSolution(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        move();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    
    public void harvestTwoRows() {
        //Before executing this, the robot needs to be facing east
        //Also, the robot must be on the first beeper of the current row
       
        //Your code goes here.
        harvestOneRow();
        goToNextRow();
        harvestOneRow();
        positionForNextHarvest();
    }
    
    public void positionForNextHarvest() {
        //Before executing this, the robot should be facing west, on the last 
        // corner of the current row
        
        //Your code goes here
        turnRight();
        move();
        turnRight();
    }
    
    private void turnRight() {
        //Your code goes here
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    private void harvestOneRow() {
        //your code goes here
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
    }
    
    public void harvestCorner() {
        //your code goes here
        pickBeeper();
    }
    
    private void goToNextRow() {
        //Before executing this, the robot should be facing East on the last corner
        // of the current row
        turnLeft();
        move();
        turnLeft();
        
    }
}

