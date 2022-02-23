package newidea.msscbrewery.mappers;

import newidea.msscbrewery.domain.Customer;
import newidea.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer beer);
}
