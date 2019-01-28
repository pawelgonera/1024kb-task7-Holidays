package pl._1024kb.task07.algo;

import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.graph.Vertex;

import java.util.*;

public class ShortestPathAlgorithmImpl implements ShortestPathAlgorithm
{
    private static final int NO_VERTEX_CONNECTION = -1;

    @SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "SortedCollectionWithNonComparableKeys"})
    @Override
    public int getShortestPath(Graph graph, int source, int destination)
    {
        int[][] graphMatrix = graph.getNeighborhoodMatrix();
        List<Vertex> verticesSet = new LinkedList<Vertex>();

        for(int i = 0; i <= graphMatrix.length; i++)
        {
            verticesSet.add(new Vertex(Integer.MAX_VALUE, i));
        }

        List<Integer> shortestPathVertices = new LinkedList<Integer>();


        int pickedVertex = source;
        int previousVertexDistance = 0;
        int shortestPath = 0;

        int j = 0;
        while(shortestPathVertices.size() <= verticesSet.size())
        {
            shortestPathVertices.add(pickedVertex);
            for (int i = 0; i < graphMatrix.length; i++)
            {
                if(shortestPathVertices.contains(i))
                    continue;

                if (graphMatrix[pickedVertex][i] != NO_VERTEX_CONNECTION)//&& !shortestPathVertices.contains(i)
                {
                    for (Vertex vertex : verticesSet)
                    {
                        if (vertex.getNumber() == i && vertex.getDistance() == Integer.MAX_VALUE)
                        {
                            vertex.setDistance(graphMatrix[pickedVertex][i] + previousVertexDistance);
                            System.out.println("vertex number: " + vertex.getNumber() + " - vertex distance: " + vertex.getDistance());
                        }
                    }
                }
            }

            pickedVertex = findShortestPathVertex(shortestPathVertices, verticesSet);

            for(Vertex vertex : verticesSet)
            {
                if (vertex.getNumber() == pickedVertex)
                    previousVertexDistance = vertex.getDistance();


                if (vertex.getNumber() == destination)
                    shortestPath = vertex.getDistance();
            }



            j++;
        }

        return shortestPath;
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
