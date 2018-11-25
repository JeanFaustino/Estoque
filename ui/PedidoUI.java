package ui;

import java.util.ArrayList;
import java.util.Scanner;

import negocio.Estoque;
import negocio.Produto;
import servicos.Conta;

public class PedidoUI {
	private Scanner teclado;
	private Conta conta;
	private Estoque estoque;
	private int codigoProduto;
	private int quantidade;

	public PedidoUI() {
		teclado = new Scanner(System.in);
		estoque = new Estoque();
		conta = new Conta();

	}

	public void menuPrincipal() {
               System.out.println("Escolha o seu menu de acordo com a numeracao");
               System.out.println("Menu de compra = 1");
               System.out.println("Menu de cadastro = 2");

                while (teclado.equals(0)) {
                    teclado.nextInt();

                    if (teclado.equals(1))
                    {
                    menuDeCompra();
                    }
                }
		}


    public void menuDeCompra() {
        imprimirEstoqueComValorDeVenda();
        escolherProdutoEQuantidade();
        mostrarValorTotalPedido();
        teclado.close();
    }



    public void menuDeCadastro() {
        imprimirEstoqueComQuantidadeDeProdutos();
        escolherProdutoEQuantidade();
        teclado.close();
    }




	private void imprimirEstoqueComValorDeVenda() {
		ArrayList<Produto> EstoqueCardapio = estoque.getEstoque();

		System.out.printf("\n");
		System.out.printf(" -- MENU DE PRODUTOS -- \n");
		for (int i = 0; i < EstoqueCardapio.size(); i++) {
			System.out.printf("\n " + EstoqueCardapio.get(i).getCodigo());
			System.out.printf("-" + EstoqueCardapio.get(i).getNome());
            System.out.printf(" " + EstoqueCardapio.get(i).getvalorVenda());
		}
	}

    private void imprimirEstoqueComQuantidadeDeProdutos() {
        ArrayList<Produto> EstoqueCardapio = estoque.getEstoque();

        System.out.printf("\n");
        System.out.printf(" -- MENU DE PRODUTOS -- \n");
        for (int i = 0; i < EstoqueCardapio.size(); i++) {
            System.out.printf("\n " + EstoqueCardapio.get(i).getCodigo());
            System.out.printf("-" + EstoqueCardapio.get(i).getNome());
            System.out.printf(" " + EstoqueCardapio.get(i).getQuantidade());
        }
    }


    private void escolherProdutoEQuantidade() {
		System.out.printf("\n\n Faca seu pedido de acordo com o estoque apresentado a cima: \n Produto? ");
		codigoProduto = teclado.nextInt();
		System.out.printf("Quantas unidades? ");
		quantidade = teclado.nextInt();
	}

	private void mostrarValorTotalPedido() {
		Produto produtoEscolhido = estoque.getProdutoDoEstoque(codigoProduto);
		System.out.printf("O valor do pedido foi de: " 
					+ conta.calculaPedido(produtoEscolhido, quantidade));
	}
}
