package net.redcherrytree.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.redcherrytree.testmod.TestMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    //Crear grupo de items en menu creativo
    public static final ItemGroup TEST_GROUP = FabricItemGroup.builder(new Identifier(TestMod.MOD_ID))
            .displayName(Text.literal("Item Tab Name"))
            .icon(() -> new ItemStack(ModItems.ITEM_NAME)) //Icono del item que usara
            .build();

}
