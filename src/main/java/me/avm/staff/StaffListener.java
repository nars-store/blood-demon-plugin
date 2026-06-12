package me.avm.staff;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class StaffListener implements Listener {
 private final StaffManager manager;
 public StaffListener(StaffManager manager){this.manager=manager;}
 @EventHandler
 public void onInteract(PlayerInteractEvent e){
 Player p=e.getPlayer();
 ItemStack item=e.getItem();
 if(item==null||!manager.isStaff(item)) return;
 if(p.isSneaking() && e.getClickedBlock()!=null){
 Block b=e.getClickedBlock();
 Material m=b.getType();
 manager.setMode(item,m.name());
 p.sendMessage("§6Staff absorbed: "+m.name());
 }
 }
}