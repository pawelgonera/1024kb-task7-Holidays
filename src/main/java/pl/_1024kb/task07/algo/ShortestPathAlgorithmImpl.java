package pl._1024kb.task07.algo;

import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;

public class ShortestPathAlgorithmImpl implements ShortestPathAlgorithm
{
    private static final int NO_VERTEX_CONNECTION = -1;

    @Override
    public int getShortestPath(Graph graph, int source, int destination)
    {
        int totalDistance = 0;
        graph.setPreviousWaypoint(source);
        graph.setNextWaypoint(source);
        while(graph.getNextWaypoint() != destination)
        {
            System.out.println("next: " + graph.getNextWaypoint());
            totalDistance += findShortestPath(graph, graph.getNextWaypoint());

        }

        return totalDistance;
    }

    private static int findShortestPath(Graph graph, int start)
    {
        int[][] graphMatrix = graph.getNeighborhoodMatrix();
        int distance = 0;
        int min = Integer.MAX_VALUE;

        for(int next = 0; next < graphMatrix.length; next++)
        {
            if(next == graph.getPreviousWaypoint())
                continue;

            distance = graphMatrix[start][next];
            if(distance < min && distance != NO_VERTEX_CONNECTION)
            {
                min = distance;
                graph.setNextWaypoint(next);
            }
        }
        graph.setPreviousWaypoint(start);


        return min;
    }
}
