package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        line1();
        line2();
        line3();
        line4();
        line5();
        line6();
        line7();
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
    turnright();
    move();
    turnright();
    move();
    }
    public void line5(){
        place();
        place();
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
    }
    public void line6(){
    place();
    putBeeper();
    turnright();
    move();
    turnright();
    move();
    putBeeper();
    move();
    }
    public void line7(){}
    }

