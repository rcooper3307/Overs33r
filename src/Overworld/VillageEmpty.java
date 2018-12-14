package Overworld;

import Beings.Persona;

public class VillageEmpty extends TheMedium {
    public VillageEmpty (int x, int y) {
        super(x, y);

    }

    /**
     * @param x the Person entering
     */
    //creates the dialogue for entering the village
    public void enterRoom(Persona x)
    {
        System.out.println("----------------------------------------------");
        System.out.println("\t You do not see anyone in this village. Likely the work of a GHOUL.");
        System.out.println("\t It is best to look elsewhere, perhaps to a more LIVELY looking village, to obtain information on how to defeat this SPECTRE.");
        System.out.println("----------------------------------------------");
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
