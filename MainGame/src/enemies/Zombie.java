package enemies;

import player.Player;

public class Zombie implements Enemy {


    @Override
    public String getName() {
        return "Zombie";
    }

    @Override
    public void fight(Player player) {
        int health = player.getHealth() - 25;
        player.setHealth(health);

        int experience = player.getExperience() + 50;
        player.setExperience(experience);
    }

}
