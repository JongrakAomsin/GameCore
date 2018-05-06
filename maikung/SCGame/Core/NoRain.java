package maikung.SCGame.Core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class NoRain implements Listener {
	
	@EventHandler
	public void onTheRain(WeatherChangeEvent event) {
		event.setCancelled(true);
			
	}
	
}
