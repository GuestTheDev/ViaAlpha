import com.viaversion.viaversion.api.type.Types;
package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaalpha.packet.ClientboundPacketsAlpha;
import com.viaversion.viaalpha.packet.ServerboundPacketsAlpha;
import com.viaversion.viaalpha.packet.ClientboundPackets1_7;
import com.viaversion.viaalpha.packet.ServerboundPackets1_7;

public class ProtocolAlphaTo1_7 extends AbstractProtocol<ClientboundPacketsAlpha, ClientboundPackets1_7, ServerboundPacketsAlpha, ServerboundPackets1_7> {

    public ProtocolAlphaTo1_7() {
        super(ClientboundPacketsAlpha.class, ClientboundPackets1_7.class, ServerboundPacketsAlpha.class, ServerboundPackets1_7.class);
    }

    @Override
    protected void registerPackets() {
        // Пока оставляем пустым - главное чтобы компилировалось
    }

    @Override
    public void init(UserConnection userConnection) {
        // Базовая инициализация
    }
}
