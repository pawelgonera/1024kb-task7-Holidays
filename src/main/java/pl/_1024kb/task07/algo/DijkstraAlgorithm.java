package pl._1024kb.task07.algo;

import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.exception.PathNoExistException;
import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.graph.Vertex;

import java.util.*;

public class DijkstraAlgorithm implements ShortestPathAlgorithm
{
    private static final int NO_VERTEX_CONNECTION = -1;
    private int[][] graphMatrix;
    private List<Vertex> verticesSet = new LinkedList<>();
    private List<Integer> shortestPathVertices = new LinkedList<>();

    @Override
    public int getShortestPath(Graph graph, int source, int destination)
    {
        graphMatrix = graph.getNeighborhoodMatrix();

        if(source == destination)
            return 0;
        else
            return calculateShortestPath(source, destination);
    }

    private int calculateShortestPath(int start, int stop)
    {
        setVerticesAsInfiniteDistances(verticesSet);

        int previousVertexDistance = 0;

        while(shortestPathVertices.size() <= verticesSet.size())
        {
            shortestPathVertices.add(start);

            updateVertices(start, previousVertexDistance);

            start = findShortestPath(shortestPathVertices, verticesSet);

            previousVertexDistance = verticesSet.get(start).getDistance();
        }

        int shortestPath = verticesSet.get(stop).getDistance();
        isPathNoExist(shortestPath);

        return shortestPath;
    }

    private void setVerticesAsInfiniteDistances(List<Vertex> verticesSet)
    {
        for(int i = 0; i <= graphMatrix.length; i++)
        {
            verticesSet.add(new Vertex(Integer.MAX_VALUE, i));
        }
    }

    private void updateVertices (int pickedVertex, int previousVertexDistance)
    {
        for (int nextVertex = 0; nextVertex < graphMatrix.length; nextVertex++)
        {
            if (graphMatrix[pickedVertex][nextVertex] != NO_VERTEX_CONNECTION && !shortestPathVertices.contains(nextVertex))
            {
                for (Vertex vertex : verticesSet)
                {
                    int toUpdateVertexDistance = graphMatrix[pickedVertex][nextVertex] + previousVertexDistance;
                    int actualVertexDistance = vertex.getDistance();
                    boolean isUpdatedDistanceGreaterThanActualDistance = toUpdateVertexDistance > actualVertexDistance;
                    if (vertex.getNumber() == nextVertex && !isUpdatedDistanceGreaterThanActualDistance)
                        vertex.setDistance(graphMatrix[pickedVertex][nextVertex] + previousVertexDistance);
                }
            }
        }
    }

    private int findShortestPath(List<Integer> sptSet, List<Vertex> vertSet)
    {
        int minDist = Integer.MAX_VALUE;
        int vertexNumber = 0;
        for(Vertex vertex : vertSet)
        {
            if(sptSet.contains(vertex.getNumber()))
                continue;

            int distance = vertex.getDistance();
            if(distance < minDist)
            {
                minDist = distance;
                vertexNumber = vertex.getNumber();
            }
        }

        return vertexNumber;
    }

    private void isPathNoExist(int result)
    {
        if(result == Integer.MAX_VALUE)
            throw new PathNoExistException("Nie ma połączenia");
    }

}
