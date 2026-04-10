package net.themilkturtle.magical.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.themilkturtle.magical.Magical;
import net.themilkturtle.magical.block.ModBlocks;

public class ModCreativeModeTabs {


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Magical.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAGICAL_TAB = CREATIVE_MOD_TABS.register("magical_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROSEQUARTZ.get()))

                    .title(Component.translatable("creativetab.magical_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ROSEQUARTZ.get());
                        pOutput.accept(ModItems.SCRYINGLENS.get());
                        pOutput.accept(ModItems.ROSEDUST.get());
                        pOutput.accept(ModItems.SMALL_GLASS.get());
                        pOutput.accept(ModItems.LARGE_GLASS.get());
                        pOutput.accept(ModItems.PAINT_BRUSH.get());
                        pOutput.accept(ModItems.TEQUILA_SUNRISE.get());
                        pOutput.accept(ModItems.CORNCOB_BLITZ.get());
                        pOutput.accept(ModItems.TALL_GLASS.get());
                        pOutput.accept(ModItems.SHOT_GLASS.get());
                        pOutput.accept(ModItems.APPLE_CIDER.get());
                        pOutput.accept(ModItems.BLACK_SLUDGE.get());
                        pOutput.accept(ModItems.BULB_BERRIES.get());
                        pOutput.accept(ModItems.RED_WINE_GLASS.get());
                        pOutput.accept(ModItems.WHITE_WINE_GLASS.get());
                        pOutput.accept(ModItems.CORN_COB.get());
                        pOutput.accept(ModItems.CUT_CORN.get());
                        pOutput.accept(ModItems.COOKED_CORN.get());
                        pOutput.accept(ModItems.PITCHER_OIL.get());
                        pOutput.accept(ModItems.TEA_CUP.get());
                        pOutput.accept(ModItems.RED_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.ORANGE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.YELLOW_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.LIME_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.TURQUOISE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.BLUE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.PURPLE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.MAGENTA_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.PINK_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.WHITE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.LIGHT_GREY_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREY_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.BLACK_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.RAINBOW_FANCY_TEA_CUP.get());

                        pOutput.accept(ModItems.GREEN_TEA_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_RED_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_ORANGE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_YELLOW_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_LIME_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_GREEN_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_LIGHT_BLUE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_TURQUOISE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_BLUE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_PURPLE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_MAGENTA_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_PINK_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_WHITE_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_LIGHT_GREY_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_GREY_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_BLACK_FANCY_TEA_CUP.get());
                        pOutput.accept(ModItems.GREEN_TEA_RAINBOW_FANCY_TEA_CUP.get());


                        pOutput.accept(ModItems.BULB_VINE_OIL.get());
                        pOutput.accept(ModItems.MINI_LEMON_TART.get());
                        pOutput.accept(ModItems.COPPER_RING.get());
                        pOutput.accept(ModItems.IRON_RING.get());
                        pOutput.accept(ModItems.EMPTY_MUG.get());
                        pOutput.accept(ModItems.BEER_MUG.get());
                        pOutput.accept(ModItems.ROOT_BEER_MUG.get());
                        pOutput.accept(ModItems.WHITE_WINE.get());
                        pOutput.accept(ModItems.RED_WINE.get());
                        pOutput.accept(ModItems.VODKA.get());
                        pOutput.accept(ModItems.VERY_OLD_WINE.get());
                        pOutput.accept(ModItems.SLING_SHOT.get());
                        pOutput.accept(ModItems.HORSE_RADISH.get());
                        pOutput.accept(ModItems.NET.get());
                        pOutput.accept(ModItems.RADISH.get());
                        pOutput.accept(ModItems.RADISH_AND_BEEF_STEW.get());
                        pOutput.accept(ModItems.BASIC_WOOD_STAFF_CIRCLE.get());
                        pOutput.accept(ModItems.BASIC_WOOD_STAFF_BLADE.get());
                        pOutput.accept(ModItems.BASIC_WOOD_STAFF_HOOK.get());
                        pOutput.accept(ModItems.BASIC_WOOD_STAFF_CLUB.get());
                        pOutput.accept(ModItems.FISH_STICKS.get());
                        pOutput.accept(ModItems.STAFF_ROD.get());



                        pOutput.accept(ModItems.TORCHFLOWER_OIL.get());
                        pOutput.accept(ModItems.SICLE_OIL.get());
                        pOutput.accept(ModBlocks.SICLE.get());
                        pOutput.accept(ModItems.SICLE_SEED.get());
                        pOutput.accept(ModItems.SPELL_PAPER.get());
                        pOutput.accept(ModBlocks.BULB_VINE.get());


                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
