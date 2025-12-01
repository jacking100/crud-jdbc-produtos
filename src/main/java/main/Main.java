package main;

import controllers.ProdutoController;

public class Main {

    static void main() {

        try {

            var produtoController = new ProdutoController();
            produtoController.atualizarProduto();

        }
        catch(Exception e) {
            System.out.println("\nFALHA: " + e.getMessage());
        }

    }

}
