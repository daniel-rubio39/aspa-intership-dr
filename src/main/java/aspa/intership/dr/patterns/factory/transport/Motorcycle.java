package aspa.intership.dr.patterns.factory.transport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class Motorcycle extends VehicleFactory {
    @Override
    public String createVehicle() {
        return "Motorcycle created!";
    }
}
