package lab_1.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(1,1,North,1);
        Problem3 carl = new Problem3(1,4,East,0);
        
        karel.giveCarlBeeper();
        carl.pickAndMoveBeeper();
        
        
        karel.turnOff();
        carl.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab-1-p3.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(15);  
        World.setVisible(true);
    }
}