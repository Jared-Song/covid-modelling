import java.io.PrintWriter;

public interface ContactGraph {
    
    public abstract void addNode(String nodeLabel);

    public abstract void deleteNode(String node);

    public abstract void addEdge(String srcNode, String tarNode);

    public abstract void deleteEdge(String srcNode, String tarNode);

    public abstract void toggleNodeState(String node, NodeState nodeState);

    public abstract String[] neighbourNodes(int srcNodeId);

    public abstract void printNodes(PrintWriter os);

    public abstract void printEdges(PrintWriter os);

}
