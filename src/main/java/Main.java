import dao.ProdutoDAO;
import model.Produtos;

public class Main {
    public static void main(String[] args) {

        // Criação dos produtos
        Produtos produto1 = new Produtos(0, "Boné", 19.99);
        Produtos produto2 = new Produtos(0, "Camiseta", 58.60);

        // DAO responsável pelo banco
        ProdutoDAO dao = new ProdutoDAO();

        // Inserindo no banco
        dao.inserir(produto1);
        dao.inserir(produto2);

        // Exibição local (opcional)
        produto1.exibirDados();
        produto2.exibirDados();
    }
}
