package maikung.SCGame.Core;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Join implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		event.setJoinMessage("");
		p.sendMessage("");
		p.sendMessage("");
	}
	
	public void onQuit(PlayerQuitEvent event) {
		event.setQuitMessage("");
		
	}
	

}
