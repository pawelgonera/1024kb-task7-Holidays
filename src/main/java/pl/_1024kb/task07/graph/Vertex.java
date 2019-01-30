package pl._1024kb.task07.graph;

public class Vertex
{
    private int distance;
    private int number;

    public Vertex(int distance, int number)
    {
        this.distance = distance;
        this.number = number;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
