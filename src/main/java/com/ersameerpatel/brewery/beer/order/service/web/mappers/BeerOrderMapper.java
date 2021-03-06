package com.ersameerpatel.brewery.beer.order.service.web.mappers;

import com.ersameerpatel.brewery.beer.order.service.domain.BeerOrder;
import com.ersameerpatel.brewery.beer.order.service.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
