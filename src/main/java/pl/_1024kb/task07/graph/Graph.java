package pl._1024kb.task07.graph;

// It's your container for your graph
// Keep graph as like you wanna
public class Graph
{
    private int[][] neighborhoodMatrix;
    private int nextWaypoint;
    private int previousWaypoint;

    public Graph(int[][]neighborhoodMatrix)
    {
        this.neighborhoodMatrix = neighborhoodMatrix;
    }

    public Graph(int nextWaypoint, int previousWaypoint)
    {
        this.nextWaypoint = nextWaypoint;
        this.previousWaypoint = previousWaypoint;
    }

    public int[][] getNeighborhoodMatrix()
    {
        return this.neighborhoodMatrix;
    }

    public void setNeighborhoodMatrix(int[][]neighborhoodMatrix)
    {
        this.neighborhoodMatrix = neighborhoodMatrix;
    }

    public int getNextWaypoint()
    {
        return this.nextWaypoint;
    }

    public void setNextWaypoint(int nextWaypoint)
    {
        this.nextWaypoint = nextWaypoint;
    }

    public int getPreviousWaypoint()
    {
        return this.previousWaypoint;
    }

    public void setPreviousWaypoint(int previousWaypoint)
    {
        this.previousWaypoint = previousWaypoint;
    }
}

