package org.example.v4nden.v4radiusprevent;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Commands {
    public static class SetCenter implements CommandExecutor {
        @Override
        public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
            if (strings.length < 3) {
                commandSender.sendMessage("Please provide correct x, y, z");
                return false;
            }
            V4RadiusPrevent.center = new Location(
                    commandSender instanceof Player ?
                            ((Player) commandSender).getWorld() :
                            Bukkit.getWorld("world"),
                    new Double(strings[0]),
                    new Double(strings[1]),
                    new Double(strings[2]));
            return false;
        }
    }

    public static class AddExclusion implements CommandExecutor {

        @Override
        public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
            if (strings.length < 1) {
                commandSender.sendMessage("Please provide player name");
                return false;
            }
            if (Bukkit.getPlayer(strings[0]) == null) {
                commandSender.sendMessage("Please provide online player name");
                return false;
            }
            V4RadiusPrevent.exclusions.add(strings[0]);
            return false;
        }
    }

}
