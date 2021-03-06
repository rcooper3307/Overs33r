package Overworld;

import Beings.Player;
import Beings.Villager;

public class Village extends TheMedium implements EnterAndExit
{
    static boolean isActive = true;
    //sets up the village position
    public Village (int x, int y)
    {
        super(x, y);
    }
    //sets the villager in the village
    public void villagerRoom(Villager x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }


    /**
     * @param x the Person entering
     */
    //creates the dialogue for entering the village
    public void enterRoom(Player x)
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

    public void leaveRoom(Player x)
    {
        villageInactive();
        occupant = null;
    }
    //Activates after visiting the village
    public static void villageInactive()
    {
        isActive = false;
    }


}
