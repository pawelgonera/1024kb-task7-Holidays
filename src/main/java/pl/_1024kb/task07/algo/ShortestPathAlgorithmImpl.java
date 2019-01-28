package pl._1024kb.task07.algo;

import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.graph.Vertex;

import java.util.*;

public class ShortestPathAlgorithmImpl implements ShortestPathAlgorithm
{
    private static final int NO_VERTEX_CONNECTION = -1;
    private int[][] graphMatrix;
    private List<Vertex> verticesSet = new LinkedList<Vertex>();
    private List<Integer> shortestPathVertices = new LinkedList<Integer>();

    @Override
    public int getShortestPath(Graph graph, int source, int destination)
    {
        graphMatrix = graph.getNeighborhoodMatrix();

        setVerticesAsInfiniteDistances(verticesSet);

        int previousVertexDistance = 0;

        while(shortestPathVertices.size() <= verticesSet.size())
        {
            shortestPathVertices.add(source);

            updateVertices(source, previousVertexDistance);

            source = findShortestPathVertex(shortestPathVertices, verticesSet);

            previousVertexDistance = getPreviousVertexDistance(source);
        }

        return getShortestDistance(destination);
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
                    int updateVertexDistance = graphMatrix[pickedVertex][i] + previousVertexDistance;
                    int actualVertexDistance = vertex.getDistance();
                    boolean isUpdateDistanceGreaterThanActualDistance = updateVertexDistance > actualVertexDistance;
                    if (vertex.getNumber() == i && !isUpdateDistanceGreaterThanActualDistance)
                    {
                        vertex.setDistance(graphMatrix[pickedVertex][i] + previousVertexDistance);
                        System.out.println("vertex number: " + vertex.getNumber() + " - vertex distance: " + vertex.getDistance());
                    }
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

    private int getPreviousVertexDistance(int pickedVertex)
    {
        for(Vertex vertex : verticesSet)
            if (vertex.getNumber() == pickedVertex)
                return vertex.getDistance();

        return 0;
    }

    private int getShortestDistance(int destination)
    {
        for(Vertex vertex : verticesSet)
            if (vertex.getNumber() == destination)
                return vertex.getDistance();

        return 0;
    }
}
