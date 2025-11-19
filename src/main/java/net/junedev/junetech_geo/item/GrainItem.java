package net.junedev.junetech_geo.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GrainItem extends ItemWithTooltip{
    public static final int MAX_STACK_SIZE = 256;
    private final int maxStackSize;

    public GrainItem(Properties pProperties) {
        this.maxStackSize = maxStackSize;
    }
}