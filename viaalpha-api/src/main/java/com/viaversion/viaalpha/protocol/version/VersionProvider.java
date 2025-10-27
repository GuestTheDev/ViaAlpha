package com.viaversion.viaalpha.protocol.version;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public interface VersionProvider {
    ProtocolVersion getClosestProtocolVersion(int clientVersion);
}
