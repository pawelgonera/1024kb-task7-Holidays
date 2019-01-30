package pl._1024kb.task07.manager;

import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;

public class ShortestPathManager
{
    private final ShortestPathAlgorithm shortestPathAlgorithm;

    public ShortestPathManager(ShortestPathAlgorithm shortestPathAlgorithm)
    {
        this.shortestPathAlgorithm = shortestPathAlgorithm;
    }

    public int getShortestPath(Graph graph, int source, int destination)
    {
        return shortestPathAlgorithm.getShortestPath(graph, source, destination);
    }
}
