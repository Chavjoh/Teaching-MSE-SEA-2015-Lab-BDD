package ch.heigvd.res.lab00;

/**
 *
 * @author johan
 */
public class Trumpet implements IInstrument {

    // Store static final data to avoid multiple instantiation
    private static final String SOUND = "pouet";
    private static final String COLOR = "golden";
    private static final Integer SOUND_VOLUME = 100;

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
