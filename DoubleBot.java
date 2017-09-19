


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        findBeepers();
        countBeepers();
        dropBeepers(drop_count);
    }
    
    public boolean findBeepers(){
        while(frontIsClear()){
            if(nextToABeeper()){
                return true;
            } else {
                move();
                findBeepers();
            }
        }
    }
    
    public int countBeepers(){
        int beepers = 0;
        while(nextToABeeper()){
            pickBeeper();
            beepers++;
        }
        return beepers;
    }
    
    public void dropBeepers(int drop_count){
        move();
        for(drop_count = this.countBeepers(); drop_count > 0; drop_count--){
            putBeeper();
        }
    }
}
