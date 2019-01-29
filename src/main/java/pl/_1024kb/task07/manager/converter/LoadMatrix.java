package pl._1024kb.task07.manager.converter;

import com.sun.deploy.util.ArrayUtil;
import pl._1024kb.task07.exception.EmptyArrayException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class LoadMatrix
{
    private final static String FILENAME = "/resources/matrix.txt";

    public static int[][] loadMatrix() throws EmptyArrayException
    {
        List<String[]> rowsList = new LinkedList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILENAME)))
        {
            String line = null;
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                rowsList.add(row);
            }

           return parseToInteger(rowsList);

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        throw new EmptyArrayException("Array is empty!");
    }

    private static int[][] parseToInteger(List<String[]> rows)
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
