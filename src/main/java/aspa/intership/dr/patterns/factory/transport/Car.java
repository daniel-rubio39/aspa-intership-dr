package aspa.intership.dr.patterns.factory.transport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class Car extends VehicleFactory {
    @Override
    public String createVehicle() {
        return "Car created!";
    }
}
