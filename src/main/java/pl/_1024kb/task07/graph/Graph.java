package pl._1024kb.task07.graph;

public class Graph
{
    private int[][] neighborhoodMatrix;

    public Graph(int[][]neighborhoodMatrix)
    {
        this.neighborhoodMatrix = neighborhoodMatrix;
    }

    public int[][] getNeighborhoodMatrix()
    {
        return this.neighborhoodMatrix;
    }

    public void setNeighborhoodMatrix(int[][]neighborhoodMatrix)
    {
        this.neighborhoodMatrix = neighborhoodMatrix;
    }
}

