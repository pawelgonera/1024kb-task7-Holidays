# 1024kb-task7-Holidays
Seventh task from [1024kb](https://1024kb.pl) blog.

### Description
For this task I created algorithm which is to find the shortest path between two vertex on the [graph](https://en.wikipedia.org/wiki/Graph_(abstract_data_type)).
In this purpose I chose [Dijkstra](https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm) algorithm. Program loades graph information as matrix from .txt file.

### Example
#### matrix from file
```
-1, 4, -1, -1, -1, -1, -1, 8, -1
4, -1, 8, -1, -1, -1, -1, 11, -1
-1, 8, -1, 7, -1, 4, -1, -1, 2
-1, -1, 7, -1, 9, 14, -1, -1, -1
-1, -1, -1, 9, -1, 10, -1, -1, -1
-1, -1, 4, 14, 10, -1, 2, -1, -1
-1, -1, -1, -1, -1, 2, -1, 1, 6
8, 11, -1, -1, -1, -1, 1, -1, 7
-1, -1, 2, -1, -1, -1, 6, 7, -1

```

Each rows represents starting vertex, and each columns represents ending vertex of the distance two specific vertexes. 
Each value represents distance between two vertexes, **-1** means there is no distance, or there is no road for this vertex.
For example, value **9** in 4th row and 5th column means that, there is 9 value of distance from vertexes 4th to 5th 
and value **-1** in 2th row and 6th column means there is no road between vertexes 2th and 6th. 
