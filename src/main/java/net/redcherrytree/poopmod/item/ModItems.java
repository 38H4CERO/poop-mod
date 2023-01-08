package net.redcherrytree.poopmod.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redcherrytree.poopmod.PoopMod;

public class ModItems {

    //Crear un item
    //Shit on paper
    public static final Item SHIT_ON_PAPER =  registerItem("shit_on_paper",
            new Item(new Item.Settings()), ModItemGroup.MOD_GROUP); //or ItemGroups.GROUP_NAME si es vanilla

    //Shit brick
    public static final Item SHIT_BRICK =  registerItem("shit_brick",
            new Item(new Item.Settings()), ModItemGroup.MOD_GROUP);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item)); //Asigna al item un grupo, para el menu creativo
        return Registry.register(Registries.ITEM, new Identifier(PoopMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        PoopMod.LOGGER.debug("items del mod: " + PoopMod.MOD_ID);
    }
}
