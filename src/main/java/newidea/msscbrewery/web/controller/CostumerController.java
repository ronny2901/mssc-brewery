package newidea.msscbrewery.web.controller;

import newidea.msscbrewery.web.model.BeerDto;
import newidea.msscbrewery.web.model.CostumerDto;
import newidea.msscbrewery.web.services.CostumerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/cos`tumer")
@RestController
public class CostumerController {

    private final CostumerService costumerService;

    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping({"/{costumerId}"})
    public ResponseEntity<CostumerDto> getCostumer (@PathVariable("costumerId ") UUID costumerID) {
        return new ResponseEntity<>(costumerService.getCostumerById(costumerID), HttpStatus.OK);
    }

    @PostMapping// POST - CREATING NEW COSTUMER
    public ResponseEntity handlePost(@RequestBody CostumerDto costumerDto){

        CostumerDto savedDto = costumerService.saveNewCostumer(costumerDto);

        HttpHeaders headers = new HttpHeaders();
        //TODO - add host name to url
        headers.add("Location", "/api/v1/costumer"+savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{costumerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate (@PathVariable("costumerId") UUID costumerId, @RequestBody CostumerDto costumerDto){
        costumerService.updateCostumer(costumerId, costumerDto);
    }

    @DeleteMapping({"/costumerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer (@PathVariable UUID costumerId){
        costumerService.deleteCostumer(costumerId);
    }
}
