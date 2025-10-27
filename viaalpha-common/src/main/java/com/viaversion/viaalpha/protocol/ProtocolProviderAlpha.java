package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public class ProtocolProviderAlpha {
    public static void register() {
        System.out.println("[ViaAlpha] Starting registration...");
        
        try {
            // ПРОСТО РЕГИСТРИРУЕМ ПРОТОКОЛ БЕЗ ВЕРСИЙ
            Via.getManager().getProtocolManager().registerProtocol(new ProtocolAlphaTo1_7(), null, null);
            
            System.out.println("[ViaAlpha] Protocol registered successfully!");
            
        } catch (Exception e) {
            System.out.println("[ViaAlpha] Registration error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
