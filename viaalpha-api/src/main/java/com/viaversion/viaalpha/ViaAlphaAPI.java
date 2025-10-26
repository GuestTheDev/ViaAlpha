package com.viaversion.viaalpha;

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
}
