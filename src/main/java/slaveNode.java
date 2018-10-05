import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;

import java.util.List;
import java.util.Map;

public class slaveNode {
    Integer UID;
    List<slaveNode> neighbors;
    Map<Integer, slaveNode> parents;

    /**
     * constructor
     * */
    public slaveNode(Integer UID, List<slaveNode> neighbors){
        this.UID = UID;
        this.neighbors = neighbors;
    }

    /**
     * excution of the slaveNode
     * */
    public void execute(){
        for(slaveNode n : neighbors){
/*            Map<Integer, slaveNode> map = n.parents;
            if(map.containsKey())*/

        }
    }

    public void
}
