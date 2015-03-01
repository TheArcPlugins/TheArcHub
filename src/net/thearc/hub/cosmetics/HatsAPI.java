package net.thearc.hub.cosmetics;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HatsAPI {
	
	public static ItemStack getHat(Player player) {
        return player.getInventory().getHelmet();
    }

    public static Material getHatType(Player player) {
        return player.getInventory().getHelmet().getType();
    }

    public static void setHat(Player player, Material hatType) {
        player.getInventory().setHelmet(new ItemStack(hatType));
    }

    public static void setHat(Player player, ItemStack hat) {
        player.getInventory().setHelmet(hat);
    }

    public static void removeHat(Player player) {
        player.getInventory().setHelmet(null);
    }

}
