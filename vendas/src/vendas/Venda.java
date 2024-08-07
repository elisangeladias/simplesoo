package vendas;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private String nomeCliente;
	private String endEntrega;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public double totalVendas() {
		double total = 0.0;
		
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		
		return total;
	}
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEndEntrega() {
		return endEntrega;
	}
	public void setEndEntrega(String endEntrega) {
		this.endEntrega = endEntrega;
	}
	@Override
	public String toString() {
		return "Venda [nomeCliente=" + nomeCliente + ", endEntrega=" + endEntrega + "]";
	}
	
	

}
