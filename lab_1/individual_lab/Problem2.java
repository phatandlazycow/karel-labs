package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        firsthalfcircle();
        secondhalfcircle();
        lasthalfcircle();
    }
   public void firsthalfcircle(){
       turnright();
       move();
       turnLeft();
       move();
       move();
       turnLeft();
       move();
       move();
    }
    public void secondhalfcircle(){
        turnright();
        move();
        move();
        turnright();
        move();
        move();
        turnright();
        move();
        move();
        turnright();
        move();
        move();
    }
    public void lasthalfcircle(){
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    turnLeft();
    }
    public void turnright(){
    turnLeft();
    turnLeft();
    turnLeft();
    }
}