package repositories;

import entities.Produto;
import factories.ConnectionFactory;

import java.sql.DriverManager;

public class ProdutoRepository {

    private ConnectionFactory connectionFactory = new ConnectionFactory();

    public void inserir(Produto produto) throws Exception{

        var connection = connectionFactory.getConnection();

        var statement = connection.prepareStatement
                ("INSERT INTO produtos(nome, preco, quantidade) VALUES(?,?,?)");

        statement.setString(1, produto.getNome());
        statement.setDouble(2, produto.getPreco());
        statement.setInt(3,produto.getQuantidade());
        statement.execute();

        connection.close();

    }

    public boolean atualizar(Produto produto) throws Exception {

    var connection = connectionFactory.getConnection();

    var statement = connection.prepareStatement
            ("UPDATE produtos SET nome=?, preco=?, quantidade=? WHERE id=?");

    statement.setString(1, produto.getNome());
    statement.setDouble(2, produto.getPreco());
    statement.setInt(3, produto.getQuantidade());
    statement.setInt(4, produto.getId());
    var rowsAffected = statement.executeUpdate();

    connection.close();

    return rowsAffected == 1;

    }

}
