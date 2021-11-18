package ru.exept.joiner;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.command.*;

/**
 * Copyright © 2021 TheKrealisYT or Exept.
 * Author source code: @naulbimix. All rights reserved. Please telegram @naulbimix for usage rights and other information.
 */

public class kJoiner implements CommandExecutor {

    /**
     * @param sender
     * @param cmd
     * @param label
     * @param args
     * @return true - Action completed
     */
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.getInstance().getConfig().getString("messages.console").replace("&", "§"));
            return true;
        }
        Player p = (Player)sender;
        if(args.length == 0) {
            p.sendMessage("§e⎧");
            p.sendMessage("§e⎪ §fПлагин: §ekJoiner §8| §fВерсия: §d1.1-MODIFICATED");
            p.sendMessage("§e⎪ §fРазработчик плагина §5Exept §8- §d@yacushev");
            p.sendMessage("§e⎪ §fПоследние обновлние: §a9.05.2020");
            p.sendMessage("§e⎩");
            return true;
        }
        if(sender.hasPermission("uAPI.reload")) { // This moment falling paste :)
            if(args[0].equalsIgnoreCase("reload")) {
                Main.getInstance().reloadConfig();
                p.sendMessage(Main.getInstance().getConfig().getString("messages.reload").replace("&", "§"));
                p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
                return true;
            }

            p.sendMessage(Main.getInstance().getConfig().getString("messages.usage").replace("&", "§"));
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
        } else {
            p.sendMessage(Main.getInstance().getConfig().getString("messages.perm").replace("&", "§"));
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
        }
        return true;
    }

}
