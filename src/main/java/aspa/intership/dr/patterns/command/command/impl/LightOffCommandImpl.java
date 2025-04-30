package aspa.intership.dr.patterns.command.command.impl;

import aspa.intership.dr.patterns.command.command.Command;
import aspa.intership.dr.patterns.command.receiver.Light;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LightOffCommandImpl implements Command {
    private final Light light;

    @Override
    public void execute() {
        light.turnOff();
    }
}
