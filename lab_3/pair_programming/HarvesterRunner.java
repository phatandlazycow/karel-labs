package lab_3.pair_programming;

/**
   @Author:
      Date:
   Teacher:
       Lab: Conditional Harvester
      Misc: Utilizes the Robot Class (no longer UrRobot)
  */
import kareltherobot.*;
import java.awt.Color;

public class HarvesterRunner implements Directions
{
    public static void main(String args[])  {
        ConditionalHarvester karel = new ConditionalHarvester(2, 1, East, 0);  
        
        karel.move();
        karel.harvestTwoRows();
        karel.harvestTwoRows();
        karel.harvestTwoRows();
        
        karel.turnOff();  
    } 

    static {
        String world1, world2, world3;
        world1 = "fig5-1.kwld";
        world2 = "fig5-1A.kwld";
        world3 = "fig5-1B.kwld";
        String randomWorld;
        
        World.reset();
        
        //Randomizes the world options use the text files above
        double random;
        random = Math.random();

        if (random <0.3) {
            randomWorld = world1;
        }   
        else if (random > 0.67) {
                randomWorld = world3;
            }
        
        
        else {
            randomWorld = world2;
            
        }
        
        World.readWorld(randomWorld); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}