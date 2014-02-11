/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>ZBug</code> traces out a "Z" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int moves;

    /**
     * Constructs a box bug that traces a "Z" of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	setDirection(90);
	moves=0;
    }

    /**
     * Moves to the next location of the "Z".
     */
    public void act()
    {
	if (moves>=3){}
        else if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else if (canMove()&& (getDirection()==90))
        {
            setDirection(225);
            steps = 0;
	    moves+=1;
        }
        else if (canMove()&& (getDirection()==225))
        {
            setDirection(90);
            steps = 0;
	    moves+=1;
        }
	else{}
    }
}
