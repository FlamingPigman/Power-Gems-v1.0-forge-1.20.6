package net.flamingpigman.powergems.items;

import net.flamingpigman.powergems.PowerGemsBase;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PowerGemsBase.MOD_ID);
    // TODO ADD TOOLS AND ARMOR
    // Gems
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT= ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_LAZULI_GEM = ITEMS.register("lapis_lazuli_gem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
