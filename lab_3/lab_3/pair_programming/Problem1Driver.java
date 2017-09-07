package lab_3.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class Problem1Driver implements Directions
{
    public static void main(String args[])  {
        Problem1 karel = new Problem1(3, 3, North, 0);
        Problem1 carl = new Problem1(3, 5, North, 0);
        karel.checkSurrounded();
        carl.checkSurrounded();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab-3-p1.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}
