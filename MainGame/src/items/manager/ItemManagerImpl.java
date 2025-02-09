package items.manager;

import items.Item;
import player.Player;

public class ItemManagerImpl implements ItemManager {


    @Override
    public void pickUp(Player player, Item item) {
        System.out.println(player.getName() + " picks up " + item.getName() + ".");
        item.pickUp(player);
        player.getInventories().add(item);
        System.out.println("Inventory now: " + player.getInventories());
    }

}
