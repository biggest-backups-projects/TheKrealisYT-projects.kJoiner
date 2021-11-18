package ru.exept.joiner.events;

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

    @EventHandler
    public void onJoin13(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.donatejoin")) {
            for(Player x : Bukkit.getOnlinePlayers()) {
                x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
            }
        }
    }

    private String papi(Player player, String text) {
        if (PlaceholderAPI.containsPlaceholders(text)) {
            text = PlaceholderAPI.setPlaceholders(player, text);
        }

        return text;
    }

    @EventHandler
    public void onJoin12(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join12.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.12")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }
    }

    @EventHandler
    public void onJoin11(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join11.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.11")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin10(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join10.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.10")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin9(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join9.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.9")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin8(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join8.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.8")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin7(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join7.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.7")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin6(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join6.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.6")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin5(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join5.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.5")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin4(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join4.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.4")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin3(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join3.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.3")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin2(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join2.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.2")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }

    @EventHandler
    public void onJoin1(PlayerJoinEvent e) {
        String format = Config.getConfig().getString("join1.messages");
        Player p = e.getPlayer();
        if (p.hasPermission("kjoiner.bypass") || p.isOp()) {
            e.setJoinMessage(null);
            if (p.hasPermission("kjoiner.1")) {
                for(Player x : Bukkit.getOnlinePlayers()) {
                    x.sendMessage(JoinDetect.this.papi(e.getPlayer(), format.replace("<player>", e.getPlayer().getName()).replace("&", "§")));
                }
            }
        }

    }


}
