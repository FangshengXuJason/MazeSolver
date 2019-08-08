package mazes.generators.carvers;

import datastructures.graphs.Graph;
import datastructures.sets.ISet;
import mazes.entities.Maze;
import mazes.entities.Room;
import mazes.entities.Wall;
import misc.exceptions.NotYetImplementedException;

import java.util.Random;

/**
 * Carves out a maze based on Kruskal's algorithm.
 *
 * See the spec for more details.
 */
public class KruskalMazeCarver implements MazeCarver {
    /**
     * A helper method for constructing a new `Graph`.
     */
    protected Graph<Room, Wall> makeGraph() {
        /*
        Do not change this method; it only exists so that we can override it during grading to test
        your code using our correct version of `Graph`.

        Make sure to use this instead of calling the `Graph` constructor yourself; otherwise, you
        may end up losing extra points if your `Graph` does not behave correctly.
         */
        return new Graph<>();
    }

    @Override
    public ISet<Wall> returnWallsToRemove(Maze maze) {
        Random rand = new Random();
        Graph<Room, Wall> graph = makeGraph();

        // TODO: your code here
        throw new NotYetImplementedException();
    }
}
