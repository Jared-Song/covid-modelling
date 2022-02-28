import java.io.PrintWriter;
import java.util.ArrayList;

public class AdjacencyMatrix extends AbstractGraph {
    private static final int INITIAL_SIZE = 1;
    private static final int INITIAL_NODES = 0;
    private final int NOT_FOUND = -1;
    private int numNodes;
    private Node[] nodeArray;
    private boolean[][] matrix;
    private ArrayList<String> nodeLabels;

    public AdjacencyMatrix() {
        numNodes = INITIAL_NODES;
        nodeLabels = new ArrayList<String>();
        nodeArray = new Node[INITIAL_SIZE];
        matrix = new boolean[INITIAL_SIZE][INITIAL_SIZE];
    }

    public void addNode(String nodeLabel) {
        if (!nodeExists(nodeLabel)) {
            nodeLabels.add(nodeLabel);
            Node newNode = new Node(numNodes, NodeState.H, nodeLabel);
            addNodeToMatrix(newNode);
        }
    }

    public void deleteNode(String nodeLabel) {
        if (nodeExists(nodeLabel)) {
            nodeLabels.remove(nodeLabel);
            int index = getNodeIndex(nodeLabel);
            removeNodeFromMatrix(index);
        }

    }

    public void addEdge(String srcNode, String tarNode) {
        // TODO Auto-generated method stub

    }

    public void deleteEdge(String srcNode, String tarNode) {
        // TODO Auto-generated method stub

    }

    public void toggleNodeState(String node, NodeState nodeState) {
        // TODO Auto-generated method stub

    }

    public void printNodes(PrintWriter os) {
        for (int i = 0; i < numNodes; i++) {
            os.print("(" + nodeArray[i].getLabel() + "," + nodeArray[i].getState() + ") ");
        }
        os.println();
    }

    public void printEdges(PrintWriter os) {
        String source;
        String target;
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                if (matrix[i][j] == true) {
                    source = nodeArray[i].getLabel();
                    target = nodeArray[j].getLabel();
                    os.printf("%s %s\n", source, target);
                }
            }
        }
    }

    private void addNodeToMatrix(Node node) {
        Node[] tmp = new Node[nodeArray.length + 1];
        for (int i = 0; i < numNodes; i++) {
            tmp[i] = nodeArray[i];
        }
        tmp[numNodes] = node;
        nodeArray = tmp;
        numNodes++;
    }

    private boolean nodeExists(String label) {
        return nodeLabels.contains(label);
    }

    private int getNodeIndex(String label) {
        int index = 0;
        for (Node node : nodeArray) {
            if (node.getLabel().equals(label)) {
                return index;
            }
            index++;
        }
        return NOT_FOUND;
    }

    private void removeNodeFromMatrix(int index) {
        Node[] tmp = new Node[nodeArray.length - 1];

        for (int i = 0; i < index; i++) {
            tmp[i] = nodeArray[i];
        }

        for (int j = index; j < numNodes; j++) {
            tmp[j] = nodeArray[j + 1];
        }
        nodeArray = tmp;
        numNodes--;
    }

    public String[] neighbourNodes(int srcNodeId) {
        // TODO Auto-generated method stub
        return null;
    }

}
