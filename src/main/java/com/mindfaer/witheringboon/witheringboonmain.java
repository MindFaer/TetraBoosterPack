package com.mindfaer.witheringboon;

import com.mindfaer.witheringboon.item.ModItems;
import com.mindfaer.witheringboon.loot.LootTableLootModifier;
import com.mindfaer.witheringboon.loot.WBLootModifiers;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(witheringboonmain.MOD_ID)
public class witheringboonmain
{
   public static final String MOD_ID = "witheringboon";
   public static final Logger LOGGER = LogUtils.getLogger();
    public witheringboonmain()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        WBLootModifiers.LOOT_MODIFIER.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {}
    }
}
