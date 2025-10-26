package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaalpha.packet.ClientboundPacketsAlpha;
import com.viaversion.viaalpha.packet.ServerboundPacketsAlpha;

public class ProtocolAlphaTo1_7 extends AbstractProtocol<ClientboundPacketsAlpha, 
                                                       com.viaversion.viaversion.protocols.v1_7_6to1_8.packet.ClientboundPackets1_8,
                                                       ServerboundPacketsAlpha, 
                                                       com.viaversion.viaversion.protocols.v1_7_6to1_8.packet.ServerboundPackets1_8> {

    public ProtocolAlphaTo1_7() {
        super(ClientboundPacketsAlpha.class, 
              com.viaversion.viaversion.protocols.v1_7_6to1_8.packet.ClientboundPackets1_8.class,
              ServerboundPacketsAlpha.class, 
              com.viaversion.viaversion.protocols.v1_7_6to1_8.packet.ServerboundPackets1_8.class);
    }

    @Override
    protected void registerPackets() {
        // Пока просто зарегистрируем пустые обработчики для компиляции
        // Реальную логику добавим позже
        registerClientbound(ClientboundPacketsAlpha.KEEP_ALIVE, new PacketHandlers() {
            @Override
            public void register() {
                // TODO: KeepAlive транслятор
            }
        });
    }

    @Override
    public void init(UserConnection userConnection) {
        // Инициализация соединения
    }
}
