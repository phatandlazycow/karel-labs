package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        
        movetocarl();
        goback();
    }
    public void goback(){
    turnaround();
    move();
    move();
    move();
    turnright();
    }
    public void movetocarl(){
    turnright();
    move();
    move();
    move();
    putBeeper();
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
    public void pickAndMoveBeeper() {
        pickBeeper();
        movetospot();
        putBeeper();
        moveback();
    }
    public void movetospot(){
    turnLeft();
    move();
    move();
    }
    public void moveback(){
    turnaround();
    move();
    move();
    turnLeft();
    }
    
   
}