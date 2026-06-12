package me.avm.staff.skills;
import org.bukkit.entity.Player;
public class LightningRodSkill implements StaffSkill{
 public void use(Player p){ if(p.getTargetBlockExact(50)!=null) p.getWorld().strikeLightning(p.getTargetBlockExact(50).getLocation()); }
}
