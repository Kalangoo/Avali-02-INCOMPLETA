package br.senai;


import br.senai.model.ItensDoPedido;
import br.senai.model.Pedido;
import br.senai.model.Produto;

public class Main {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido();
        pedido01.setItensDoPedido("Mouse", 300, 1);
        pedido01.setItensDoPedido("Teclado", 600, 1);
        pedido01.setData("27/03");

        System.out.println(pedido01);


        Pedido pedido02 = new Pedido();

       pedido02.setItensDoPedido("Camisa", 150, 2);

        System.out.println(pedido02);



    }
}
