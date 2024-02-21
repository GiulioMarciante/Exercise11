package develhope.co.exercise11.repositories;

import develhope.co.exercise11.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
@RepositoryRestController
public interface CarRepository extends JpaRepository<Car, Long> {
}
