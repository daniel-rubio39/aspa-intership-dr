package aspa.intership.dr.patterns.facade.facade;

import aspa.intership.dr.patterns.facade.device.Projector;
import aspa.intership.dr.patterns.facade.device.Screen;
import aspa.intership.dr.patterns.facade.device.SoundSystem;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CinemaFacade {
    private final Projector projector;
    private final Screen screen;
    private final SoundSystem soundSystem;

    public void watchMovie() {
        System.out.println("Preparing movie...");
        screen.on();
        projector.on();
        soundSystem.on();
        System.out.println("Ready!");
    }
}
