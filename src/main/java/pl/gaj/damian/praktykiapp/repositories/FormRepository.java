package pl.gaj.damian.praktykiapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.gaj.damian.praktykiapp.entities.Form;

public interface FormRepository extends JpaRepository<Form, String> {
}
