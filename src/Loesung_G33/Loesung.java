package Loesung_G33;


import PVL.PVL7;

import java.util.ArrayList;
import java.util.List;

public class Loesung implements PVL7 {

    private List<Edge> edges = new ArrayList();
    private List<Node> nodes = new ArrayList();

    @Override
    public int newNode() {

        nodes.add(new Node(nodes.size()));
        return nodes.size() - 1;
    }

    @Override
    public boolean setEdge(int from, int to) {

        if (to > nodes.size() - 1 || doesEdgeAlreadyExist(from, to) || to == from)
            return false;   // Gibt false zurück, wenn der Zeilknoten gar nicht existiert oder die Kante bereits existiert

        this.edges.add(new Edge(nodes.get(from), nodes.get(to)));

        nodes.get(from).addDestination(to);
        nodes.get(to).addDestination(from);

        return true;
    }

    @Override
    public List<List<Integer>> getEdges() {

        List<List<Integer>> tmp = new ArrayList<>();

        for (Node n: nodes) {
            if (n.getDestinations() != null)
                tmp.add(n.getDestinations());
        }

        return tmp;
    }

    @Override
    public List<List<Integer>> getNGons(int n) {
        return null;
    }

    @Override
    public boolean hasFullCircle() {
        return false;
    }

    @Override
    public List<Integer> getLongestPath() {
        return null;
    }

    public boolean doesEdgeAlreadyExist(int from, int to) {

        for (Edge e: edges) {
            if (e.getNode1().equals(nodes.get(from)) && e.getNode2().equals(nodes.get(to)))
                return true;
        }

        return false;
    }
}
