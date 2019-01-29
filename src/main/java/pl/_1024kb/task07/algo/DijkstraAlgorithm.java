package pl._1024kb.task07.algo;

import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.graph.Vertex;

import java.util.*;

public class DijkstraAlgorithm implements ShortestPathAlgorithm
{
    private static final int NO_VERTEX_CONNECTION = -1;
    private int[][] graphMatrix;
    private List<Vertex> verticesSet = new LinkedList<Vertex>();
    private List<Integer> shortestPathVertices = new LinkedList<Integer>();

    @Override
    public int getShortestPath(Graph graph, int source, int destination)
    {
        graphMatrix = graph.getNeighborhoodMatrix();

        return dijkstraAlgorithm(source, destination);
    }

    private int dijkstraAlgorithm(int start, int stop)
    {
        setVerticesAsInfiniteDistances(verticesSet);

        int previousVertexDistance = 0;

        while(shortestPathVertices.size() <= verticesSet.size())
        {
            shortestPathVertices.add(start);

            updateVertices(start, previousVertexDistance);

            start = findShortestPathVertex(shortestPathVertices, verticesSet);

            previousVertexDistance = verticesSet.get(start).getDistance();
        }

        return verticesSet.get(stop).getDistance();
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

        for (int i = 0; i < graphMatrix.length; i++)
        {
            if (graphMatrix[pickedVertex][i] != NO_VERTEX_CONNECTION && !shortestPathVertices.contains(i))
            {
                for (Vertex vertex : verticesSet)
                {
                    int toUpdateVertexDistance = graphMatrix[pickedVertex][i] + previousVertexDistance;
                    int actualVertexDistance = vertex.getDistance();
                    boolean isUpdatedDistanceGreaterThanActualDistance = toUpdateVertexDistance > actualVertexDistance;
                    if (vertex.getNumber() == i && !isUpdatedDistanceGreaterThanActualDistance)
                        vertex.setDistance(graphMatrix[pickedVertex][i] + previousVertexDistance);
                }
            }
        }
    }

    private int findShortestPathVertex(List<Integer> sptSet, List<Vertex> vertSet)
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
}
