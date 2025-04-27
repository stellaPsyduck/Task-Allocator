package HouseChores;

public class Edge {
    private int capacity;
    private int flow;
    private Vertex goingTo;

    /**
     * Edge
     * Constructor Method for edge, all flow is originally 0
     * PARAMS: capacity representing the flow the edge can take,
     *         goingTo representing the vertex it points to
     */
    void Edge(int capacity, Vertex goingTo) {
        this.capacity = capacity;
        this.goingTo = goingTo;
        this.flow = 0;
    }
}