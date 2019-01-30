package pl._1024kb.task07;

import pl._1024kb.task07.algo.DijkstraAlgorithm;
import pl._1024kb.task07.manager.HolidayManager;
import pl._1024kb.task07.manager.ShortestPathManager;

public class Main
{
    public static void main(String[] args)
    {
        ShortestPathManager dijkstraShortestPath = new ShortestPathManager(new DijkstraAlgorithm());
        HolidayManager holidayManager = new HolidayManager(dijkstraShortestPath);

        int shortestPath = holidayManager.getShortestPath("src/main/resources/matrix.txt", 4, 7);

        System.out.println(shortestPath);
    }
}
