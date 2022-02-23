package newidea.msscbrewery.mappers;

import newidea.msscbrewery.domain.Beer;
import newidea.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto dto);

    BeerDto beerToBeerDto(Beer beer);
}
