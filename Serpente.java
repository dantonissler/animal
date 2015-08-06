package animal;

public class Serpente extends Animal {

    @Override
    public void mover() {
        System.out.println("Serpente Caminhando");
    }

    @Override
    public String somDeDor() {
        return "Shiill";
    }

    public Serpente(String nome) {
        super(nome);
    }

}
