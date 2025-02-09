package enemies;

import player.Player;

public interface Enemy {

    String getName();

    void fight(Player player);
}
