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
        if(sender != null) {
            if (!(sender instanceof Player)) {
                // блять, ну я бы если честно поменял бы получение мейна, кфг и из него мсг, но как-то впадлу, я это просто так делаю, поэтому хер Вам, а не сурсы за 2к руб в открытом доступе
                sender.sendMessage(Main.getInstance().getConfig().getString("messages.console", "&cКоманду можно использовать только от имени игрока.")// А вдруг кфг спиздят, поэтому это как с первым сексом, не забудьте обо всём позаботиться
                        .replace("&", "§")
                );
                return true;
            }
            Player p = (Player) sender;
            if(p == null || !p.isOnline() || p.isEmpty()) {
                // Ошибку шоле выводить? Хотя консоль обосрётся...
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§e⎧");
                p.sendMessage("§e⎪ §fПлагин: §ekJoiner §8| §fВерсия: §d1.2-MODIFICATED");
                p.sendMessage("§e⎪ §fРазработчик плагина §5Exept §8- §d@yacushev");
                p.sendMessage("§e⎪ §fПоследние обновлние: §a9.05.2020");
                p.sendMessage("§e⎩");
                return true;
            }
            if (sender.hasPermission("kjoiner.reload")) { // Всё равно креалис пастер
                if (args[0].equals("reload")) {
                    Main.getInstance().reloadConfig();
                    p.sendMessage(Main.getInstance().getConfig().getString("messages.reload", "&5&lkJoiner &8▪ &aПлагин перезагружен.")
                            .replace("&", "§") // всё равно будем бомжевать с реплейсами...
                    );
                    p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
                    return true;
                }

                p.sendMessage(Main.getInstance().getConfig().getString("messages.usage", "&5&lkJoiner &8▪ &cВы ввели неверный аргумент.")
                        .replace("&", "§")
                );
                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
            } else {
                p.sendMessage(Main.getInstance().getConfig().getString("messages.perm", "&5&lkJoiner &8▪ &cНедостаточно прав.")
                        .replace("&", "§")
                );
                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
            }
            return true;
        }
        // Баккит творит удивительные вещи. Надеюсь что через пару лет Вы узнаете как можно крашнуть сервер null отправителем команды если Вы не додумаетесь до этого.
        return true;
    }

}
