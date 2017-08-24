package lab_1.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1Driver implements Directions
{
    public static void main(String args[])  {
        Problem1 billy = new Problem1(4,3,East,0);
        billy.rearrangeBeepers();
        billy.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab-1-p1.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(15);  
        World.setVisible(true);
    }
}