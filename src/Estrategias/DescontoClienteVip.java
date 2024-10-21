package Estrategias;

public class DescontoClienteVip implements DescontoStrategy{
    @Override
    public double calcularDesconto (double preco){
        return preco * 0.80;
    }
}
