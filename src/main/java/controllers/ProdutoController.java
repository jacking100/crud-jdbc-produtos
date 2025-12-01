package controllers;

import entities.Produto;
import repositories.ProdutoRepository;

import java.util.Scanner;

public class ProdutoController {

    private ProdutoRepository produtoRepository = new ProdutoRepository();

    private Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto() throws Exception {

        System.out.println("\nCADASTRO DE PRODUTOS:\n");

        var produto = new Produto();

        System.out.print("NOME DO PRODUTO.........: ");
        produto.setNome(scanner.nextLine());

        System.out.print("PREÇO...................: ");
        produto.setPreco(Double.parseDouble(scanner.nextLine()));

        System.out.print("QUANTIDADE..............: ");
        produto.setQuantidade(Integer.parseInt(scanner.nextLine()));


        produtoRepository.inserir(produto);

        System.out.println("\nPRODUTO CADASTRADO COM SUCESSO!");


    }

    public void atualizarProduto() throws Exception {

        System.out.println("\nEDIÇÃO DE PRODUTOS:\n");

        var produto = new Produto();

        System.out.print("ID DO PRODUTO...........: ");
        produto.setId(Integer.parseInt(scanner.nextLine()));

        System.out.print("NOME DO PRODUTO.........: ");
        produto.setNome(scanner.nextLine());

        System.out.print("PREÇO...................: ");
        produto.setPreco(Double.parseDouble(scanner.nextLine()));

        System.out.print("QUANTIDADE..............: ");
        produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

        if (produtoRepository.atualizar(produto)) {
            System.out.println("\nPRODUTO ATUALIZADO COM SUCESSO!");
        } else {
            System.out.println("\nNENHUM PRODUTO FOI ATUALIZADO. VERIFIQUE O ID INFORMADO.");
        }


    }

}
