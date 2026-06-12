package me.avm.staff;

import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.List;

public class CreateCommand implements CommandExecutor {
@Override
public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
if(!(sender instanceof Player player)) return true;
if(args.length==1 && args[0].equalsIgnoreCase("staff")){
ItemStack staff=new ItemStack(Material.BLAZE_ROD);
ItemMeta meta=staff.getItemMeta();
meta.setDisplayName("§6Universal Staff");
meta.setLore(List.of("§7Shift+Right Click block to absorb","§cMode: None"));
staff.setItemMeta(meta);
player.getInventory().addItem(staff);
player.sendMessage("§aUniversal Staff obtained!");
}
return true;
}
}
