package lab_1.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2Driver implements Directions
{
    public static void main(String args[])  {
        Problem2 billy = new Problem2(3,5,North,0);
        billy.shuttleRace();
        billy.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab-1-p2.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(15);  
        World.setVisible(true);
    }
}