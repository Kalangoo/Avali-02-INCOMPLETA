package br.senai.model;

import java.util.ArrayList;

public class Pedido {
    //atributos
    private String descricao;
    private String data;
    private double total;
    private ArrayList<ItensDoPedido> itensDoPedidos;
    
    public Pedido(){
        itensDoPedidos = new ArrayList<>();
    }
    

    //Métodos
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setItensDoPedido(String nome, double preco, int quantidade){
        ItensDoPedido item = new ItensDoPedido();
        item.setItemDoPedido(nome, preco, quantidade);


        this.total = preco * quantidade;
        itensDoPedidos.add(item);
    }
    //TooString
    @Override
    public String toString() {
        return "Pedido: " +
                "Descrição=" + descricao + '\'' +
                ", Data=" + data + '\'' +
                ", total=" + total ;
    }



}
