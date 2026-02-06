public class Main {
    public static void main(String[] args) {
        
        Produtos produto1 = new Produtos(1, "Boné", 19.99);
        Produtos produto2 = new Produtos(2, "Camiseta", 58.60);

        produto1.exibirDados();
        produto2.exibirDados();

    }
}
