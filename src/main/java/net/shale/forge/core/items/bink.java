package net.shale.forge.core.items;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class bink extends Item {
    public bink(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

            //Prematurely delete the pack item so the card items can go in the same slot
            player.getItemInHand(hand).shrink(1);


        //Return success every time because we shrink it ourselves instead of using consume
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }
}
