package net.junedev.junetech_geo.worldgen.noise;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

/**
 * Nothing about this is enhanced per se. It's just meant to allow determining whether to use Minecraft's Perlin noise or ours.
 * The way it's set up will also allow us to do more with our custom settings if need be
 * @author kawaiicakes
 */
public class EnhancedNormalNoise extends NormalNoise {
    public static EnhancedNormalNoise createLegacyNetherBiome(
            NoiseAlgorithm algorithm, RandomSource random, NormalNoise.NoiseParameters parameters
    ) {
        return new EnhancedNormalNoise(algorithm, random, parameters, false);
    }

    public static EnhancedNormalNoise create(
            NoiseAlgorithm algorithm, RandomSource random, int firstOctave, double... amplitudes
    ) {
        return create(algorithm, random, new NormalNoise.NoiseParameters(firstOctave, new DoubleArrayList(amplitudes)));
    }

    public static EnhancedNormalNoise create(
            NoiseAlgorithm algorithm, RandomSource random, NormalNoise.NoiseParameters parameters
    ) {
        return new EnhancedNormalNoise(algorithm, random, parameters, true);
    }


    public EnhancedNormalNoise(
            NoiseAlgorithm algorithm, RandomSource random, NoiseParameters parameters, boolean useLegacyNetherBiome
    ) {
        super(random, parameters, useLegacyNetherBiome);

        if (!algorithm.useEnhanced()) return;

        final int i = parameters.firstOctave();
        final DoubleList doublelist = parameters.amplitudes();

        this.first = useLegacyNetherBiome
                ? EnhancedPerlinNoise.createLegacyForLegacyNetherBiome(random, i, doublelist)
                : EnhancedPerlinNoise.create(random, i, doublelist);

        this.second = useLegacyNetherBiome
                ? EnhancedPerlinNoise.createLegacyForLegacyNetherBiome(random, i, doublelist)
                : EnhancedPerlinNoise.create(random, i, doublelist);
    }
}
