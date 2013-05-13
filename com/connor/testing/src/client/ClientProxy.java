package com.connor.testing.src.client;

import net.minecraftforge.client.MinecraftForgeClient;
import com.connor.testing.src.CommonProxy;
public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }}