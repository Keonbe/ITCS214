// File: DSA_28.java
// Class name: GRAPH (non-public so filename can be different)

class GRAPH {  // Changed from "Graph" to "GRAPH" and made non-public

    //inner class to keep track of edges
    class Edge {
        int src, dest;
    }

    //number of vertices and edges
    int vertices, edges;

    //array to store all edges
    Edge[] edge;

    GRAPH(int vertices, int edges) {  // Changed constructor name to match class
        this.vertices = vertices;
        this.edges = edges;

        //initialize the edge array
        edge = new Edge[edges];

        for(int i = 0; i < edges; i++) {
            //each elem of the edge array is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        //create object of graph class
        int noVertices = 5;
        int noEdges = 10;
        GRAPH g = new GRAPH(noVertices, noEdges);  // Changed to match class name

        //create graph
        g.edge[0].src = 1; //edge 1 -- 2
        g.edge[0].dest = 2;

        g.edge[1].src = 1; //edge 1 -- 3
        g.edge[1].dest = 3;

        g.edge[2].src = 1; //edge 1 -- 4
        g.edge[2].dest = 4;

        g.edge[3].src = 2; //edge 2 -- 4
        g.edge[3].dest = 4;

        g.edge[4].src = 2; //edge 2 -- 5
        g.edge[4].dest = 5;

        g.edge[5].src = 3; //edge 3 -- 4
        g.edge[5].dest = 4;

        g.edge[6].src = 3; //edge 3 -- 5
        g.edge[6].dest = 5;

        g.edge[7].src = 4; //edge 4 -- 5
        g.edge[7].dest = 5;

        //added edges by user
        g.edge[8].src = 4; //edge 4 -- 6
        g.edge[8].dest = 6;

        g.edge[9].src = 5; //edge 5 -- 6
        g.edge[9].dest = 6; //edge[] proportional to noVertices & noEdges variable

        /*
        Show Graph
            1
          /   \
          2 - 3
          | \ |
          4 - 5
           \ /
            6
         */
        System.out.println("Edges:");
        for (int i = 0; i < noEdges; i++) {
            System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
        }
        System.out.println("Representation:" +
                "   \n\t\t\t1\n" +
                "          /   \\\n" +
                "          2 - 3\n" +
                "          | \\ |\n" +
                "          4 - 5\n" +
                "           \\ /\n" +
                "            6");

        System.out.print("Process Completed");
    }
}