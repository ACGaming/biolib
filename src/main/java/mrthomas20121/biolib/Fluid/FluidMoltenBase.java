package mrthomas20121.biolib.Fluid;

import mrthomas20121.biolib.biolib;
import net.minecraft.util.ResourceLocation;
import slimeknights.tconstruct.library.fluid.FluidMolten;

public class FluidMoltenBase extends FluidMolten {

    public static ResourceLocation MetalStill = new ResourceLocation(biolib.MODID, "blocks/fluids/molten_metal");
    public static ResourceLocation MetalFlowing = new ResourceLocation(biolib.MODID, "blocks/fluids/molten_metal_flow");

    public FluidMoltenBase(String name, int color) {
        super(name, color, MetalStill, MetalFlowing);
        this.setTemperature(500);
    }

}