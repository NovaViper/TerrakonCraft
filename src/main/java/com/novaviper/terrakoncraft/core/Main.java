package com.novaviper.terrakoncraft.core;

import com.novaviper.terrakoncraft.proxy.common.CommonProxy;
import com.novaviper.terrakoncraft.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION, name = Reference.MOD_NAME, acceptedMinecraftVersions = Reference.MC_VERSION, updateJSON = Reference.UPDATE_JSON, dependencies = Reference.DEPENDENCIES)
public class Main {
	
	@Mod.Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.onPreInit(event);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.onInit(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.onPostInit(event);
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.onServerStarting(event);
    }

    @EventHandler
    public void serverStarted(FMLServerStartedEvent event) {
        proxy.onServerStarted(event);
    }

    @EventHandler
    public void serverStopping(FMLServerStoppingEvent event) {
        proxy.onServerStopping(event);
    }

    @EventHandler
    public void serverStop(FMLServerStoppedEvent event) {
        proxy.onServerStopped(event);
    }
}
