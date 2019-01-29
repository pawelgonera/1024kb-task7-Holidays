package pl._1024kb.task07.manager;

import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;

public class ShortestPathManager
{
    private final ShortestPathAlgorithm shortestPathAlgorithm;

    // Awesome dependency injection
    // Use Dependency Injection to provide algorithm for calculating the shortest path in the graph
    // I suggest to use Dijkstra Algorithm - create new class which implements ShortestPathAlgorithm interface
    public ShortestPathManager(ShortestPathAlgorithm shortestPathAlgorithm)
    {
        this.shortestPathAlgorithm = shortestPathAlgorithm;
    }

    public int getShortestPath(Graph graph, int source, int destination)
    {
        return shortestPathAlgorithm.getShortestPath(graph, source, destination);
    }
}
