package net.thearc.hub.main;

import net.thearc.hub.nicks.NickRestricts;
import net.thearc.hub.nicks.Nicks;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static FileConfiguration config;
	
	@Override
	public void onEnable() {
		getCommand("nickrestrict").setExecutor(new NickRestricts(this));
		getCommand("nick").setExecutor(new Nicks(this));
		config = getConfig();
	}
	
}
