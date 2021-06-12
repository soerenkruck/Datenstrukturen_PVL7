package Loesung_G33;

import java.util.ArrayList;
import java.util.List;

public class Edge {

    private Node node1, node2;

    public Edge(Node startNode, Node destNode) {
        this.node1 = startNode;
        this.node2 = destNode;
    }

    public Node getNode1() {
        return node1;
    }

    public void setNode1(Node node1) {
        this.node1 = node1;
    }

    public Node getNode2() {
        return node2;
    }

    public void setNode2(Node node2) {
        this.node2 = node2;
    }

}
