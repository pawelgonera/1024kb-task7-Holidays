import org.junit.Assert;
import org.junit.Test;
import pl._1024kb.task07.algo.ShortestPathAlgorithmImpl;
import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.manager.ShortestPathManager;

public class ShortestPathManagerTest
{
    ShortestPathAlgorithm shortestPathAlgorithm = new ShortestPathAlgorithmImpl();
    ShortestPathManager shortestPathManager = new ShortestPathManager(shortestPathAlgorithm);

    @Test
    public void testFindTheShortestPath()
    {
        int [][] graphMatrix = new int[][]{
                {-1, 4, -1, -1, -1, -1, -1, 8, -1},
                {4, -1, 8, -1, -1, -1, -1, 11, -1},
                {-1, 8, -1, 7, -1, 4, -1, -1, 2},
                {-1, -1, 7, -1, 9, 14, -1, -1, -1},
                {-1, -1, -1, 9, -1, 10, -1, -1, -1},
                {-1, -1, 4, 14, 10, -1, 2, -1, -1},
                {-1, -1, -1, -1, -1, 2, -1, 1, 6},
                {8, 11, -1, -1, -1, -1, 1, -1, 7},
                {-1, -1, 2, -1, -1, -1, 6, 7, -1}
        };

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 3);

        Assert.assertEquals(shortestPathTest, 24);
    }
}
