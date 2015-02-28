package net.thearc.hub.nicks;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ArcNicks extends JavaPlugin {
	
	public static FileConfiguration config;
	
	public void onEnable() {
		getConfig().options().copyDefaults(true);
		saveConfig();
		getCommand("nickrestrict").setExecutor(new NickRestricts());
		getCommand("nick").setExecutor(new Nicks());
		config = getConfig();
	}
	}

