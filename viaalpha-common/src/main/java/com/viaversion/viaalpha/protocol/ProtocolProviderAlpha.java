package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaalpha.protocol.version.ProtocolVersionAlpha;

import java.util.ArrayList;
import java.util.List;

public class ProtocolProviderAlpha {
    public static void register() {
        // Регистрируем нашу версию Alpha
        ProtocolVersion.register(ProtocolVersionAlpha.ALPHA_1_2_6);
        
        // Регистрируем наш протокол трансляции
        Via.getManager().getProtocolManager().registerProtocol(
            new ProtocolAlphaTo1_7(), 
            ProtocolVersionAlpha.ALPHA_1_2_6, 
            ProtocolVersion.v1_8
        );
        
        // Устанавливаем наш провайдер версий
        Via.getManager().getProviders().use(VersionProvider.class, new VersionProviderAlpha());
        
        System.out.println("[ViaAlpha] Alpha 1.2.6 protocol support registered!");
    }
}
