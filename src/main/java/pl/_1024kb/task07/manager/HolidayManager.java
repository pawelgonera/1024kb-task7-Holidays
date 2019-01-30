package pl._1024kb.task07.manager;

import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.manager.converter.GraphMatrixConverter;

public class HolidayManager
{
    private final ShortestPathManager shortestPathManager;
    private GraphMatrixConverter converter = GraphMatrixConverter.getInstance();

    public HolidayManager(ShortestPathManager shortestPathManager)
    {
        this.shortestPathManager = shortestPathManager;
    }

    public int getShortestPath(String fileName, int source, int destination)
    {
        Graph graph = converter.convertMatrixToGraph(fileName);

        return shortestPathManager.getShortestPath(graph, source, destination);
    }
}
