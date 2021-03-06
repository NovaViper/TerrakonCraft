package com.novaviper.terrakoncraft.proxy.client;

import com.novaviper.terrakoncraft.proxy.common.CommonProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy extends CommonProxy {

	// Client Objects\\
	@Override
	public void onPreInit(FMLPreInitializationEvent event) {
/*		ModBlocks.loadRenderers();
		ModItems.loadRenderersAndVariants();
		ModEvents.load();
		ModEntities.loadRenderers();*/
	}

	@Override
	public void onInit(FMLInitializationEvent event) {
	}

	@Override
	public void onPostInit(FMLPostInitializationEvent event) {
	}

	@Override
	public void onServerStarting(FMLServerStartingEvent event) {
	}

	@Override
	public void onServerStarted(FMLServerStartedEvent event) {
	}

	@Override
	public void onServerStopping(FMLServerStoppingEvent event) {
	}

	@Override
	public void onServerStopped(FMLServerStoppedEvent event) {
	}

	// Client Objects\\
	@Override
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		return (ctx.side.isClient() ? Minecraft.getMinecraft().player : super.getPlayerEntity(ctx));
	}

	@Override
	public EntityPlayer getPlayerEntity() {
		return Minecraft.getMinecraft().player;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		/*if (ID == IDs.nileTableGUI) {
			TileEntity target = world.getTileEntity(new BlockPos(x, y, z));
			if (!(target instanceof TileEntityNileWorkbench)) {
				return null;
			}

			TileEntityNileWorkbench tileNileTable = (TileEntityNileWorkbench) target;
			GuiNileWorkbench tableGui = new GuiNileWorkbench(player.inventory, tileNileTable, world, new BlockPos(x, y, z));
			return tableGui;
		}*/
		return null;
	}

	/*@Override
	public void spawnCrit(World world, Entity entity) {
		FMLClientHandler.instance().getClient().effectRenderer.emitParticleAtEntity(entity, EnumParticleTypes.CRIT);
	}*/
}