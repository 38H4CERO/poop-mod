package net.redcherrytree.testmod.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redcherrytree.testmod.TestMod;

public class ModItems {

    //Crea un item
    public static final Item ITEM_NAME =  registerItem("test_item",
            new Item(new FabricItemSettings()), ModItemGroup.TEST_GROUP); //or ItemGroups.GROUP_NAME si es vanilla

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item)); //Asigna al item un grupo, para el menu creativo
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        TestMod.LOGGER.debug("items del mod: " + TestMod.MOD_ID);
    }
}
