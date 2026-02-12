public class DescontoSazonal implements EstrategiaDeDesconto {

    @Override
    public double calcular(Pedido pedido) {
        return pedido.getValorBruto() * 0.95;
    }
}
