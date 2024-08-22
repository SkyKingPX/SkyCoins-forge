package de.skyking_px.skycoins_forge.item;

import de.skyking_px.skycoins_forge.Skycoins_forge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Skycoins_forge.MODID);

    public static final RegistryObject<Item> COIN1 = ITEMS.register("coin1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN2 = ITEMS.register("coin2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN5 = ITEMS.register("coin5",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
