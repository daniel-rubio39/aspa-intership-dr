package aspa.intership.dr.patterns.command.device;

import aspa.intership.dr.patterns.command.command.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RemoteControl {
    private Command buttonLightOn;
    private Command buttonLightOff;
    private Command buttonFanOn;

    public void setCommands(Command buttonLightOn, Command buttonLightOff, Command buttonFanOn) {
        this.buttonLightOn = buttonLightOn;
        this.buttonLightOff = buttonLightOff;
        this.buttonFanOn = buttonFanOn;
    }

    public void pressButtonLightOn() {
        buttonLightOn.execute();
    }

    public void pressButtonLightOff() {
        buttonLightOff.execute();
    }

    public void pressButtonFanOn() {
        buttonFanOn.execute();
    }
}
