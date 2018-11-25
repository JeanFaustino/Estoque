package negocio;

public class  Produto {
	private int codigo;
	private String nome;
	private double quantidade;
	private double quantidadeMinima;
	private double valorVenda;

	public Produto(int codigo, String nome, double quantidade, double quantidadeMinima, double valorVenda) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.quantidadeMinima = quantidadeMinima;
		this.valorVenda = valorVenda;
	}

	public Produto() {

	}

	public int getCodigo() {
		return codigo;
	}

	public int setCodigo() {return codigo;}

	public String getNome() {
		return nome;
	}

	public String setNome() {
		return nome;
	}

    public double getQuantidade() {
        return quantidade;
    }

    public double setQuantidade() {
        return quantidade;
    }

    public double getQuantidadeMinima() {
        return quantidade;
    }

    public double setQuantidadeMinima() {
        return quantidade;
    }
    public double getvalorVenda() {
		return valorVenda;
	}
	public double setvalorVenda() {
		return valorVenda;
	}

}
