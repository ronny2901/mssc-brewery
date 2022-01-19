package newidea.msscbrewery.web.services;

import lombok.extern.slf4j.Slf4j;
import newidea.msscbrewery.web.model.CostumerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CostumerServiceImpl implements CostumerService{

    @Override
    public CostumerDto getCostumerById(UUID costumerId) {
        return CostumerDto.builder()
                .id(UUID.randomUUID())
                .name("Costumer Name")
                .build();
    }

    @Override
    public CostumerDto saveNewCostumer(CostumerDto costumerDto) {
        return CostumerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCostumer(UUID costumerId, CostumerDto costumerDto) {

    }

    @Override
    public void deleteCostumer(UUID beerId) {
        log.debug("Deleting e beer...");
    }
}
