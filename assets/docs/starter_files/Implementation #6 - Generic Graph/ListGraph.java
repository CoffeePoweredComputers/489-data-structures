import java.util.*;

public class ListGraph<E>{

    public static class Edge<E> {
        
        /* Implement the edge class  */

    }

    private final boolean directed;
    private final boolean weighted;
    private Map<E, List<Edge<E>>> map;

    ListGraph(boolean directed, boolean weighted) {
        this.directed = directed;
        this.weighted = weighted;
    }

    public void addVertex(E vertex){
        return; //method stub. Remove when implementing.
    }

    public void removeVertex(E vertex){
        return; //method stub. Remove when implementing.
    }

    public Set<E> getVertecies(){
        return new HashSet<>();
    }

    public void addEdgeUnweighted(E source, E dest){
        return; //method stub. Remove when implementing.
    }

    public void addEdgeWeighted(E source, E dest, int weight){
        return; //method stub. Remove when implementing.
    }

    public List<Edge<E>> getEdges(E source){
        return new ArrayList<>(); //method stub. Remove when implementing.
    }

    public void removeEdge(E source, E dest){
        return; //method stub. Remove when implementing.
    }

    public List<E> bfs(E source){
        return new ArrayList<>(); //method stub. Remove when implementing
    }

    public List<E> dfs(E source){
        return new ArrayList<>(); //method stub. Remove when implementing
    }
}
