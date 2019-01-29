import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl._1024kb.task07.algo.DijkstraAlgorithm;
import pl._1024kb.task07.api.ShortestPathAlgorithm;
import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.manager.ShortestPathManager;

public class ShortestPathManagerTest
{
    ShortestPathAlgorithm shortestPathAlgorithm = new DijkstraAlgorithm();
    ShortestPathManager shortestPathManager = new ShortestPathManager(shortestPathAlgorithm);
    private int[][] graphMatrix;

    @Before
    public void setUp()
    {
        graphMatrix = new int[][]{
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
    }

    @Test
    public void testFindTheShortestPath0to1()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 1);

        Assert.assertEquals(shortestPathTest, 4);
    }

    @Test
    public void testFindTheShortestPath0to2()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 2);

        Assert.assertEquals(shortestPathTest, 12);
    }

    @Test
    public void testFindTheShortestPath0to3()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 3);

        Assert.assertEquals(shortestPathTest, 19);
    }

    @Test
    public void testFindTheShortestPath0to4()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 4);

        Assert.assertEquals(shortestPathTest, 21);
    }

    @Test
    public void testFindTheShortestPath0to5()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 5);

        Assert.assertEquals(shortestPathTest, 11);
    }

    @Test
    public void testFindTheShortestPath0to6()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 6);

        Assert.assertEquals(shortestPathTest, 9);
    }

    @Test
    public void testFindTheShortestPath0to7()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 7);

        Assert.assertEquals(shortestPathTest, 8);
    }

    @Test
    public void testFindTheShortestPath0to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 0, 8);

        Assert.assertEquals(shortestPathTest, 14);
    }

    @Test
    public void testFindTheShortestPath1to2()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 2);

        Assert.assertEquals(shortestPathTest, 8);
    }

    @Test
    public void testFindTheShortestPath1to3()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 3);

        Assert.assertEquals(shortestPathTest, 15);
    }

    @Test
    public void testFindTheShortestPath1to4()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 4);

        Assert.assertEquals(shortestPathTest, 22);
    }

    @Test
    public void testFindTheShortestPath1to5()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 5);

        Assert.assertEquals(shortestPathTest, 12);
    }

    @Test
    public void testFindTheShortestPath1to6()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 6);

        Assert.assertEquals(shortestPathTest, 12);
    }

    @Test
    public void testFindTheShortestPath1to7()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 7);

        Assert.assertEquals(shortestPathTest, 11);
    }

    @Test
    public void testFindTheShortestPath1to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 1, 8);

        Assert.assertEquals(shortestPathTest, 10);
    }

    @Test
    public void testFindTheShortestPath2to3()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 2, 3);

        Assert.assertEquals(shortestPathTest, 7);
    }

    @Test
    public void testFindTheShortestPath2to4()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 2, 4);

        Assert.assertEquals(shortestPathTest, 14);
    }

    @Test
    public void testFindTheShortestPath2to5()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 2, 5);

        Assert.assertEquals(shortestPathTest, 4);
    }

    @Test
    public void testFindTheShortestPath2to6()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 2, 6);

        Assert.assertEquals(shortestPathTest, 6);
    }

    @Test
    public void testFindTheShortestPath2to7()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 2, 7);

        Assert.assertEquals(shortestPathTest, 7);
    }

    @Test
    public void testFindTheShortestPath2to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 2, 8);

        Assert.assertEquals(shortestPathTest, 2);
    }

    @Test
    public void testFindTheShortestPath3to4()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 3, 4);

        Assert.assertEquals(shortestPathTest, 9);
    }

    @Test
    public void testFindTheShortestPath3to5()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 3, 5);

        Assert.assertEquals(shortestPathTest, 11);
    }

    @Test
    public void testFindTheShortestPath3to6()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 3, 6);

        Assert.assertEquals(shortestPathTest, 13);
    }

    @Test
    public void testFindTheShortestPath3to7()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 3, 7);

        Assert.assertEquals(shortestPathTest, 14);
    }

    @Test
    public void testFindTheShortestPath3to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 3, 8);

        Assert.assertEquals(shortestPathTest, 9);
    }

    @Test
    public void testFindTheShortestPath4to5()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 4, 5);

        Assert.assertEquals(shortestPathTest, 10);
    }

    @Test
    public void testFindTheShortestPath4to6()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 4, 6);

        Assert.assertEquals(shortestPathTest, 12);
    }

    @Test
    public void testFindTheShortestPath4to7()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 4, 7);

        Assert.assertEquals(shortestPathTest, 13);
    }

    @Test
    public void testFindTheShortestPath4to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 4, 8);

        Assert.assertEquals(shortestPathTest, 16);
    }

    @Test
    public void testFindTheShortestPath5to6()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 5, 6);

        Assert.assertEquals(shortestPathTest, 2);
    }

    @Test
    public void testFindTheShortestPath5to7()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 5, 7);

        Assert.assertEquals(shortestPathTest, 3);
    }

    @Test
    public void testFindTheShortestPath5to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 5, 8);

        Assert.assertEquals(shortestPathTest, 6);
    }

    @Test
    public void testFindTheShortestPath6to7()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 6, 7);

        Assert.assertEquals(shortestPathTest, 1);
    }

    @Test
    public void testFindTheShortestPath6to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 6, 8);

        Assert.assertEquals(shortestPathTest, 6);
    }

    @Test
    public void testFindTheShortestPath7to8()
    {

        Graph graph = new Graph(graphMatrix);

        final int shortestPathTest =  shortestPathManager.getShortestPath(graph, 7, 8);

        Assert.assertEquals(shortestPathTest, 7);
    }
}
