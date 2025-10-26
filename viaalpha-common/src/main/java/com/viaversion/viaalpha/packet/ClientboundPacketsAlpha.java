package com.viaversion.viaalpha.packet;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;

public enum ClientboundPacketsAlpha implements ClientboundPacketType {
    KEEP_ALIVE(0x00),           // Пустой пакет
    LOGIN(0x01),                // Логин
    CHAT_MESSAGE(0x03),         // Сообщение в чат
    SPAWN_POSITION(0x06),       // Позиция спавна
    PLAYER_POSITION_AND_LOOK(0x0D), // Позиция и взгляд игрока
    BLOCK_CHANGE(0x35),         // Изменение блока
    DISCONNECT(0xFF);           // Отключение

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
