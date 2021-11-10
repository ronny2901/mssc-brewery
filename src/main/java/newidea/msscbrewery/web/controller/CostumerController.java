package newidea.msscbrewery.web.controller;

import newidea.msscbrewery.web.model.CostumerDto;
import newidea.msscbrewery.web.services.CostumerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/costumer")
@RestController
public class CostumerController {

    private final CostumerService costumerService;

    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping({"/{costumerId}"})
    public ResponseEntity<CostumerDto> getCostumer (@PathVariable("costumerId") UUID costumerID) {
        return new ResponseEntity<>(costumerService.getCostumerById(costumerID), HttpStatus.OK);
    }

}
