package ru.domodedovo.domodedovoairport.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.domodedovo.domodedovoairport.model.Flight;

@RepositoryRestResource
public interface FlightRepository extends JpaRepository<Flight, UUID> {
}
