import combat.CombatManagerImpl;
import game.Game;
import items.manager.ItemManagerImpl;
import level.LevelManager;
import level.LevelManagerImpl;
import player.Player;

import java.util.ArrayList;



public class MainGame {
    public static void main(String[] args) {

        Player player = new Player("Adventurer", 100, 0, new ArrayList<>());

        LevelManager levelManager = new LevelManagerImpl();

        CombatManagerImpl combatManager = new CombatManagerImpl();

        ItemManagerImpl itemManager = new ItemManagerImpl();

        Game game = new Game(player, levelManager, combatManager, itemManager);

        System.out.println("Start the game!!!");
        game.start();

    }
}