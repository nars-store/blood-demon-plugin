package me.avm.staff;

import org.bukkit.plugin.java.JavaPlugin;

public class AVMStaff extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("create").setExecutor(new CreateCommand());
        getLogger().info("AVMStaff enabled");
    }
}
