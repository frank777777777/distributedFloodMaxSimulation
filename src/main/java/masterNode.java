import java.util.ArrayList;
import java.util.List;

public class masterNode {
    Integer diam;
    List<slaveNode> subscribers;
    Integer subCount;


    /**
     * constructor
     *
     * */
    public masterNode(){
        subscribers = new ArrayList<slaveNode>();
        diam = 0;
        subCount = 0;
    }

    /** subcribe the slave nodes to the master
    *
    * */
    public void subscribe(slaveNode s){
        subscribers.add(s);
    }

    /** notify the wake up msgs to the slaves after completing the current round
     *
     * */
    public void notify2Master(){
        if(++subCount == subscribers.size(){
            doNextRound();
            subCount = 0;
        }
    }
   /**
    * start the next round of execution
    *
    * */
    public void doNextRound(){
        for(slaveNode s : subscribers){
            s.execute();
        }
    }



}
