package newidea.msscbrewery.web.services;

import lombok.extern.slf4j.Slf4j;
import newidea.msscbrewery.web.model.BeerDto;
import newidea.msscbrewery.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Heinekein")
                .beerStyle(BeerStyleEnum.PALE_ALE)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Updating e customer...");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting e customer...");
    }
}
