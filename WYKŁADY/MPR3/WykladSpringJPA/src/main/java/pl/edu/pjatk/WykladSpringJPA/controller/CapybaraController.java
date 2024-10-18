package pl.edu.pjatk.WykladSpringJPA.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjatk.WykladSpringJPA.model.Capybara;
import pl.edu.pjatk.WykladSpringJPA.service.CapybaraService;

import java.util.List;
import java.util.Optional;

@RestController
public class CapybaraController {

    private CapybaraService service;

    @Autowired
    public CapybaraController(CapybaraService service) {
        this.service = service;
    }

    @GetMapping("capybara/color/{color}")
    public List<Capybara> findCapyByColor(@PathVariable("color") String color) {
        return this.service.findCapybaraByColor(color);
    }

    @GetMapping("capybara/id")
    public Optional<Capybara> findCapyById(@RequestParam("id") Long id) {
        return this.service.getById(id);
    }
}
