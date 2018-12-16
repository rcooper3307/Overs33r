package Overworld;

import Beings.Ghoul;
import Beings.Persona;
import Beings.Player;
import Beings.Villager;

public abstract class TheMedium implements EnterAndExit {
    Persona occupant;
    int xLoc,yLoc;

    public TheMedium(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }
    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Player x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void enemyRoom(Ghoul x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void villagerRoom(Villager x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Player x)
    {
        occupant = null;
    }

}
