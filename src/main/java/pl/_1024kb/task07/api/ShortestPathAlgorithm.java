package pl._1024kb.task07.api;

import pl._1024kb.task07.exception.PathNoExistException;
import pl._1024kb.task07.graph.Graph;

public interface ShortestPathAlgorithm
{
    /**
        Method calculates the shortest in the graph from source to destination

        @param source - name of source vertex
        @param destination - name of destination vertex
        @throws PathNoExistException - when path from source to destination no exists
        @return The shortest path
     */
    int getShortestPath(Graph graph, int source, int destination);
}
