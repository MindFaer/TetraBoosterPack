package com.mindfaer.witheringboon.loot;

import com.mindfaer.witheringboon.witheringboonmain;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WBLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, witheringboonmain.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_TO_LOOT_TABLE =
            LOOT_MODIFIER.register("add_to_loot_table", LootTableLootModifier.CODEC);

}