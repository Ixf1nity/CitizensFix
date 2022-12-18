package me.infinity.citizensfix;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CitizensFix extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    this.getServer().getPluginManager().registerEvents(this, this);
  }

  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    if (this.getServer().getOnlinePlayers().size() == 1) {
      Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "citizens reload");
      Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "citizens reload");
    }
  }
}
