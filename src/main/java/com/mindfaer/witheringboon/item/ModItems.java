package com.mindfaer.witheringboon.item;

import com.mindfaer.witheringboon.witheringboonmain;
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
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> MELDEDGEODE = ITEMS.register("meldedgeode",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> HARDENEDPRISMARINE = ITEMS.register("hardenedprismarine",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ROSEQUARTZ = ITEMS.register("rosequartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUMORTIERITEQUARTZ = ITEMS.register("dumortieritequartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRASE = ITEMS.register("prase",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYANITE = ITEMS.register("kyanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JASPER = ITEMS.register("jasper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHALCANTHITE = ITEMS.register("chalcanthite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYSTGALE = ITEMS.register("amethystgale",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> ENDERCHAMBER = ITEMS.register("enderchamber",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> WARDENSBANE = ITEMS.register("wardensbane",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));
    public static final RegistryObject<Item> ENDEROVERDRIVEMODULE = ITEMS.register("enderoverdrivemodule",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));
    public static final RegistryObject<Item> WITHEREDSOULSTONE = ITEMS.register("witheredsoulstone",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));
    public static final RegistryObject<Item> BLACKBLOODBLADE = ITEMS.register("blackbloodblade",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));
    public static final RegistryObject<Item> LOSTVIPER = ITEMS.register("lostviper",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> RAIDHORN = ITEMS.register("raidhorn",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> SOULANITEINGOT = ITEMS.register("soulaniteingot",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SOULANITEALLOY = ITEMS.register("soulanitealloy",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}