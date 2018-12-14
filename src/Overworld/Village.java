package Overworld;

import Beings.Persona;

public class Village extends TheMedium
{
    public Village (int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    public void enterRoom(Persona x)
    {
        System.out.println("There is an egg in this room. You pick it up, and with it, you move along.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Persona x)
    {
        occupant = null;
    }


}
