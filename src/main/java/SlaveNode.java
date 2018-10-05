import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;

import java.util.List;
import java.util.Map;

public class SlaveNode {
    Integer UID;
    List<SlaveNode> neighbors;
    Map<Integer, SlaveNode> parents;

    /**
     * constructor
     * */
    public SlaveNode(Integer UID, List<SlaveNode> neighbors){
        this.UID = UID;
        this.neighbors = neighbors;
    }

    /**
     * excution of the slaveNode
     * */
    public void execute(){
        if (!parents.containsKey(UID)) {
            parents.put(UID, this);
        }
        for (int rootID : parents.keySet()) {
            for (SlaveNode neighbor : neighbors) {
                Map<Integer, SlaveNode> map = neighbor.parents;
                if (!map.containsKey(rootID)) {
                    map.put(rootID, this);
                }
            }
        }
    }
}
