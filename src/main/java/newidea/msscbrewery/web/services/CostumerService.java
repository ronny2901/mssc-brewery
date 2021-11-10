package newidea.msscbrewery.web.services;

import newidea.msscbrewery.web.model.CostumerDto;

import java.util.UUID;

public interface CostumerService {
    CostumerDto getCostumerById(UUID costumerId);
}
