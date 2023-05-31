import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(WelcomeMessage.message);
        Scanner leitura = new Scanner(System.in);
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while (sair != 0) {
            System.out.println("Digite o nome do produto que deseja adquirir: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();


            Compra compra = new Compra(valor, descricao);

            boolean compraRealizada = cartao.lancaCompra(compra);
            if (compraRealizada){
                System.out.println("Compra realizada com sucesso !");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            }
            else{
                System.out.println("Limite insuficiencite !");
                sair = 0;
            }
        }
        System.out.println("*** Compras realizadas ***");
        Collections.sort(cartao.getCompra());
        for (Compra c : cartao.getCompra()){
            System.out.println(c.getDescricao() + "-" + c.getValor());
        }
        System.out.println("**************************");
        System.out.println("Limite restante: " + cartao.getSaldo());
    }
}