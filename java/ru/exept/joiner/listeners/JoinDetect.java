package ru.exept.joiner.listeners;

import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.entity.*;
import ru.exept.joiner.utils.*;
import me.clip.placeholderapi.*;
import org.bukkit.event.player.*;

/**
 * Copyright © 2021 TheKrealisYT or Exept.
 * Author source code: @naulbimix. All rights reserved. Please telegram @naulbimix for usage rights and other information.
 */

public class JoinDetect implements Listener {

    @EventHandler(priority = EventPriority.HIGH) // приоритет для красоты если чё
    public void onJoin(PlayerJoinEvent e) {
        if(e.getPlayer() != null) { // да, да, баккит творит удивительные вещи
            e.setJoinMessage(null); // знаете, всё равно некоторые ставят HIGHEST и даже если я буду пытаться не отправлять всем игрокам мсг, а через сет жоин мессг, то какие-то говно плагине его зафиксят.
            Player p = e.getPlayer();
            Main.configurationSection.getValues(false).keySet().forEach(str -> {
                if(p.hasPermission("kjoiner.join." + str)) { // если у чела много прав, то там пизда будет в чате, но это уже идея креалиса)
                    Bukkit.getServer().broadcastMessage(papi(p, Main.configurationSection.getString(str + ".messages")
                            .replace("<player>", p.getName() + "").replace("&", "§"))
                    ); // ну это лучше чем ещё 2 строчки креалиса, ведь баккит сам уже в себе имеет их, нахуя изобретать виселицу из сообщений в баккит апи
                    // да, да опять реплейсы. к нему приписочка в конце т.к баккит помнится раньше баккит творил такое.... Если бы мне заплатили за эти реплейсы, то я бы изобрёл чёт через String.format.
                }
            });
        }
    }

    private String papi(Player player, String text) {
        if(text != null && !text.isEmpty() && !text.equals("")) { // фикс, который мы заслужили xd. на деле компилятор разберётся с этим говном, насколько мне помнится.
            if (PlaceholderAPI.containsPlaceholders(text)) {
                text = PlaceholderAPI.setPlaceholders(player, text);
            }
            return text;
        }
        return "NoText"; // gege
    }


}
