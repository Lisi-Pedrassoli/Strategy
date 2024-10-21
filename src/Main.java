import Entidades.Produto;
import Estrategias.DescontoClienteNovo;
import Estrategias.DescontoClienteRegular;
import Estrategias.DescontoClienteVip;
import Servicos.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Picolé de Limão", 5.00);
        Produto p2 = new Produto("Picolé de Chocolate", 7.50);
        Produto p3 = new Produto("Picolé de Morango", 6.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        System.out.println("Total sem desconto (Cliente Novo):");
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println(carrinho.calcularTotalComDesconto());

        System.out.println("Total com 10% de desconto (Cliente Regular):");
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println(carrinho.calcularTotalComDesconto());

        System.out.println("Total com 20% de desconto (Cliente VIP):");
        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println(carrinho.calcularTotalComDesconto());
    }
}
