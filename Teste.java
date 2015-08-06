package animal;

public class Teste {

    public static void main(String[] args) {

        Veterinario ve = new Veterinario();
        Cachorro ca = new Cachorro("Dog");
        Papagaio pa = new Papagaio("Lirica");
        Serpente se = new Serpente("Serp");
        
        ve.darVacina(ca);
        ve.darVacina(pa);
        ve.darVacina(se);
    }
}
