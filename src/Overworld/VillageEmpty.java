package Overworld;


import Beings.Player;

public class VillageEmpty extends TheMedium implements EnterAndExit {
    public VillageEmpty (int x, int y) {
        super(x, y);

    }

    /**
     * @param x the Person entering
     */
    //creates the dialogue for entering the village
    public void enterRoom(Player x)
    {
        if (Village.isActive)
        {
            System.out.println("----------------------------------------------");
            System.out.println("\t You do not see anyone in this village. Likely the work of a GHOUL.");
            System.out.println("\t It is best to look elsewhere, perhaps to a more LIVELY looking village, to obtain information on how to defeat this SPECTRE.");
            System.out.println("----------------------------------------------");
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);

        }
        else
        {
            System.out.println("----------------------------------------------");
            System.out.println("\t The lone VILLAGER's message fills your head.");
            System.out.println("\t Filled with RESOLVE, you believe it is time to head towards the DUNGEON.");
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);

        }

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
