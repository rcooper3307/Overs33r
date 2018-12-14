package Overworld;

import Beings.Persona;

public class Village extends TheMedium
{
    static boolean isActive;
    public Village (int x, int y) {
        super(x, y);
        isActive = true;


    }

    /**
     * @param x the Person entering
     */
    //creates the dialogue for entering the village
    public void enterRoom(Persona x)
    {
            System.out.println("----------------------------------------------");
            System.out.println("\t A lone VILLAGER occupies the VILLAGE. They are IN YOUR WAY.");
            System.out.println("\t Without questioning your duties at all, you APPROACH the VILLAGER, asking for HELP.");
            System.out.println();
            System.out.println("\t The VILLAGER tells you the GHOUL can be taken out instantly upon hearing the word BOO.");
            System.out.println("\t The VILLAGER then fades from existence. They are out of your way.");
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
        isActive = false;
        occupant = null;
    }


}
