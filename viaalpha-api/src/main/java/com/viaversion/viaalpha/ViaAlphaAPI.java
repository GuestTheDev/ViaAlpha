package com.viaversion.viaalpha;

import com.viaversion.viaalpha.protocol.ProtocolProviderAlpha;

public class ViaAlphaAPI {
    private static ViaAlphaAPI instance;
    
    public static ViaAlphaAPI getInstance() {
        return instance;
    }
    
    public static void setInstance(ViaAlphaAPI instance) {
        ViaAlphaAPI.instance = instance;
    }
    
    public boolean isEnabled() {
        return instance != null;
    }
    
    // Метод для инициализации ViaAlpha
    public static void init() {
        ProtocolProviderAlpha.register();
        System.out.println("[ViaAlpha] Initialized successfully!");
    }
}
