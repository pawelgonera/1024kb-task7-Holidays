package pl._1024kb.task07.manager.converter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MatrixLoader
{
    private final static String FILE_PATH = "src/main/resources/";

    public static List<String[]> loadMatrix(String fileName)
    {
        List<String[]> rowsList = new LinkedList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH + fileName)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split(", ");
                rowsList.add(row);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return rowsList;
    }
}
