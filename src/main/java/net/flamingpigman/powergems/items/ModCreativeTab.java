package net.flamingpigman.powergems.items;

import net.flamingpigman.powergems.PowerGemsBase;
import net.flamingpigman.powergems.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PowerGemsBase.MOD_ID);

    public static final RegistryObject<CreativeModeTab> POWER_GEMS_TAB = CREATIVE_MODE_TABS.register("power_gems_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMETHYST.get())) // NEED TO UPDATE THIS TO THE STRENGTH POWERGEM
                    .title(Component.translatable("creativetab.power_gems_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Gems
                        pOutput.accept(ModItems.AMETHYST.get());
                        pOutput.accept(ModItems.TOPAZ.get());
                        pOutput.accept(ModItems.CITRINE.get());
                        pOutput.accept(ModItems.PERIDOT.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.AQUAMARINE.get());
                        pOutput.accept(ModItems.TOURMALINE.get());
                        pOutput.accept(ModItems.LAPIS_LAZULI_GEM.get());

                        // Blocks
                        pOutput.accept(ModBlocks.AMETHYST_ORE.get());
                        pOutput.accept(ModBlocks.TOPAZ_ORE.get());
                        pOutput.accept(ModBlocks.CITRINE_ORE.get());
                        pOutput.accept(ModBlocks.PERIDOT_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.AQUAMARINE_ORE.get());
                        pOutput.accept(ModBlocks.TOURMALINE_ORE.get());

                        pOutput.accept(ModBlocks.AMETHYST_BLOCK.get());
                        pOutput.accept(ModBlocks.TOPAZ_BLOCK.get());
                        pOutput.accept(ModBlocks.CITRINE_BLOCK.get());
                        pOutput.accept(ModBlocks.PERIDOT_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.AQUAMARINE_BLOCK.get());
                        pOutput.accept(ModBlocks.TOURMALINE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
