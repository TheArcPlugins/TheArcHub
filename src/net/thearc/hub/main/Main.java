package net.thearc.hub.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	String rights;
	double version;
	
	Main plugin;
	public Main(Main plugin) {
		this.plugin = plugin;
	}
	
	public void onEnable() {
		version = 0.1;
		rights = "Created by ItzQuiver, owned by TheArc.";
	}

}
