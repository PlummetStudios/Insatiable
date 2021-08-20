package com.plummetstudios.insatiable.item;

import com.plummetstudios.insatiable.Insatiable;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Insatiable.MOD_ID);

    public static final RegistryObject<Item> RAW_GAME_MEAT = ITEMS.register("raw_game_meat",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.4F).meat().effect(new EffectInstance(Effects.MINING_FATIGUE, 90, 0), 1F).build())));

    public static final RegistryObject<Item> COOKED_GAME_MEAT = ITEMS.register("cooked_game_meat",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.4F).meat().build())));

    public static final RegistryObject<Item> MEAT_PIE = ITEMS.register("meat_pie",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(1F).meat().build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));

    }
}
