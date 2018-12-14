package Overworld;

import Beings.Ghoul;
import Beings.Persona;
import Beings.Villager;

public class TheMedium {
    Persona occupant;
    int xLoc,yLoc;

    public TheMedium(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }
    public int getxLoc()
    {
        return xLoc;
    }
    public int getyLoc()
    {
        return yLoc;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Persona x)
    {
        System.out.println("----------------------------------------------");
        System.out.println("\t You have just entered THE MEDIUM.");
        System.out.println("\t You have been given the task of clearing THE MEDIUM of all COWARDLY GHOULS by the creator of THE MEDIUM, ROMA. ");
        System.out.println("\t GHOULS are very clearly marked on your map by their SPOOKY SPECTRE FACES. You are represented by the CROSS.");
        System.out.println("\t VILLAGES are the white hearts on the map. The VILLAGERS will do their best to aid you.");
        System.out.println("\t Only when you feel prepared enough for the challenge should you approach a SPECTRE.");
        System.out.println("\t Once you have cleared out all the GHOULS, you will be clear to LEAVE. Be quick.");
        System.out.println("----------------------------------------------");
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
    public void leaveRoom(Persona x)
    {
        occupant = null;
    }

}
