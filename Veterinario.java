package animal;

public class Veterinario {

    public void darVacina(Animal animal) {
        if (animal instanceof Serpente) {
            System.out.println("Serpentes não são vacinadas");
        } else {
            System.out.println(animal.getNome()+" Vacina aplicada com Sucesso " + animal.somDeDor());
        }
    }
}
