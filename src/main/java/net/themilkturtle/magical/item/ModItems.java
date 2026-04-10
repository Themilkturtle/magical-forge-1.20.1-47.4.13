package net.themilkturtle.magical.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.themilkturtle.magical.Magical;
import net.themilkturtle.magical.item.tea_cups.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Magical.MOD_ID);


    public static final RegistryObject<Item> ROSEQUARTZ = ITEMS.register("rose_quartz",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> BULB_BERRIES = ITEMS.register("bulb_berries",
            () -> new Item(new Item.Properties().food(ModFoods.BULB_BERRIES)));

    public static final RegistryObject<Item> HORSE_RADISH = ITEMS.register("horse_radish",
            () -> new Item(new Item.Properties().food(ModFoods.HORSE_RADISH)));

    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoods.RADISH)));

    public static final RegistryObject<Item> CORN_COB = ITEMS.register("corn_cob",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_COB)));

    public static final RegistryObject<Item> CUT_CORN = ITEMS.register("cut_corn",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_CORN)));

    public static final RegistryObject<Item> COOKED_CORN = ITEMS.register("cooked_corn",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_CORN)));



    public static final RegistryObject<Item> MINI_LEMON_TART = ITEMS.register("mini_lemon_tart",
            () -> new Item(new Item.Properties().food(ModFoods.MINI_LEMON_TART)));


    public static final RegistryObject<Item> ROSEDUST = ITEMS.register("rose_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STAFF_ROD = ITEMS.register("staff_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FISH_STICKS = ITEMS.register("fish_sticks",
            () -> new SwordItem(Tiers.WOOD, 1, 5,new Item.Properties()));


    public static final RegistryObject<Item> NET = ITEMS.register("net",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SICLE_SEED = ITEMS.register("sicle_seed",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SLING_SHOT = ITEMS.register("sling_shot",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> COPPER_RING = ITEMS.register("copper_ring",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> SPELL_PAPER = ITEMS.register("spell_paper",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> SMALL_GLASS = ITEMS.register("small_glass",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> SHOT_GLASS = ITEMS.register("shot_glass",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> TALL_GLASS = ITEMS.register("tall_glass",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LARGE_GLASS = ITEMS.register("large_glass",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> TEA_CUP = ITEMS.register("tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));


    public static final RegistryObject<Item> RED_FANCY_TEA_CUP = ITEMS.register("red_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> ORANGE_FANCY_TEA_CUP = ITEMS.register("orange_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> YELLOW_FANCY_TEA_CUP = ITEMS.register("yellow_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> LIME_FANCY_TEA_CUP = ITEMS.register("lime_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GREEN_FANCY_TEA_CUP = ITEMS.register("green_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> LIGHT_BLUE_FANCY_TEA_CUP = ITEMS.register("light_blue_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> TURQUOISE_FANCY_TEA_CUP = ITEMS.register("turquoise_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BLUE_FANCY_TEA_CUP = ITEMS.register("blue_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PURPLE_FANCY_TEA_CUP = ITEMS.register("purple_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MAGENTA_FANCY_TEA_CUP = ITEMS.register("magenta_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PINK_FANCY_TEA_CUP = ITEMS.register("pink_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> WHITE_FANCY_TEA_CUP = ITEMS.register("white_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> LIGHT_GREY_FANCY_TEA_CUP = ITEMS.register("light_grey_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GREY_FANCY_TEA_CUP = ITEMS.register("grey_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BLACK_FANCY_TEA_CUP = ITEMS.register("black_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> RAINBOW_FANCY_TEA_CUP = ITEMS.register("rainbow_fancy_tea_cup",
            () -> new Item(new Item.Properties().stacksTo(16)));

    // Green Tea

    public static final RegistryObject<Item> GREEN_TEA_TEA_CUP = ITEMS.register("green_tea_tea_cup",
            () -> new ModDrinkItemteacup_black(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));




    public static final RegistryObject<Item> GREEN_TEA_RED_FANCY_TEA_CUP = ITEMS.register("green_tea_red_fancy_tea_cup",
            () -> new ModDrinkItemteacup_red(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_ORANGE_FANCY_TEA_CUP = ITEMS.register("green_tea_orange_fancy_tea_cup",
            () -> new ModDrinkItemteacup_orange(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_YELLOW_FANCY_TEA_CUP = ITEMS.register("green_tea_yellow_fancy_tea_cup",
            () -> new ModDrinkItemteacup_yellow(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_LIME_FANCY_TEA_CUP = ITEMS.register("green_tea_lime_fancy_tea_cup",
            () -> new ModDrinkItemteacup_lime(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_GREEN_FANCY_TEA_CUP = ITEMS.register("green_tea_green_fancy_tea_cup",
            () -> new ModDrinkItemteacup_green(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_LIGHT_BLUE_FANCY_TEA_CUP = ITEMS.register("green_tea_light_blue_fancy_tea_cup",
            () -> new ModDrinkItemteacup_light_blue(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_TURQUOISE_FANCY_TEA_CUP = ITEMS.register("green_tea_turquoise_fancy_tea_cup",
            () -> new ModDrinkItemteacup_turquoise(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_BLUE_FANCY_TEA_CUP = ITEMS.register("green_tea_blue_fancy_tea_cup",
            () -> new ModDrinkItemteacup_blue(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_PURPLE_FANCY_TEA_CUP = ITEMS.register("green_tea_purple_fancy_tea_cup",
            () -> new ModDrinkItemteacup_purple(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_MAGENTA_FANCY_TEA_CUP = ITEMS.register("green_tea_magenta_fancy_tea_cup",
            () -> new ModDrinkItemteacup_magenta(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_PINK_FANCY_TEA_CUP = ITEMS.register("green_tea_pink_fancy_tea_cup",
            () -> new ModDrinkItemteacup_pink(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_WHITE_FANCY_TEA_CUP = ITEMS.register("green_tea_white_fancy_tea_cup",
            () -> new ModDrinkItemteacup_white(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_LIGHT_GREY_FANCY_TEA_CUP = ITEMS.register("green_tea_light_grey_fancy_tea_cup",
            () -> new ModDrinkItemteacup_light_grey(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_GREY_FANCY_TEA_CUP = ITEMS.register("green_tea_grey_fancy_tea_cup",
            () -> new ModDrinkItemteacup_grey(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));
    public static final RegistryObject<Item> GREEN_TEA_BLACK_FANCY_TEA_CUP = ITEMS.register("green_tea_black_fancy_tea_cup",
            () -> new ModDrinkItemteacup_black(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));

    public static final RegistryObject<Item> GREEN_TEA_RAINBOW_FANCY_TEA_CUP = ITEMS.register("green_tea_rainbow_fancy_tea_cup",
            () -> new ModDrinkItemteacup_rainbow(new Item.Properties().stacksTo(16).food(ModFoods.GREENTEA)));


    public static final RegistryObject<Item> BASIC_WOOD_STAFF_CIRCLE = ITEMS.register("basic_wood_staff_circle",
            () -> new StaffTypeSystemItem(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> BASIC_WOOD_STAFF_BLADE = ITEMS.register("basic_wood_staff_blade",
            () -> new StaffTypeSystemItem(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> BASIC_WOOD_STAFF_CLUB = ITEMS.register("basic_wood_staff_club",
            () -> new StaffTypeSystemItem(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> BASIC_WOOD_STAFF_HOOK = ITEMS.register("basic_wood_staff_hook",
            () -> new StaffTypeSystemItem(new Item.Properties().stacksTo(1)));






    public static final RegistryObject<Item> IRON_RING = ITEMS.register("iron_ring",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PAINT_BRUSH = ITEMS.register("paint_brush",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCRYINGLENS = ITEMS.register("scrying_lens",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PITCHER_OIL = ITEMS.register("pitcher_oil",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(4).food(ModFoods.PITCHER_OIL)));

    public static final RegistryObject<Item> VERY_OLD_WINE = ITEMS.register("very_old_wine",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(1).food(ModFoods.VERY_OLD_WINE)));

    public static final RegistryObject<Item> BEER_MUG = ITEMS.register("beer_mug",
            () -> new ModDrinkItemMug(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> ROOT_BEER_MUG = ITEMS.register("root_beer_mug",
            () -> new ModDrinkItemMug(new Item.Properties().stacksTo(1).food(ModFoods.ROOT_BEER_MUG)));

    public static final RegistryObject<Item> TEQUILA_SUNRISE = ITEMS.register("tequila_sunrise",
            () -> new ModDrinkItemLargeGlass(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> APPLE_CIDER = ITEMS.register("apple_cider",
            () -> new ModDrinkItemSmallGlass(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> RED_WINE_GLASS = ITEMS.register("red_wine_glass",
            () -> new ModDrinkItemTallGlass(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> WHITE_WINE_GLASS = ITEMS.register("white_wine_glass",
            () -> new ModDrinkItemTallGlass(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> BLACK_SLUDGE = ITEMS.register("black_sludge",
            () -> new ModDrinkItemLargeGlass(new Item.Properties().stacksTo(1).food(ModFoods.BLACKSLUDGE)));

    public static final RegistryObject<Item> CORNCOB_BLITZ = ITEMS.register("corncob_blitz",
            () -> new ModDrinkItemSmallGlass(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> WHITE_WINE = ITEMS.register("white_wine",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> RED_WINE = ITEMS.register("red_wine",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> VODKA = ITEMS.register("vodka",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(1).food(ModFoods.ALCOHOLS)));

    public static final RegistryObject<Item> EMPTY_MUG = ITEMS.register("empty_mug",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> TORCHFLOWER_OIL = ITEMS.register("torchflower_oil",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(4).food(ModFoods.TORCHFLOWER_OIL)));

    public static final RegistryObject<Item> SICLE_OIL = ITEMS.register("sicle_oil",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(4).food(ModFoods.SICLE_OIL)));

    public static final RegistryObject<Item> RADISH_AND_BEEF_STEW = ITEMS.register("radish_and_beef_stew",
            () -> new ModBowltem(new Item.Properties().stacksTo(1).food(ModFoods.RADISH_AND_BEEF_STEW)));

    public static final RegistryObject<Item> BULB_VINE_OIL = ITEMS.register("bulb_vine_oil",
            () -> new ModDrinkItem(new Item.Properties().stacksTo(4).food(ModFoods.BULB_VINE_OIL)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
