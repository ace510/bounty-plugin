package com.gmail.ianhclark510;
import org.bukkit.plugin.java.JavaPlugin;
// import com.avaje.ebean.validation.Length;
// import com.avaje.ebean.validation.NotEmpty;
// import co;

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
