package aspa.intership.dr.patterns.command.command.impl;

import aspa.intership.dr.patterns.command.command.Command;
import aspa.intership.dr.patterns.command.receiver.Fan;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FanOnCommandImpl implements Command {
    private final Fan fan;

    @Override
    public void execute() {
        fan.turnOn();
    }
}
