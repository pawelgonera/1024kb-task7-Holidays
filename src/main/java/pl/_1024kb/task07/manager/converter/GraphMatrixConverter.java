package pl._1024kb.task07.manager.converter;

import pl._1024kb.task07.graph.Graph;

import java.util.List;

public class GraphMatrixConverter
{
    private static GraphMatrixConverter instance;

    private GraphMatrixConverter()
    {
        if(instance != null)
            throw new IllegalStateException("Cannot create new instance, use getInstance method instead");
    }

    public static GraphMatrixConverter getInstance()
    {
        if(instance == null)
            instance = new GraphMatrixConverter();

        return instance;
    }

    public Graph convertMatrixToGraph(String fileName)
    {
        List<String[]> rowsList = MatrixLoader.loadMatrix(fileName);
        int[][] matrix = parseToInteger(rowsList);

        return new Graph(matrix);
    }

    private int[][] parseToInteger(List<String[]> rows)
    {
        int[][] matrix = new int[rows.size()][rows.size()];

        for(int row = 0; row < matrix.length; row++)
        {
            String[] line = rows.get(row);
            for (int col = 0; col < matrix[row].length; col++)
            {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }

        return matrix;
    }
}
