package negocio;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> estoque;

	public Estoque() {
		estoque = new ArrayList<Produto>();
		adicionaProdutosNoEstoque();
	}

	private void adicionaProdutosNoEstoque() {
		estoque.add(new Produto(1, "azeite", 15, 5, 11.00));
		estoque.add(new Produto(2, "Arroz", 30, 10,  14.00));
		estoque.add(new Produto(3, "Feijao", 20, 8, 16.00));
		estoque.add(new Produto(4, "Massa", 30, 10, 5.00));
		estoque.add(new Produto(5, "Picles", 10, 5, 3.50));
		estoque.add(new Produto(6, "Agua s/gas", 30, 5, 2.00));
		estoque.add(new Produto(7, "Agua c/gas",30, 5, 2.50));
		estoque.add(new Produto(8, "Refrigerante Garrafa 600ml",10,3, 5.00));
		estoque.add(new Produto(9, "Refrigerante 2L",15,4, 10.00));
	}

	public ArrayList<Produto> getEstoque() {
		return estoque;
	}
	
	public Produto getProdutoDoEstoque(int codigoProduto) {
		Produto produtoEscolhido = null;

		for (int i = 0; i < estoque.size(); i++) {
			if (codigoProduto == estoque.get(i).getCodigo())
				produtoEscolhido = estoque.get(i);
		}
		return produtoEscolhido;
	}

	public void adicionaNovo(Produto produto) {
		estoque.add(produto);
	}


	}

