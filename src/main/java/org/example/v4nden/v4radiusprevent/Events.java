package org.example.v4nden.v4radiusprevent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Events implements Listener {
    @EventHandler
    public static void onBreak(BlockBreakEvent e) {
        if (V4RadiusPrevent.center == null) return;
        if (V4RadiusPrevent.exclusions.contains(e.getPlayer().getName())) return;
        if (e.getBlock().getLocation().distance(V4RadiusPrevent.center) <= V4RadiusPrevent.radius) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public static void onPlace(BlockPlaceEvent e) {
        if (V4RadiusPrevent.center == null) return;
        if (V4RadiusPrevent.exclusions.contains(e.getPlayer().getName())) return;
        if (e.getBlock().getLocation().distance(V4RadiusPrevent.center) <= V4RadiusPrevent.radius) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public static void onDamage(EntityDamageByEntityEvent e) {
        if (V4RadiusPrevent.center == null) return;
        if (V4RadiusPrevent.exclusions.contains(e.getDamager().getName())) return;
        if (e.getEntity().getLocation().distance(V4RadiusPrevent.center) <= V4RadiusPrevent.radius) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public static void onHangingPlace(HangingPlaceEvent e) {
        if (V4RadiusPrevent.center == null) return;
        if (V4RadiusPrevent.exclusions.contains(e.getPlayer().getName())) return;
        if (e.getEntity().getLocation().distance(V4RadiusPrevent.center) <= V4RadiusPrevent.radius) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public static void onHangingBreak(HangingPlaceEvent e) {
        if (V4RadiusPrevent.center == null) return;
        if (V4RadiusPrevent.exclusions.contains(e.getPlayer().getName())) return;
        if (e.getEntity().getLocation().distance(V4RadiusPrevent.center) <= V4RadiusPrevent.radius) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public static void onExplosion(EntityExplodeEvent e) {
        if (V4RadiusPrevent.center == null) return;
        if (e.getLocation().distance(V4RadiusPrevent.center) <= V4RadiusPrevent.radius) {
            e.setCancelled(true);
        }
    }
}
