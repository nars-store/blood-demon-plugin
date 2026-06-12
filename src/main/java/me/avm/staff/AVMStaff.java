package me.avm.staff;

import org.bukkit.plugin.java.JavaPlugin;

public class AVMStaff extends JavaPlugin {
    private StaffManager staffManager;

    @Override
    public void onEnable() {
        this.staffManager = new StaffManager(this);
        getCommand("create").setExecutor(new CreateCommand());
        getServer().getPluginManager().registerEvents(new StaffListener(staffManager), this);
        getLogger().info("AVMStaff enabled");
    }

    public StaffManager getStaffManager() {
        return staffManager;
    }
}