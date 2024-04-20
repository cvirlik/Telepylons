package net.chipi.chapa.corp.telepylons.item;

import net.chipi.chapa.corp.telepylons.TelepylonsMod;
import net.chipi.chapa.corp.telepylons.block.TelepylonBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TelepylonsCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TelepylonsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("telepylons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TelepylonItem.TELEPYLON.get()))
                    .title(Component.translatable("creativetab.telepylons_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //pOutput.accept(TelepylonItem.TELEPYLON.get());
                        pOutput.accept(TelepylonBlock.TELEPYLON_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
