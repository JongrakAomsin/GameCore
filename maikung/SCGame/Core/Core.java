package maikung.SCGame.Core;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Core extends JavaPlugin implements Listener {
	
	
	String line = "" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "====================================================";
	
	@Override
	public void onEnable() {
		PluginManager manager = this.getServer().getPluginManager();
		getServer().getLogger().info("[SCGameCore] Online");
		manager.registerEvents(new NoRain(), this);
		manager.registerEvents(new Hunger(), this);
		manager.registerEvents(new Join(), this);
	}
	
	public void onDisable() {
		getServer().getLogger().info("[SCGameCore] Offline");
	}
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
        if(!(sender instanceof Player)){
            sender.sendMessage("Player Only !");
        }
        Player player=(Player)sender;
        if(command.getName().equalsIgnoreCase("core")) {
            player.sendMessage("We on Now :)"); // for test plugin is enable
            return true;
        }
        if(command.getName().equalsIgnoreCase("q"))
        {        
           player.sendMessage(line);  
           player.sendMessage("");
           player.sendMessage(ChatColor.GOLD + " คำสั่งเกี่ยวกับเควส" + ChatColor.GRAY + ChatColor.ITALIC + " (สามารถรับเควสได้ที่ Quests Master)");
           player.sendMessage(ChatColor.GOLD + " - /quest " + ChatColor.YELLOW + "เพื่อเช็ครายละเอียดเควส");
           player.sendMessage(ChatColor.GOLD + " - /quests quit [ชื่อเควส] " + ChatColor.YELLOW + "เพื่อออกจากเควส");
           player.sendMessage("");
           player.sendMessage(line); 
        }
        
        return true;
        
    }
        
}
       
