package aspa.intership.dr.patterns.dto.dto;

import aspa.intership.dr.patterns.dto.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String name;
    private String email;
    private String phone;

    public Customer changeToCustomer() {
        return new Customer(name, email, phone);
    }
}
