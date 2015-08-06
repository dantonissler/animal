package animal;

public class Cachorro extends Animal {

    @Override
    public void mover() {
        System.out.println("Cachorro Caminhando");
    }

    @Override
    public String somDeDor() {
        return "Aull";
    }

    public Cachorro(String nome) {
        super(nome);
    }

}
