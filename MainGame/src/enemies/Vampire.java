package enemies;

import player.Player;

public class Vampire implements Enemy {


    @Override
    public String getName() {
        return "Vampire";
    }

    @Override
    public void fight(Player player) {
        int health = player.getHealth() - 15;
        player.setHealth(health);

        int experience = player.getExperience() + 30;
        player.setExperience(experience);
    }
}
