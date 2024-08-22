package de.skyking_px.skycoins_forge;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = Skycoins_forge.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue DISABLE_COIN_RECIPE = BUILDER
            .comment(" Would you like the Coin 1 to be crafted or to be unique?")
            .define("disableCoin1Recipe", false);
    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean disableCoinRecipe;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        boolean disableCoinRecipe = DISABLE_COIN_RECIPE.get();
    }
}
