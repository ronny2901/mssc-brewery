package newidea.msscbrewery.web.services;

import newidea.msscbrewery.web.model.BeerDto;
import newidea.msscbrewery.web.model.CostumerDto;

import java.util.UUID;

public interface CostumerService {
    CostumerDto getCostumerById(UUID costumerId);

    CostumerDto saveNewCostumer(CostumerDto costumerDto);

    void updateCostumer(UUID costumerId, CostumerDto costumerDto);

    void deleteCostumer(UUID beerId);
}
