package Loesung_G33;

public class Test {

    public static void main(String[] args) {
        Loesung graph = new Loesung();

        graph.newNode();
        graph.newNode();
        graph.newNode();
        graph.newNode();

        graph.setEdge(0, 1);
        graph.setEdge(0, 1);
        graph.setEdge(0, 0);
        graph.setEdge(0, 2);
        graph.setEdge(0, 3);
        graph.setEdge(0, 4);
        graph.setEdge(1, 3);
        graph.setEdge(2, 3);

        System.out.println(graph.getEdges());
    }

}
