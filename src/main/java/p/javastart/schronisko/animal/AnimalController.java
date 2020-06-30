package p.javastart.schronisko.animal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Set;

@Controller
public class AnimalController {

    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    public String home(Model model, @RequestParam(required = false, name = "gatunek") AnimalSpecies species) {
        Set<Animal> animals;

        if (species != null) {
            animals = animalRepository.findBySpecies(species);
        } else {
            animals = animalRepository.findAll();
        }

        model.addAttribute("animals", animals);
        return "home"; // -> /resources/templates/home.html
    }

    @GetMapping("/zwierzak")
    public String details(@RequestParam String imie, Model model) {

        Animal animal = animalRepository.findByName(imie);

        if(animal != null) {
            model.addAttribute("animal", animal);
            return "animal"; // -> /resources/templates/animal.html
        } else  {
            return "redirect:/";
        }
    }

    @GetMapping("/dodaj")
    public String addForm(Model model) {
        model.addAttribute("animal", new Animal());
        return "add";
    }

    @PostMapping("/dodaj")
    public String add(Animal animal) {
        animalRepository.add(animal);
        return "redirect:/zwierzak?imie=" + animal.getName();
    }
}
