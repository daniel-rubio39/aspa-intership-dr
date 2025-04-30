package aspa.intership.dr.patterns.facade.app;

import aspa.intership.dr.patterns.facade.device.Projector;
import aspa.intership.dr.patterns.facade.device.Screen;
import aspa.intership.dr.patterns.facade.device.SoundSystem;
import aspa.intership.dr.patterns.facade.facade.CinemaFacade;

public class FacadeMain {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Screen screen = new Screen();
        SoundSystem soundSystem = new SoundSystem();

        CinemaFacade cinemaFacade = new CinemaFacade(projector, screen, soundSystem);

        cinemaFacade.watchMovie();
    }
}
