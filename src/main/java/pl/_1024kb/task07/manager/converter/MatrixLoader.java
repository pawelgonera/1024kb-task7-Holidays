package pl._1024kb.task07.manager.converter;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class MatrixLoader
{
    private final static String DELIMITER = Pattern.compile("\\s+|,\\s*|\\.\\s*").pattern();

    public static List<String[]> loadMatrix(String fileName)
    {
        List<String[]> rowsList = new LinkedList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split(DELIMITER);
                rowsList.add(row);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return rowsList;
    }
}
