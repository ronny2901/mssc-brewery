package newidea.msscbrewery.web.services.v2;

import lombok.extern.slf4j.Slf4j;
import newidea.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {

    }

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }
}
