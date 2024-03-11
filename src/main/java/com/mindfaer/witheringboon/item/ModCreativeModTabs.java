package com.mindfaer.witheringboon.item;

import com.mindfaer.witheringboon.witheringboonmain;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,witheringboonmain.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("witheringboon",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOULANITEALLOY.get()))
                    .title(Component.translatable("creativetab.witheringboon"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AMETHYSTGALE.get());
                        pOutput.accept(ModItems.BLACKBLOODBLADE.get());
                        pOutput.accept(ModItems.ENDERCHAMBER.get());
                        pOutput.accept(ModItems.ENDEROVERDRIVEMODULE.get());
                        pOutput.accept(ModItems.HARDENEDPRISMARINE.get());
                        pOutput.accept(ModItems.HOARFROSTHEAD.get());
                        pOutput.accept(ModItems.LOSTVIPER.get());
                        pOutput.accept(ModItems.RAIDHORN.get());
                        pOutput.accept(ModItems.SOULANITEALLOY.get());
                        pOutput.accept(ModItems.SOULANITEINGOT.get());
                        pOutput.accept(ModItems.WITHEREDBLOOD.get());

                        pOutput.accept(ModItems.MELDEDGEODE.get());

                        pOutput.accept(ModItems.CHALCANTHITE.get());
                        pOutput.accept(ModItems.CITRINE.get());
                        pOutput.accept(ModItems.CHALCANTHITE.get());
                        pOutput.accept(ModItems.DUMORTIERITEQUARTZ.get());
                        pOutput.accept(ModItems.JASPER.get());
                        pOutput.accept(ModItems.KYANITE.get());
                        pOutput.accept(ModItems.MALACHITE.get());
                        pOutput.accept(ModItems.PERIDOT.get());
                        pOutput.accept(ModItems.PRASE.get());
                        pOutput.accept(ModItems.TANZANITE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
