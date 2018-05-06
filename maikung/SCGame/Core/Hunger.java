package maikung.SCGame.Core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Hunger implements Listener {
	
	@EventHandler
    public void Foodlevel(FoodLevelChangeEvent event) {	
        event.setCancelled(true);
	}
}
	


