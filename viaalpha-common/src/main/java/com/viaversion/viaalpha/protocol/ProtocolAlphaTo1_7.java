package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaalpha.packet.ClientboundPacketsAlpha;
import com.viaversion.viaalpha.packet.ServerboundPacketsAlpha;

// Временная упрощенная версия - будем использовать Object как целевые пакеты
public class ProtocolAlphaTo1_7 extends AbstractProtocol<ClientboundPacketsAlpha, Object, ServerboundPacketsAlpha, Object> {

    public ProtocolAlphaTo1_7() {
        super(ClientboundPacketsAlpha.class, Object.class, ServerboundPacketsAlpha.class, Object.class);
    }

    @Override
    protected void registerPackets() {
        // Базовые обработчики для компиляции
        registerClientbound(ClientboundPacketsAlpha.KEEP_ALIVE, new PacketHandlers() {
            @Override
            public void register() {
                // TODO: KeepAlive транслятор
                handler(wrapper -> {
                    // Пока просто пропускаем пакет
                    System.out.println("[ViaAlpha] KeepAlive packet received");
                });
            }
        });
    }

    @Override
    public void init(UserConnection userConnection) {
        // Базовая инициализация
    }
}
