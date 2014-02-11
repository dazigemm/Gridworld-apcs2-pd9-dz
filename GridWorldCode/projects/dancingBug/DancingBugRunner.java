import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class DancingBugRunner {
    public static void main (String[] args) {
	ActorWorld world = new ActorWorld();
	int[] a = new int[5];
	for (int i = 0; i < 5; i++) {
	    a[i] = (int)(5 *  Math.random());
	}

	DancingBug alice = new DancingBug(a);
	world.add(new Location(5,5), alice);
	world.show();
    }
}
