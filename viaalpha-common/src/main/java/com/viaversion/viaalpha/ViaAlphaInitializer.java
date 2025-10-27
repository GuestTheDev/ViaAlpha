package com.viaversion.viaalpha;

import com.viaversion.viaalpha.protocol.ProtocolProviderAlpha;

public class ViaAlphaInitializer {
    public static void initialize() {
        System.out.println("[ViaAlpha] Initializing ViaAlpha...");
        ProtocolProviderAlpha.register();
    }
}
