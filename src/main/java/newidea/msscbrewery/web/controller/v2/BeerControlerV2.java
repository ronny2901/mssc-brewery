package newidea.msscbrewery.web.controller.v2;

import newidea.msscbrewery.web.model.v2.BeerDtoV2;
import newidea.msscbrewery.web.services.v2.BeerServiceV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Validated
@RequestMapping("/api/v2/beer")
@RestController
public class BeerControlerV2 {

    private final BeerServiceV2 beerServiceV2;

    public BeerControlerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@NotNull @PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping// POST - CREATING NEW BEER
    public ResponseEntity handlePost(@Valid @RequestBody BeerDtoV2 beerDto){

        BeerDtoV2 savedDto = beerServiceV2.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        //TODO - add host name to url
        headers.add("Location", "/api/v1/beer"+savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate (@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDtoV2 beerDto){

        beerServiceV2.updateBeer(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer (@PathVariable UUID beerId){
        beerServiceV2.deleteBeer(beerId);
    }

}
