package Estrategias;

public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        // Sem desconto para novos clientes
        return preco;
    }
}
