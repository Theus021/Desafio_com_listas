public class Compra implements Comparable<Compra> {
    private double valor;
    private String descricao;

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "compra: " + "limite= " + valor + ", descricao= " + descricao;
    }

    public Compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valor, outraCompra.valor);
    }


}
