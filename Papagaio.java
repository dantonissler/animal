package animal;

public class Papagaio extends Animal {

    @Override
    public void mover() {
        System.out.println("Papagaio Caminhando");
    }

    @Override
    public String somDeDor() {
        return "Arha";
    }

    public Papagaio(String nome) {
        super(nome);
    }

}
