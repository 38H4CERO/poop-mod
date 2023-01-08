package net.redcherrytree.poopmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.redcherrytree.poopmod.PoopMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    //Crear grupo de items en menu creativo
    public static final ItemGroup MOD_GROUP = FabricItemGroup.builder(new Identifier(PoopMod.MOD_ID))
            .displayName(Text.literal("Poop Mod"))
            .icon(() -> new ItemStack(ModItems.SHIT_ON_PAPER)) //Icono del item que usara
            .build();

}
