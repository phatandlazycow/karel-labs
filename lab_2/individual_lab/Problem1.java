package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        line1();
        line2();
        line3();
        line4();
    }
    public void turnright(){
    turnLeft();
    turnLeft();
    turnLeft();
    }
    public void line1(){
    move();
    putBeeper();
    turnright();
    move();
    turnLeft();
    move();
}
    public void place(){
        putBeeper();
        move();
        move();
}
    public void line2(){
    turnLeft();
    place();
    putBeeper();
    move();
    turnright();
    move();
    }
    public void line3(){
    turnright();
    place();
    place();
    putBeeper();
    move();
    turnLeft();
    move();
    }
    public void line4(){
    turnLeft();
    place();
    place();
    place();
    putBeeper();
    }
    
}
