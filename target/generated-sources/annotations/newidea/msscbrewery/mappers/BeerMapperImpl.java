package newidea.msscbrewery.mappers;

import javax.annotation.processing.Generated;
import newidea.msscbrewery.domain.Beer;
import newidea.msscbrewery.domain.Beer.BeerBuilder;
import newidea.msscbrewery.web.model.BeerDto;
import newidea.msscbrewery.web.model.BeerDto.BeerDtoBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T09:43:40-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        if ( dto.getVersion() != null ) {
            beer.version( dto.getVersion().longValue() );
        }
        beer.beerName( dto.getBeerName() );
        beer.beerStyle( dto.getBeerStyle() );
        beer.upc( dto.getUpc() );
        beer.price( dto.getPrice() );

        return beer.build();
    }

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        if ( beer.getVersion() != null ) {
            beerDto.version( beer.getVersion().intValue() );
        }
        beerDto.beerName( beer.getBeerName() );
        beerDto.beerStyle( beer.getBeerStyle() );
        beerDto.upc( beer.getUpc() );
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }
}
