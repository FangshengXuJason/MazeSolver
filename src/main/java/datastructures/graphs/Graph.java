package datastructures.graphs;

import datastructures.lists.IList;
import datastructures.sets.ISet;
import misc.exceptions.NotYetImplementedException;

/**
 * Represents an undirected, weighted graph, possibly containing self-loops, parallel edges,
 * and unconnected components.
 *
 * @param <V> the type of the vertices
 * @param <E> the type of the additional data contained in edges
 *
 * Note: This class is not meant to be a full-featured way of representing a graph.
 * We stick with supporting just a few, core set of operations needed for the
 * remainder of the project.
 */
public class Graph<V, E> {
    /*
    Feel free to add as many fields, private helper methods, and private inner classes as you want.

    And of course, as always, you may also use any of the data structures and algorithms we've
    implemented so far.

    Note: If you plan on adding a new class, please be sure to make it a private static inner class
    contained within this file. Our testing infrastructure works by copying specific files from your
    project to ours, and if you add new files, they won't be copied and your code will not compile.
    */

    /**
     * Constructs a new empty graph.
     */
    public Graph() {
        // TODO: Your code here
        throw new NotYetImplementedException();
    }

    /**
     * Adds a vertex to this graph. If the vertex is already in the graph, does nothing.
     */
    public void addVertex(V vertex) {
        // TODO: Your code here
        throw new NotYetImplementedException();
    }

    /**
     * Adds a new edge to the graph, with null data.
     *
     * Every time this method is (successfully) called, a unique edge is added to the graph; even if
     * another edge between the same vertices and with the same weight and data already exists, a
     * new edge will be created and added (where `newEdge.equals(oldEdge)` is false).
     *
     * @throws IllegalArgumentException  if `weight` is null
     * @throws IllegalArgumentException  if either vertex is not contained in the graph
     */
    public void addEdge(V vertex1, V vertex2, double weight) {
        this.addEdge(vertex1, vertex2, weight, null);
    }

    /**
     * Adds a new edge to the graph with the given data.
     *
     * Every time this method is (successfully) called, a unique edge is added to the graph; even if
     * another edge between the same vertices and with the same weight and data already exists, a
     * new edge will be created and added (where `newEdge.equals(oldEdge)` is false).
     *
     * @throws IllegalArgumentException  if `weight` is null
     * @throws IllegalArgumentException  if either vertex is not contained in the graph
     */
    public void addEdge(V vertex1, V vertex2, double weight, E data) {
        // TODO: Your code here
        throw new NotYetImplementedException();
    }

    /**
     * Returns the number of vertices contained within this graph.
     */
    public int numVertices() {
        // TODO: your code here
        throw new NotYetImplementedException();
    }

    /**
     * Returns the number of edges contained within this graph.
     */
    public int numEdges() {
        // TODO: your code here
        throw new NotYetImplementedException();
    }

    /**
     * Returns the set of all edges that make up the minimum spanning tree of this graph.
     *
     * If there exists multiple valid MSTs, returns any one of them.
     *
     * Precondition: the graph does not contain any unconnected components.
     */
    public ISet<Edge<V, E>> findMinimumSpanningTree() {
        // TODO: your code here
        throw new NotYetImplementedException();
    }

    /**
     * Returns the edges that make up the shortest path from `start` to `end`.
     *
     * The first edge in the output list will be the edge leading out of the `start` node; the last
     * edge in the output list will be the edge connecting to the `end` node.
     *
     * Returns an empty list if the start and end vertices are the same.
     *
     * @throws NoPathExistsException  if there does not exist a path from `start` to `end`
     * @throws IllegalArgumentException if `start` or `end` is null or not in the graph
     */
    public IList<Edge<V, E>> findShortestPathBetween(V start, V end) {
        // TODO: your code here
        throw new NotYetImplementedException();
    }
}
