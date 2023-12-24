package net.shale.forge.core;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingStage;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class portal extends FMLCommonSetupEvent {
    public portal(ModContainer container, ModLoadingStage stage) {
        super(container, stage);

    }

}
