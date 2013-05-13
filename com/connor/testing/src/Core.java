package com.connor.testing.src;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="Test", name="Testing", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Core {

        // The instance of your mod that Forge uses.
        @Instance("Testing")
        public static Core instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.connor.testing.src.client.ClientProxy", serverSide="com.connor.testing.src.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
        	ItemStack dirtStack = new ItemStack(Block.redstoneWire);
        	ItemStack gravelStack = new ItemStack(Block.cobblestone);

        	GameRegistry.addRecipe(new ItemStack(Block.blockDiamond), "yxy", "xyx","yxy", 
        	        'x', dirtStack, 'y', gravelStack);
        	// Stub Method
        }
        
        @Init
        
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}