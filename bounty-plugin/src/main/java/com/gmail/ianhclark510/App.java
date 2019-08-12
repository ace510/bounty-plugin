package com.gmail.ianhclark510;

import com.gmail.ianhclark510.commands;
import org.bukkit.plugin.java.JavaPlugin;




public class App extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("Hello, SpigotMC:");
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC:");
    }
}
