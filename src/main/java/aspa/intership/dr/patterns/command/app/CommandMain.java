package aspa.intership.dr.patterns.command.app;

import aspa.intership.dr.patterns.command.command.Command;
import aspa.intership.dr.patterns.command.command.impl.FanOnCommandImpl;
import aspa.intership.dr.patterns.command.command.impl.LightOffCommandImpl;
import aspa.intership.dr.patterns.command.command.impl.LightOnCommandImpl;
import aspa.intership.dr.patterns.command.device.RemoteControl;
import aspa.intership.dr.patterns.command.receiver.Fan;
import aspa.intership.dr.patterns.command.receiver.Light;

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommandImpl(light);
        Command lightOff = new LightOffCommandImpl(light);
        Command fanOn = new FanOnCommandImpl(fan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(lightOn, lightOff, fanOn);

        remoteControl.pressButtonFanOn();
        remoteControl.pressButtonLightOn();
        remoteControl.pressButtonLightOff();
    }
}
