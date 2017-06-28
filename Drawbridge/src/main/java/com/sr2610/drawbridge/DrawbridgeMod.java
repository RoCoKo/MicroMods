package com.sr2610.drawbridge;

import com.sr2610.drawbridge.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DrawbridgeMod.MODID, version = DrawbridgeMod.VERSION)
public class DrawbridgeMod {
	public static final String MODID = "drawbridge";
	public static final String VERSION = "1.0";
	public static final String COMMON_PROXY = "com.sr2610.drawbridge.proxy.CommonProxy";
	public static final String CLIENT_PROXY = "com.sr2610.drawbridge.proxy.ClientProxy";

	@SidedProxy(serverSide = COMMON_PROXY, clientSide = CLIENT_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
