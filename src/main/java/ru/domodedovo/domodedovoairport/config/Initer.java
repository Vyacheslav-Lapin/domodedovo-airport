package ru.domodedovo.domodedovoairport.config;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.domodedovo.domodedovoairport.dao.FlightRepository;
import ru.domodedovo.domodedovoairport.model.Flight;

@Component
@RequiredArgsConstructor
public class Initer implements ApplicationRunner {

  FlightRepository flightRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("A-340", "Б-550", "D-580")
        .map(Flight::new)
        .forEach(flightRepository::save);
  }
}
