package com.github.baguzid;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnLocalizationSpawnGoExector implements CommandExecutor {
	SpawnLocalization plugin;
	public SpawnLocalizationSpawnGoExector(SpawnLocalization plugin) {
		this.plugin =plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player player = null;
		if (sender instanceof Player) {
			player=(Player)sender;
		}
		if (label.equals("spawngo")) {
			player.teleport(player.getWorld().getSpawnLocation());
			this.plugin.getServer().getLogger().info("["+this.plugin.getName()+"] - "+ player.getName()+" ha usado el comando /spawngo" );
			return true;
		}
		return false;
	}

}
