package com.viaversion.viaalpha.packet;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;

public enum ClientboundPacketsAlpha implements ClientboundPacketType {
    KEEP_ALIVE(0x00),
    LOGIN(0x01),
    CHAT_MESSAGE(0x03),
    SPAWN_POSITION(0x06),
    PLAYER_POSITION_AND_LOOK(0x0D),
    BLOCK_CHANGE(0x35),
    DISCONNECT(0xFF);

    private final int id;

    ClientboundPacketsAlpha(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name();
    }
}
