package Overworld;

import Beings.Ghoul;
import Beings.Player;
import Beings.Villager;

public interface EnterAndExit {
    void enterRoom(Player x);
    void leaveRoom(Player x);
    void enemyRoom(Ghoul x);
    void villagerRoom(Villager x);

}
