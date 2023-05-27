package com.mindfaer.witheringboon.item;

import com.mindfaer.witheringboon.witheringboonmain;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, witheringboonmain.MOD_ID);

    public static final RegistryObject<Item> HOARFROSTHEAD = ITEMS.register("hoarfrosthead",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
