package br.senai.model;

public class ItensDoPedido {
    //Atributos
    private int quantidade;
    private Produto produto;

    //Métodos

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public void setItemDoPedido(String nome, double preco, int quantidade ) {
        this.produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);

        this.quantidade = quantidade;
    }




    //toostring
    @Override
    public String toString() {
        return "ItensDoPedido{" +
                "quantidade=" + quantidade +
                '}';
    }

    public void imprimir(){
        System.out.println("Produto: "+produto +
                "\nQuantidade: "+quantidade+"\n");

    }

}
