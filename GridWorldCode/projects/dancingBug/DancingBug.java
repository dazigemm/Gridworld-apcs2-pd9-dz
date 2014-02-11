import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int[] turns;
    private int index;

    public DancingBug (int[] inp) {
	turns = inp;
	index = 0;
    }
   
    public void act() {
	if (index > turns.length) 
	    index = 0;
	if (canMove())
	    move();
	else { 
	    for (int t = 0; t < turns[index]; t++) 
	    turn();
        }
    }
}
