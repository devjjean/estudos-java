package dao;

import conexao.ConexaoPostgres;
import model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void inserir(Produtos produto) {

        String sql = "INSERT INTO produtos (nome, valor) VALUES (?, ?)";

        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNomeProduto());
            stmt.setDouble(2, produto.getValorProduto());

            stmt.executeUpdate();
            System.out.println("Produto inserido no banco!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
