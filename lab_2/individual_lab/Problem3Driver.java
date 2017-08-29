package lab_2.individual_lab;
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        problem3 karel = new problem3 (8, 2, south, -1);
        karel.setField();
        karel.turnOff();
    } 
    static {
        World.reset(); 
        World.readWorld("fig3-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(30);  
        World.setVisible(true);
    }
}
