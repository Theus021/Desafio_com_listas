import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compra;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compra = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compra.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;

    }

    public List<Compra> getCompra() {
        return compra;
    }

}
