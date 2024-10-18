package pl.edu.pjatk.WykladSpringJPA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjatk.WykladSpringJPA.model.Capybara;

import java.util.List;

@Repository
//@Component
public interface CapybaraRepository extends CrudRepository<Capybara, Long> {
    public List<Capybara> findByColor(String color);
}
