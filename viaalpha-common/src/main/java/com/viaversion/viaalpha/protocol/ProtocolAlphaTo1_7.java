package com.viaversion.viaalpha.protocol;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Types;
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
        registerHandshake();
        registerLogin();
    }

    private void registerHandshake() {
        // Alpha Handshake (0x02) -> Modern Handshake
        registerServerbound(ServerboundPacketsAlpha.HANDSHAKE, new PacketHandlers() {
            @Override
            public void register() {
                handler(wrapper -> {
                    try {
                        // Читаем данные Alpha Handshake (только username)
                        String username = wrapper.read(Types.STRING);
                        
                        System.out.println("[ViaAlpha] Handshake from Alpha user: " + username);
                        
                        // Пока просто пропускаем пакет дальше
                        // Позже здесь будет создание modern handshake
                        
                    } catch (Exception e) {
                        System.out.println("[ViaAlpha] Handshake error: " + e.getMessage());
                        e.printStackTrace();
                    }
                });
            }
        });
    }

    private void registerLogin() {
        // Alpha Login (0x01) -> Modern Login
        registerServerbound(ServerboundPacketsAlpha.LOGIN, new PacketHandlers() {
            @Override
            public void register() {
                handler(wrapper -> {
                    try {
                        // Читаем Alpha Login данные
                        byte protocolVersion = wrapper.read(Types.BYTE);
                        String username = wrapper.read(Types.STRING);
                        long seed = wrapper.read(Types.LONG);
                        byte dimension = wrapper.read(Types.BYTE);
                        
                        System.out.println("[ViaAlpha] Login attempt: " + username + 
                                         ", version: " + protocolVersion + 
                                         ", seed: " + seed +
                                         ", dimension: " + dimension);
                        
                        // TODO: Преобразование в modern login start
                        // Пока просто логируем
                        
                    } catch (Exception e) {
                        System.out.println("[ViaAlpha] Login error: " + e.getMessage());
                        e.printStackTrace();
                    }
                });
            }
        });
    }

    @Override
    public void init(UserConnection userConnection) {
        // Базовая инициализация
    }
}
