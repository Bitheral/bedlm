package net.bitheral.bedlm.init;

import net.bitheral.bedlm.BEDLMod;
import net.bitheral.bedlm.setup.RegistrationEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class Items {

    public static RegistryObject<Item> SMARTPHONE = RegistrationEvents.ITEMS.register("smartphone", () ->
            new Item(new Item.Properties().group(BEDLMod.TECHNOLOGY_GROUP).defaultMaxDamage(0).maxDamage(0).maxStackSize(1)));

    // Pandemic Items
    public static RegistryObject<Item> MASK = RegistrationEvents.ITEMS.register("mask", () ->
            new Item(new Item.Properties().group(BEDLMod.PANDEMIC_GROUP).setNoRepair().maxStackSize(16)));
    public static RegistryObject<Item> DISINFECTANT = RegistrationEvents.ITEMS.register("disinfectant", () ->
            new Item(new Item.Properties().group(BEDLMod.PANDEMIC_GROUP).maxStackSize(1)));

    public static void register() {};
}
