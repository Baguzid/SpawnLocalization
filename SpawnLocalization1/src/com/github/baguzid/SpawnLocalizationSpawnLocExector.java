package com.github.baguzid;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnLocalizationSpawnLocExector implements CommandExecutor {
	SpawnLocalization plugin;
	public SpawnLocalizationSpawnLocExector(SpawnLocalization plugin) {
		this.plugin=plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		Player player=null;
		if (sender instanceof Player) {
			player=(Player)sender;
		}
		if (!player.isOp()) {
			return false;
		}
		if (label.equals("spawnloc")) {
			player.getWorld().setSpawnLocation(player.getLocation().getBlockX(),player.getLocation().getBlockY(),player.getLocation().getBlockZ());
			this.plugin.getServer().getLogger().info("["+this.plugin.getName()+"] - "+ player.getName()+" ha usado el comando /spawnloc" );
			this.plugin.getServer().getLogger().info("["+this.plugin.getName()+"] - Nuevas corrdenadas del Spawn: X:"+player.getLocation().getBlockX()+ "  Y:"+player.getLocation().getBlockY()+ "  Z:"+player.getLocation().getBlockZ());
			return true;
		}
		return false;
	}

}
