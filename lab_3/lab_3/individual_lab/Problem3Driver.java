package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(1, 1, East, -1);
        karel.carpetRooms();
        karel.turnOff();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig5-9.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}
