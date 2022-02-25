package newidea.msscbrewery.web.mappers;

import javax.annotation.processing.Generated;
import newidea.msscbrewery.domain.Customer;
import newidea.msscbrewery.domain.Customer.CustomerBuilder;
import newidea.msscbrewery.web.model.CustomerDto;
import newidea.msscbrewery.web.model.CustomerDto.CustomerDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-24T10:13:09-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerDtoToCustomer(CustomerDto dto) {
        if ( dto == null ) {
            return null;
        }

        CustomerBuilder customer = Customer.builder();

        customer.id( dto.getId() );
        customer.name( dto.getName() );

        return customer.build();
    }

    @Override
    public CustomerDto customerToCustomerDto(Customer beer) {
        if ( beer == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.id( beer.getId() );
        customerDto.name( beer.getName() );

        return customerDto.build();
    }
}
