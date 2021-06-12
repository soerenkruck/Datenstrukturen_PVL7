package PVL;


import java.util.List;

public interface PVL7{
    int newNode();
    boolean setEdge(int from, int to);
    List<List<Integer>> getEdges();
    List<List<Integer>> getNGons(int n);
    boolean hasFullCircle();
    List<Integer> getLongestPath();
}
