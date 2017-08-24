package lab_2.pair_programming.solution;


import kareltherobot.*; 
import java.awt.Color;
/**
 * Write a description of class HarvesterDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HarvesterDriver implements Directions
{
    public static void main(String[] args) {
        HarvesterSolution harry = new HarvesterSolution(2,2, East, 0);
        harry.harvest();
        harry.turnOff();
    }
    
    static {
        World.reset(); 
        World.readWorld("worlds/harvester.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}


