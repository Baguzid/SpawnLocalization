package com.github.baguzid;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class SpawnLocalization extends JavaPlugin {
	
	Logger logger;
	
	@Override
	public void onEnable() {
		logger = this.getServer().getLogger();
		logger.info("["+getName()+"] Esta Activado");
		this.getCommand("spawngo").setExecutor(new SpawnLocalizationSpawnGoExector(this));
		this.getCommand("spawnloc").setExecutor(new SpawnLocalizationSpawnLocExector(this));
		super.onEnable();
	}
	@Override
	public void onDisable() {
		logger.info("["+getName()+"] Esta Desactivado");
		super.onDisable();
	}
}
