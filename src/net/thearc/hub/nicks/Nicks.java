
package net.thearc.hub.nicks;

import net.thearc.hub.main.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Nicks implements CommandExecutor {
	
	Main plugin;
	public Nicks(Main plugin) {
		this.plugin = plugin;
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			if(cmd.getName().equalsIgnoreCase("nick")) {
				if(args.length == 0) {
					sender.sendMessage("§4Invalid arguments! Please use /nick <playername> <nickname>");
				}
				if(args.length == 1) {
					sender.sendMessage("§4Invalid arguments! Please use /nick <playername> <nickname>");
				}
				if(args.length == 2) {
			Player target =  Bukkit.getServer().getPlayer(args[0]);
			String nick = new String(args[1]);
			String nickcolor = ChatColor.translateAlternateColorCodes('&', nick);
			String sendername = sender.getName();
			for(String s : Main.config.getStringList("restrictednicks"))
					{
					if(ChatColor.stripColor(nick).contains(s))
					{
						sender.sendMessage("§6That nick is restricted!");
						return false;
					}
					}
			target.setDisplayName(nickcolor);
			sender.sendMessage("§6Succesfully set " + target.getName() + "'s name to " + nickcolor);
			if(sender.equals(target)) {
			target.sendMessage("§6Nick set to " + nickcolor);
			} else {
			target.sendMessage("§6Nick set to " + nickcolor + " by " + sendername);
			}
			}
			}else{
				sender.sendMessage("§4Invalid arguments! Please use /nick <playername> <nickname>");
			}
			return false;

}
}

