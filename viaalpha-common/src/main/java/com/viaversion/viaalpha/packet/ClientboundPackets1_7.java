package com.viaversion.viaalpha.packet;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;

public enum ClientboundPackets1_7 implements ClientboundPacketType {
    // Пока пустой - позже заполним реальными пакетами 1.7
    DUMMY(0);

    private final int id;

    ClientboundPackets1_7(int id) {
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
