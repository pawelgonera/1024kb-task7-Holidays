import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

import pl._1024kb.task07.algo.DijkstraAlgorithm;
import pl._1024kb.task07.graph.Graph;
import pl._1024kb.task07.manager.HolidayManager;
import pl._1024kb.task07.manager.ShortestPathManager;
import pl._1024kb.task07.manager.converter.GraphMatrixConverter;

import java.util.Arrays;

public class HolidayManagerTest
{
    private ShortestPathManager shortestPathManager = new ShortestPathManager(new DijkstraAlgorithm());
    private HolidayManager manager = new HolidayManager(shortestPathManager);
    private GraphMatrixConverter converter = GraphMatrixConverter.getInstance();
    private static final String FILE_NAME = "src/main/resources/matrix.txt";
    private Graph graph;

    @Before
    public void setUp()
    {
        graph = converter.convertMatrixToGraph(FILE_NAME);
    }

    @Test
    public void testLoadedMatrix()
    {
        final int[][]matrix = new int[][]{
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

        final int[][] matrixTest = graph.getNeighborhoodMatrix();

        Assertions.assertEquals(Arrays.deepToString(matrix), Arrays.deepToString(matrixTest));
    }

    @Test
    public void testHolidayManager()
    {
        final int shortestPAthTest = manager.getShortestPath(FILE_NAME, 2, 8);

        Assertions.assertEquals(shortestPAthTest, 2);
    }
}
