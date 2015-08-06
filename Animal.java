package animal;

public abstract class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void mover();

    public abstract String somDeDor();

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}