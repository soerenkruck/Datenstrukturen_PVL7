package Loesung_G33;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int index;

    private List edges;

    private List<Integer> destinations;

    public Node(int index) {
        this.index = index;
        this.edges = new ArrayList();

        destinations = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    public void addDestination(int node) {
        this.destinations.add(node);
    }

    public List<Integer> getDestinations() {
        return (destinations.size() == 0) ? null : this.destinations;
    }

}
