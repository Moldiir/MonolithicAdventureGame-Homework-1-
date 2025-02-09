package enemies;

import player.Player;

public class Skeleton implements Enemy {

    @Override
    public String getName() {
        return "Skeleton";
    }

    @Override
    public void fight(Player player) {
        int health = player.getHealth() - 10;
        player.setHealth(health);

        int experience = player.getExperience() + 20;
        player.setExperience(experience);
    }
}
