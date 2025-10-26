package com.viaversion.viaalpha.packet;

import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;

public enum ServerboundPacketsAlpha implements ServerboundPacketType {
    KEEP_ALIVE(0x00),           // Пустой пакет (ответ на пинг)
    LOGIN(0x01),                // Логин
    CHAT_MESSAGE(0x03),         // Сообщение в чат
    PLAYER_POSITION(0x0B),      // Позиция игрока
    PLAYER_LOOK(0x0C),          // Взгляд игрока
    PLAYER_POSITION_AND_LOOK(0x0D), // Позиция и взгляд
    PLAYER_BLOCK_PLACEMENT(0x0F),   // Установка блока
    PLAYER_DIGGING(0x0E);       // Ломание блока

    private final int id;

    ServerboundPacketsAlpha(int id) {
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
