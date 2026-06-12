package me.avm.staff;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffManager {
    private final NamespacedKey modeKey;

    public StaffManager(JavaPlugin plugin){
        this.modeKey = new NamespacedKey(plugin, "staff_mode");
    }

    public boolean isStaff(ItemStack item){
        return item != null && item.hasItemMeta() && item.getItemMeta().hasDisplayName();
    }

    public void setMode(ItemStack item,String mode){
        ItemMeta meta=item.getItemMeta();
        meta.getPersistentDataContainer().set(modeKey, PersistentDataType.STRING, mode);
        item.setItemMeta(meta);
    }

    public String getMode(ItemStack item){
        if(item==null||!item.hasItemMeta()) return "NONE";
        return item.getItemMeta().getPersistentDataContainer().getOrDefault(modeKey, PersistentDataType.STRING, "NONE");
    }
}