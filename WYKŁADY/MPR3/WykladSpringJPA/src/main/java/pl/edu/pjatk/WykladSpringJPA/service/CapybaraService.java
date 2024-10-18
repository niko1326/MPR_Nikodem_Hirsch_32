package pl.edu.pjatk.WykladSpringJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pjatk.WykladSpringJPA.model.Capybara;
import pl.edu.pjatk.WykladSpringJPA.repository.CapybaraRepository;

import java.util.List;
import java.util.Optional;

@Service
//@Component
public class CapybaraService {
    private CapybaraRepository repository;

    @Autowired
    public CapybaraService(CapybaraRepository repository) {
        this.repository = repository;

        this.repository.save(new Capybara("Julia", "beige"));
        this.repository.save(new Capybara("Szymon", "black"));
    }

    public List<Capybara> findCapybaraByColor(String color) {
        return this.repository.findByColor(color);
    }

    public Optional<Capybara> getById(Long id) {
        return this.repository.findById(id);
    }
}