public class Node {
    private int id;
    private NodeState state;
    private String label;

    public Node() {
    }

    public Node(NodeState state, String label) {
        this.state = state;
        this.label = label;
    }

    public Node(int id, NodeState state, String label) {
        this.id = id;
        this.state = state;
        this.label = label;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setState(NodeState state) {
        this.state = state;
    }

    public NodeState getState() {
        return this.state;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
