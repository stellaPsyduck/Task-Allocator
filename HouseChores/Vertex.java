package HouseChores;
import java.util.*;

public class Vertex {
    private int capacity;
    private ArrayList<Edge> edgesTo;
    private String name;
    private boolean isPerson;

    /**
     * Vertex
     * Constructor method with capacity - edges must be manually aded
     * PARAMS: name representing the name of the task or person,
     *         isPerson representing if the vertex represents a person (Otherwise is a task)
     */
    void Vertex(String name, boolean isPerson) {
        this.name = name;
        this.isPerson = isPerson;
    }

    void addEdge() {
        
    }
}