package ch.heigvd.res.lab00;

/**
 *
 * @author johan
 */
public class Flute implements IInstrument {

    // Store static final data to avoid multiple instantiation
    private static final String SOUND = "whistle";
    private static final String COLOR = "wood";
    private static final Integer SOUND_VOLUME = 50;

    @Override
    public String play() {
        return SOUND;
    }

    @Override
    public Integer getSoundVolume() {
        return SOUND_VOLUME;
    }

    @Override
    public String getColor() {
        return COLOR;
    }
    
}
