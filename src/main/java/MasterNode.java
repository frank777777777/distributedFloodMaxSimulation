import java.util.ArrayList;
import java.util.List;

public class MasterNode {
    Integer diam;
    List<SlaveNode> subscribers;
    Integer subCount;


    /**
     * constructor
     *
     * */
    public MasterNode(){
        subscribers = new ArrayList<SlaveNode>();
        diam = 0;
        subCount = 0;
    }

    /** subcribe the slave nodes to the master
    *
    * */
    public void subscribe(SlaveNode s){
        subscribers.add(s);
    }

    /** notify the wake up msgs to the slaves after completing the current round
     *
     * */
    public void notify2Master(){
        if(++subCount == subscribers.size()){
            doNextRound();
            subCount = 0;
        }
    }
   /**
    * start the next round of execution
    *
    * */
    public void doNextRound(){
        for(SlaveNode s : subscribers){
            s.execute();
        }
    }



}
