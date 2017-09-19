
import kareltherobot.*; 


/**
 * @author :  C. Morgan
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        // false return = odd, true return = even
        if(oddOrEven()){
            pickEast();
        } else {
            pickWest();
        }
    }
    
    public boolean oddOrEven(){
        int count = 0;
        while(nextToABeeper()){
            pickBeeper();
            count++;
        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }
    
    public void pickEast(){
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        while(nextToABeeper()){
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
    }
    
    public void pickWest(){
        turnLeft();
        move();
        while(nextToABeeper()){
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
    }
   
}

