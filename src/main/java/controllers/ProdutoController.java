package controllers;

import entities.Produto;
import repositories.ProdutoRepository;

import java.util.Scanner;

public class ProdutoController {

    private ProdutoRepository produtoRepository = new ProdutoRepository();

    private Scanner scanner = new Scanner(System.in);


    public void gerenciarProdutos() throws Exception {

        System.out.println("GERENCIAMNETO DE PRODUTOS:\n");
        System.out.println("(1) CADASTRAR PRODUTO");
        System.out.println("(2) ATUALIZAR PRODUTO");
        System.out.println("(3) EXCLUIR PRODUTO");
        System.out.println("(4) CONSULTAR PRODUTOS");

        System.out.print("\nINFORME A OPÇÃO DESEJADA: ");
        var opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                atualizarProduto();
                break;
            case 3:
                excluirProduto();
                break;
            case 4:
                consultarProdutos();
                break;
            default:
                System.out.println("\nOPÇÃO INVÁLIDA!");
                break;

        }
        System.out.print("\nDESEJA REALIZAR OUTRA OPERAÇÃO? (S,N): ");
        var continuar = scanner.nextLine();

        if(continuar.equalsIgnoreCase("S")) {
            gerenciarProdutos();
        }
        else  {
            System.out.println("\nFIM DO PROGRAMA!");
        }

    }



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

    public void excluirProduto() throws Exception {

        System.out.println("\nEXCLUSÃO DE PRODUTOS:\n");

        System.out.print("ID DO PRODUTO............: ");
        var id = Integer.parseInt(scanner.nextLine());

        if(produtoRepository.excluir(id)) {
            System.out.println("\nPRODUTO EXCLUIDO COM SUCESSO!");
        } else {
            System.out.println("\nNENHUM PRODUTO FOI EXCLUIDO VERIFIQUE O ID INFORMADO.");

        }

    }

    private void consultarProdutos() throws Exception {

        System.out.println("\nCONSULTA DE PRODUTOS:\n");

        produtoRepository.consultar();

    }


}
