package com.viaversion.viaalpha.platform;

import com.viaversion.viaalpha.ViaAlphaAPI;
import com.viaversion.viaversion.api.Via;
import org.bukkit.plugin.java.JavaPlugin;

public class ViaAlphaPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // Инициализируем ViaAlpha
        ViaAlphaAPI.setInstance(new ViaAlphaAPI());
        ViaAlphaAPI.init();
        
        getLogger().info("ViaAlpha has been enabled! Alpha 1.2.6 support activated.");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("ViaAlpha has been disabled.");
    }
}
