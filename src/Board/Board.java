package Board;

import Beings.Persona;

public class Board
{
        private String[][] map;
        public Board(String[][] map)
        {
            this.map = map;
        }
        public void edit(Persona person, int row, int column)
        {
            row = person.getxLoc();
            column = person.getyLoc();
            map[row][column] = "[X]";
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
