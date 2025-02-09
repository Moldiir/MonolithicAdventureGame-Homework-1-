package combat;

import enemies.Enemy;
import player.Player;

public class CombatManagerImpl implements CombatManager {

    @Override
    public void engage(Player player, Enemy enemy) {
        System.out.println(player.getName() + " engages in combat with " + enemy.getName() + "!");

        enemy.fight(player);

        System.out.println("After combat: Health = " + player.getHealth() + ", Experience = " + player.getExperience());

    }
}
