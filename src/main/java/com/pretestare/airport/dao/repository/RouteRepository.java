package com.pretestare.airport.dao.repository;

import com.pretestare.airport.dao.model.Passenger;
import com.pretestare.airport.dao.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route, Long> {
    List<Route> findAllByPassenger(Passenger passenger);

    List<Route> findAllByDestinationAndClassType(String destination, String typeClass);

    @Query(value = "SELECT r.passenger_code, SUM(r.price) FROM Route AS r GROUP BY r.passenger_code", nativeQuery = true)
    List<Object[]> sumTotalMoneyPerPassenger();
}
