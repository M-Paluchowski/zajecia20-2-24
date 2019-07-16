package p.javastart.schronisko;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class AnimalRepository {

    private Set<Animal> animals;

    public AnimalRepository() {
        animals = new HashSet<>();
        animals.add(new Animal("Azor", "Azor to super piesek", "/azor.jpg"));
        animals.add(new Animal("Rudy", "Rudy kocur chodzi swoimi ścieżkami.", "https://royalcanin.pl/blog/wp-content/uploads/2018/05/starszy-rudy-kot-950x680.jpeg"));
        animals.add(new Animal("Osiołek", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis dignissim ipsum a aliquam tincidunt. Etiam vulputate ultricies magna ac tristique. Morbi pharetra iaculis magna, et imperdiet metus maximus sed. Aliquam erat volutpat. Phasellus et augue odio. Duis sapien ligula, ullamcorper eu varius et, convallis in urna. Donec eu neque quis.", "https://royalcanin.pl/blog/wp-content/uploads/2018/05/starszy-rudy-kot-950x680.jpeg"));
        animals.add(new Animal("Myszka miki", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis dignissim ipsum a aliquam tincidunt. Etiam vulputate ultricies magna ac tristique. Morbi pharetra iaculis magna, et imperdiet metus maximus sed. Aliquam erat volutpat. Phasellus et augue odio. Duis sapien ligula, ullamcorper eu varius et, convallis in urna. Donec eu neque quis.", "data:image/jpeg;base64,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"));
        animals.add(new Animal("Rogacz", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis dignissim ipsum a aliquam tincidunt. Etiam vulputate ultricies magna ac tristique. Morbi pharetra iaculis magna, et imperdiet metus maximus sed. Aliquam erat volutpat. Phasellus et augue odio. Duis sapien ligula, ullamcorper eu varius et, convallis in urna. Donec eu neque quis.", "https://royalcanin.pl/blog/wp-content/uploads/2018/05/starszy-rudy-kot-950x680.jpeg"));
        animals.add(new Animal("Jerry", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis dignissim ipsum a aliquam tincidunt. Etiam vulputate ultricies magna ac tristique. Morbi pharetra iaculis magna, et imperdiet metus maximus sed. Aliquam erat volutpat. Phasellus et augue odio. Duis sapien ligula, ullamcorper eu varius et, convallis in urna. Donec eu neque quis.", "https://royalcanin.pl/blog/wp-content/uploads/2018/05/starszy-rudy-kot-950x680.jpeg"));
    }

    public Animal findByName(String name) {
        for (Animal animal : animals) {
            if(animal.getName().equals(name)) {
                return animal;
            }
        }

        return null;
    }

    public Set<Animal> findAll() {
        return animals;
    }
}
