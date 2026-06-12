package me.avm.staff.skills;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;
public class CobwebSkill implements StaffSkill{
 public void use(Player p){ p.setVelocity(p.getLocation().getDirection().multiply(1.5)); }
}
