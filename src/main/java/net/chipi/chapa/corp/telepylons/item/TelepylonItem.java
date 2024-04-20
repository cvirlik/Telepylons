package net.chipi.chapa.corp.telepylons.item;

import net.chipi.chapa.corp.telepylons.TelepylonsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TelepylonItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TelepylonsMod.MOD_ID);

    public static final RegistryObject<Item> TELEPYLON =
            ITEMS.register("telepylon", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
