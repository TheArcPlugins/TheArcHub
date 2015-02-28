package net.thearc.hub.nicks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class NickRestricts implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("restrictnick")) {
			if(args.length == 0) {
			sender.sendMessage("§4Invalid arguments! Please use: /restrictnick <add/remove> <nickname>");
			}
			if(args.length == 1) {
				if(args[0].equals("add")) {
			ArcNicks.config.getStringList("restrictednicks").add(args[1]);
			sender.sendMessage("§6Successfully added nick to restriction list.");
			}else if (args[0].equals("remove")) {
			ArcNicks.config.getStringList("restrictednicks").remove(args[1]);
			sender.sendMessage("§6Successfully removed nick from restriction list.");
			}
		}else{
			sender.sendMessage("§4Invalid arguments! Please use: /restrictnick <add/remove> <nickname>");
		}
		}
		return false;
		
	}



}
