package br.com.fiap.mercado.view;

public class Main {
    public static void main(String[] args) {
        FintechDAO conn = new FintechDAO();
        conn.insert("TABLE1",  "2", "mcdonalds", "alexandre", "hg");
        conn.insert("TABLE1",  "3", "AAAAAAAAA", "alexandre", "hg");
        conn.insert("TABLE1",  "2", "bbbbbbbbbbbb", "alexandre", "hg");
        conn.getAll("TABLE1");
        conn.desconectar();
        
    }
}