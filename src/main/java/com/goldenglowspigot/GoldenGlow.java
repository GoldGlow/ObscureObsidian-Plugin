package com.goldenglowspigot;

import com.goldenglowspigot.common.handlers.events.*;
import com.goldenglowspigot.common.util.PermissionUtils;
import com.goldenglowspigot.common.util.actions.TitleActions;
import com.goldenglowspigot.common.util.requirements.PermissionRequirement;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class GoldenGlow extends JavaPlugin{

    public String VERSION = "1.0.3";

    public static Thread statsServer;

    public GoldenGlow() {
    }

    @Override
    public void onEnable(){
        Bukkit.getServer().getPluginManager().registerEvents(new SpigotEvents(), this);
        com.goldenglow.GoldenGlow.permissionUtils=new PermissionUtils();
        com.goldenglow.GoldenGlow.actionHandler.actionTypes.add(new TitleActions());
        com.goldenglow.GoldenGlow.requirementHandler.addRequirement(new PermissionRequirement());
    }
}