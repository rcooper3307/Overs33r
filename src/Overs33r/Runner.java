package Overs33r;

import Beings.Ghoul;
import Beings.Villager;
import Board.Board;
import Overworld.Dungeon;
import Overworld.TheMedium;
import Overworld.SpawnRoom;
import Overworld.Village;
import Overworld.VillageEmpty;
import Beings.Player;

import java.util.Scanner;

public class Runner {

    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        TheMedium[][] building = new TheMedium[5][5];
        String[][] buildingPrint = new String[5][5];
        Board board = new Board(buildingPrint);

        //Fill the building with villages
        for (int x = 0; x<building.length; x++)
        {
            for (int y = 0; y < building[x].length; y++)
            {
                building[x][y] = new VillageEmpty(x,y);
            }
        }


        //Creates the spawn room, the Boss Dungeon, and the village.
        building[0][0] = new SpawnRoom(0, 0);
        building[2][2] = new Dungeon(2, 2);
        building[4][3] = new Village(4,3);

        //Setup player 1, the ghoul, the villager, and the input scanner
        Player player1 = new Player("ROMA", "C.", 0,0);
        Ghoul ghoul = new Ghoul("Napster","Blook",2,2);
        Villager villager = new Villager("John","Hopkins",4,3);
        building[0][0].enterRoom(player1);
        building[2][2].enemyRoom(ghoul);
        building[4][3].villagerRoom(villager);


        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            board.fill("[ ]");
            board.edit(player1,0,0);
            board.edit(ghoul,2,2);
            board.edit(villager,4,3);
            System.out.print(board);
            System.out.println("Where will you spread your influence over this world next? (Move your ICON using W,A,S,D)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Your LOCATION is now: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("----------------------------------------------");
                System.out.println("Be serious. Follow the INSTRUCTIONS you were given.");
                System.out.println("----------------------------------------------");
            }


        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of rooms
     * @return
     */

    public static boolean validMove(String move, Player p, TheMedium[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "w":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "d":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "a":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }

}
