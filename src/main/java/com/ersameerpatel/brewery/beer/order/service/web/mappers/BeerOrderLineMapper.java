package com.ersameerpatel.brewery.beer.order.service.web.mappers;

import com.ersameerpatel.brewery.beer.order.service.domain.BeerOrderLine;
import com.ersameerpatel.brewery.beer.order.service.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
