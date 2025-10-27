package com.viaversion.viaalpha.protocol.version;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.ProtocolVersion1_8;

public class VersionProviderAlpha implements VersionProvider {
    @Override
    public ProtocolVersion getClosestProtocolVersion(int clientVersion) {
        // Если клиент использует протокол Alpha (версия 2)
        if (clientVersion == 2) {
            return ProtocolVersionAlpha.ALPHA_1_2_6;
        }
        
        // Для других версий используем стандартную логику
        return ProtocolVersion1_8.getClosestProtocolVersion(clientVersion);
    }
}
