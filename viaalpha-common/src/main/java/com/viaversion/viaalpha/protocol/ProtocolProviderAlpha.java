package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaalpha.protocol.version.ProtocolVersionAlpha;
import com.viaversion.viaalpha.protocol.version.VersionProviderAlpha;

import java.util.ArrayList;
import java.util.List;

public class ProtocolProviderAlpha {
    public static void register() {
        System.out.println("[ViaAlpha] Starting registration...");
        
        try {
            // Регистрируем нашу версию Alpha
            ProtocolVersion.register(ProtocolVersionAlpha.ALPHA_1_2_6);
            System.out.println("[ViaAlpha] Protocol version registered");
            
            // Регистрируем наш протокол трансляции
            Via.getManager().getProtocolManager().registerProtocol(
                new ProtocolAlphaTo1_7(), 
                ProtocolVersionAlpha.ALPHA_1_2_6, 
                ProtocolVersion.v1_8
            );
            System.out.println("[ViaAlpha] Protocol translator registered");
            
            // Устанавливаем наш провайдер версий (ПРАВИЛЬНЫЙ СПОСОБ)
            Via.getManager().getProviders().register(VersionProvider.class, new VersionProviderAlpha());
            System.out.println("[ViaAlpha] Version provider registered");
            
            System.out.println("[ViaAlpha] Alpha 1.2.6 protocol support registered successfully!");
            
        } catch (Exception e) {
            System.out.println("[ViaAlpha] Registration error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
