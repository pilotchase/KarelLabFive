
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while(frontIsClear()){
        pickNorth();
        pickSouth();
        }
    }
    
    public void pickNorth(){
        while(frontIsClear()){
            if(nextToABeeper()){
                while(nextToABeeper()){
                pickBeeper();
                }
                move();
                pickNorth();
            } else {
                move();
                pickNorth();
            }
        } 
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void pickSouth(){
        while(frontIsClear()){
            if(nextToABeeper()){
                while(nextToABeeper()){
                pickBeeper();
                }
                move();
                pickSouth();
            } else {
                move();
                pickSouth();
            }
        } 
        turnLeft();
        move();
        turnLeft();
    }
   
}

