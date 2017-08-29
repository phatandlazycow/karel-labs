package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        move();
        harvest2();
        harvest2();
        harvest2();
    }
    /**
     * precondition: robot is facing east one block away from a beeper
     * postcondition: robot is facing east two streets above start 
     */
    public void harvest2(){
        harvestone();
        repositionleft();
        harvestone();
        repositionright();
    }
    public void repositionleft(){
        turnLeft();
        move();
        turnLeft();
        move();
    }
    public void turnright(){
    turnLeft();
    turnLeft();
    turnLeft();
   
    }
    public void repositionright(){
        turnright();
        move();
        turnright();
        move();
    }
    public void harvestone(){
       pick();
       pick();
       pick();
       pick();
       pick();
        
    }
    public void pick(){
        pickBeeper();
        move();
    }
}

