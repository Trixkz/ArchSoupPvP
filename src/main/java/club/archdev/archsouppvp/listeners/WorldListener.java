package club.archdev.archsouppvp.listeners;

import club.archdev.archsouppvp.ArchSoupPvP;
import org.bukkit.GameMode;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class WorldListener implements Listener {

    private ArchSoupPvP main = ArchSoupPvP.getInstance();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onExplosion(ExplosionPrimeEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onFoodConsumption(FoodLevelChangeEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onPortalEnter(PlayerPortalEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() != EntityType.ARMOR_STAND) {
            event.setCancelled(true);
        }
    }
}
