package newidea.msscbrewery.web.mappers;

import newidea.msscbrewery.domain.Beer;
import newidea.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
