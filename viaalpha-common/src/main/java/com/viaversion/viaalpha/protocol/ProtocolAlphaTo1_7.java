package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;

// Упрощенная версия без generic типов
public class ProtocolAlphaTo1_7 extends AbstractProtocol {
    
    public ProtocolAlphaTo1_7() {
        // Пока без специфичных типов пакетов
    }

    @Override
    protected void registerPackets() {
        System.out.println("[ViaAlpha] Protocol registered - ready for development!");
        // Пока пусто - главное чтобы компилировалось
    }

    @Override
    public void init(UserConnection userConnection) {
        // Базовая инициализация
    }
}
