package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
       grabeepers();
       rearrangebeepers();
       resetposition();
    }
   public void turnaround(){
    turnLeft();
    turnLeft();
    }
    public void turnright(){
    turnLeft();
    turnLeft();
    turnLeft();
    }
   public void resetposition(){
    turnright();
    move();
    turnright();
    move();
    move();
    turnright();
    }
    public void grabeepers(){
        move();
        move();
        pickBeeper();
        turnLeft();
        move();
        pickBeeper();
        move();
        pickBeeper();
        turnaround();
        move3();
        pickBeeper();
        move();
        pickBeeper();
        
    }
    public void rearrangebeepers(){
    turnaround();
    move();
    move();
    turnLeft();
    putBeeper();
    move();
    putBeeper();
    move();
    putBeeper();
    turnaround();
    move3();
    putBeeper();
    move();
    putBeeper();
    }
    public void move3(){
    move();
    move();
    move();
    }
    
}