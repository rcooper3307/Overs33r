package Board;

import Beings.Persona;
import Beings.Ghoul;
import Beings.Villager;
public class Board
{
        private String[][] map;
        public Board(String[][] map)
        {
            this.map = map;
        }
        //makes a spot on the map for the player
        public void edit(Persona person, int row, int column)
        {
            row = person.getxLoc();
            column = person.getyLoc();
            map[row][column] = "[X]";
        }
        //makes a spot on the map for the ghoul
        public void edit(Ghoul ghoul, int row, int column)
        {
            row = ghoul.getxLoc();
            column = ghoul.getyLoc();
            map[row][column] = "[⍥]";
        }
        //makes a spot on the map for the villager
        public void edit(Villager villager, int row, int column)
        {
            row = villager.getxLoc();
            column = villager.getyLoc();
            map[row][column] = "[♡]";
        }

        public void fill(String str)
        {
            for(int i = 0; i < map.length; i++)
            {
                for(int j = 0; j < map[i].length; j++)
                {
                    map[i][j] = str;
                }
            }
        }

        public String toString()
        {
            String board1 = "";
            for (int i = 0; i < map.length; i++)
            {
                for (int j = 0; j < map[i].length; j++)
                {
                    board1 = board1 + map[i][j];
                }
                board1 += "\n";
            }
            return board1;
        }
}
