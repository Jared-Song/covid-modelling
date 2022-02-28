public class NodeList {

    private static int INITIAL_NODES = 0;

    private int size;
    private Node[] nodes;

    public NodeList() {   
        size = INITIAL_NODES;
    }

    public int getSize(){
        return size;
    }

    public Node[] getNodes() {
        return nodes;
    }

    public void addNode(Node node) {
        size++;
        this.nodes[size] = node;
    }

    public void removeNode(Long nodeId) {
        int index = getNodeIndex(nodeId);
        deleteNode(index);
    }

    private int getNodeIndex(Long nodeId) {
        int index = -1;
        for (Node node : nodes) {
            index++;
            if (node.getId() == nodeId) {
                return index;
            }
        }

        return -1;
    }

    private void deleteNode(int index) {
        Node[] tmp = new Node[size - 1];

        for (int i = 0; i < index; i++) {
            tmp[i] = this.nodes[i];
        }

        for (int j = index; j < size; j++) {
            tmp[j] = this.nodes[j + 1];
        }
        this.nodes = tmp;
        size--;
    }

}
