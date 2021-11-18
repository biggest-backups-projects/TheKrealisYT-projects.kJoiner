package ru.exept.joiner;

import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import ru.exept.joiner.utils.*;
import ru.exept.joiner.events.*;
import org.bukkit.plugin.java.*;

/**
 * Copyright © 2021 TheKrealisYT or Exept.
 * Author source code: @naulbimix. All rights reserved. Please telegram @naulbimix for usage rights and other information.
 */

public class Main extends JavaPlugin {

    private static Main instance;

    /**
     * Auto generation
     */
    @Override
    public void onEnable() {
        instance = this;
        Config.init();
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinDetect(), this);
        getCommand("kjoiner").setExecutor(new kJoiner());
    }

    /**
     * Auto generation
     */
    @Override
    public void onDisable() {}

    /**
    @return instance in main
     */
    public static Main getInstance() {
        return instance;
    }
}
