import java.io.PrintWriter;

public interface ContactGraph {
    
    public abstract void addNode(String nodeLabel);

    public abstract void deleteNode(String NodeId);

    public abstract void addEdge(int srcNodeId, int tarNodeId);

    public abstract void deleteEdge(int srcNodeId, int tarNodeId);

    public abstract void toggleNodeState(int NodeId, NodeState nodeState);

    public abstract String[] neighbourNodes(int srcNodeId);

    public abstract void printNodes(PrintWriter os);

    public abstract void printEdges(PrintWriter os);

}
