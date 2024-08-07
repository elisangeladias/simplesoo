package vendas;

public class Executar {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.setDescricao("produto1");
		produto1.setValor(Double.valueOf(100));
		
		Produto produto2 = new Produto();
		
		produto2.setDescricao("produto2");
		produto2.setValor(Double.valueOf(100));
	
		Venda venda = new Venda();
		
		venda.setEndEntrega("Rua A");
		venda.setNomeCliente("Elis");
		
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		

		for (Produto produto : venda.getListaProdutos()) {
			System.out.println(produto);
		}
		
		System.out.println(venda);
		
		System.out.println("O total da venda " + venda.totalVendas());

	}

}
