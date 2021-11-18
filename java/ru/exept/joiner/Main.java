package ru.exept.joiner;

import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import ru.exept.joiner.utils.*;
import org.bukkit.plugin.java.*;
import ru.exept.joiner.listeners.*;

/**
 * Copyright © 2021 TheKrealisYT or Exept.
 * Author source code: @naulbimix. All rights reserved. Please telegram @naulbimix for usage rights and other information.
 */

public class Main extends JavaPlugin {

    private static Main instance;
    public static ConfigurationSection configurationSection; // хули зыришь, я написал, а ты сосёшь хуй если спастишь тварь, не для тебя писали

    /**
     * Auto generation
     */
    @Override
    public void onEnable() {
        instance = this;
        try {
            Config.init();
            Bukkit.getServer().getPluginManager().registerEvents(new JoinDetect(), this);
            getCommand("kjoiner").setExecutor(new kJoiner());
            configurationSection = Config.getConfig().getConfigurationSection("joinMessages");
        }catch(NoClassDefFoundError ex) {
            throw new NoClassDefFoundError("Classes plugin not founded! Error message: " + ex.getMessage()); // привычка...
        }
    }

    /**
     * Auto generation
     */
    @Override
    public void onDisable() {
		HandlerList.unregisterAll(this); // фиксим хандлеры нахуй
	}

    /**
    @return instance in main
     */
    public static Main getInstance() {
        return instance;
    }
}
