package p.javastart.schronisko.animal;

public class Animal {

    private String name;
    private String description;
    private String img;
    private AnimalSpecies species;

    public Animal() {}

    public Animal(String name, String description, String img, AnimalSpecies species) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public AnimalSpecies getSpecies() {
        return this.species;
    }

    public void setSpecies(AnimalSpecies species) {
        this.species = species;
    }
}
