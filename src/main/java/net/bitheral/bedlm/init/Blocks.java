package net.bitheral.bedlm.init;

import net.bitheral.bedlm.setup.RegistrationEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class Blocks {

    public static RegistryObject<Item> COMPUTER = RegistrationEvents.ITEMS.register("computer", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC).defaultMaxDamage(0).maxDamage(0).maxStackSize(1)));

    public static void register() {};
}
