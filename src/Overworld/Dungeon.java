package Overworld;

import Beings.Ghoul;
import Beings.Persona;
import Overs33r.Runner;

public class Dungeon extends TheMedium {
    public Dungeon (int x, int y) {
        super(x, y);

    }
    public void enemyRoom(Ghoul x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    /**
     * @param x the Person entering
     */
    public void enterRoom(Persona x)
    {

        System.out.println("----------------------------------------------");
        System.out.println("\t You enter the DUNGEON, the hideout of the terrifying GHOUL.");
        System.out.println("\t Only seconds pass before the SPECTRE comes out of hiding, warping right into your face.");
        System.out.println("----------------------------------------------");
        if(Village.isActive)
        {
            System.out.println("\t You are quickly and easily dispatched by the GHOUL. Perhaps you should have looked into the weaknesses of the SPECTRE.");
            System.out.println("\t You have done your best, but it was not enough, and you have paid for it.");
            System.out.println("\t I am sorry, but because of your FAILURE, I cannot allow you to continue playing. Thank you for your time.");
            System.out.println("----------------------------------------------");
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);

            Runner.gameOff();
        }
        else 
        {
            System.out.println("\t You quickly and easily dispatch the GHOUL with the MAGIC WORD. Perhaps it should have been a bit more cautious.");
            System.out.println("\t After all, it was ROMA that thought you were good enough to take it on, so you must be pretty incredible already.");
            System.out.println("\t Well done. You have clearly THE MEDIUM of all the GHOULS. Thank you for your SERVICE.");
            System.out.println("----------------------------------------------");
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);

            Runner.gameOff();
        }

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
