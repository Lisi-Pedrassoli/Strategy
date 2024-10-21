package Servicos;

import Entidades.Produto;
import Estrategias.DescontoStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    // Definir a estratégia de desconto
    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    // Adicionar produto ao carrinho
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Calcular o total com desconto aplicado
    public double calcularTotalComDesconto() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += descontoStrategy.calcularDesconto(produto.getPrecoBase());
        }
        return total;
    }
}