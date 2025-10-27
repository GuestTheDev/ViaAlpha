package com.viaversion.viaalpha.protocol.version;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.ProtocolVersion1_8;

public class VersionProviderAlpha implements VersionProvider {
    @Override
    public ProtocolVersion getClosestProtocolVersion(int clientVersion) {
        System.out.println("[ViaAlpha] VersionProvider called for client version: " + clientVersion);
        
        // Если клиент использует протокол Alpha (версия 2)
        if (clientVersion == 2) {
            System.out.println("[ViaAlpha] Detected Alpha 1.2.6 client!");
            return ProtocolVersionAlpha.ALPHA_1_2_6;
        }
        
        // Для других версий используем стандартную логику
        System.out.println("[ViaAlpha] Using default version detection");
        return ProtocolVersion1_8.getClosestProtocolVersion(clientVersion);
    }
}
