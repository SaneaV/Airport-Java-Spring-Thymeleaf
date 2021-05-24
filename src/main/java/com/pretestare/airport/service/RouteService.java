package com.pretestare.airport.service;

import com.pretestare.airport.dao.dto.RouteDto;
import com.pretestare.airport.dao.dto.impl.PassengerDtoImpl;
import com.pretestare.airport.dao.dto.impl.RouteDtoImpl;

import java.util.List;
import java.util.Map;

public interface RouteService {
    List<RouteDto> findAll();

    RouteDtoImpl findById(Long id);

    void save(RouteDtoImpl routeDto);

    void deleteById(Long id);

    List<RouteDto> findAllByPassenger(PassengerDtoImpl passenger);

    List<RouteDtoImpl> findAllByDestinationAndClass(String destination, String typeClass);

    Map<Long, Integer> sumTotalMoneyPerPassenger();
}
