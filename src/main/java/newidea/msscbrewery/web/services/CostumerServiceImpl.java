package newidea.msscbrewery.web.services;

import newidea.msscbrewery.web.model.CostumerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CostumerServiceImpl implements CostumerService{

    @Override
    public CostumerDto getCostumerById(UUID costumerId) {
        return CostumerDto.builder()
                .id(UUID.randomUUID())
                .costumerName("Costumer Name")
                .build();
    }
}
