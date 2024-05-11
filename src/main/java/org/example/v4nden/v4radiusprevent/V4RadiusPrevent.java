package org.example.v4nden.v4radiusprevent;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class V4RadiusPrevent extends JavaPlugin {

    public static Location center;
    public static float radius = 50;
    public static ArrayList<String> exclusions = new ArrayList<>();

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);
        this.getCommand("v4prcenter").setExecutor(new Commands.SetCenter());
        this.getCommand("v4prexclusion").setExecutor(new Commands.AddExclusion());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
