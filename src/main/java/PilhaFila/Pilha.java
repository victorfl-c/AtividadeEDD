package PilhaFila;

import java.util.Scanner;
public class Pilha {
    private String vPilha[];
    int topo;
    
    public Pilha(){
        vPilha = new String[5];
        topo = -1;
    }
    public void empilhar(){
        Scanner scan = new Scanner(System.in);
        if(isFull()){
            throw new RuntimeException("Pilha cheia!");
        }
        System.out.println("Informe o valor que deseja empilhar: ");
        String valor = scan.nextLine();
        topo++;
        vPilha[topo] = valor;
    }
    public String desempilhar(){
        if(isEmpty()){
            throw new RuntimeException("Pilha Vazia!");
        }
        String elemento;
        elemento = vPilha[topo];
        vPilha[topo] = null;
        topo--;
        return elemento;
    }
    public void listar(){
        System.out.println("####LISTA DE ELEMENTOS###");
        for(int i = 0; i < vPilha.length; i++){
            if(vPilha[i] == null){
                return;
            }
            System.out.println("Posicao "+i+" = "+vPilha[i]);
        }
        System.out.println("###FIM DA LISTA###");
    }
    public boolean isEmpty(){
        return (topo == -1);
    }
    public boolean isFull(){
        return(topo == vPilha.length-1);
    }
    public String top(){
        if(isEmpty()){
            throw new RuntimeException("Empty Stack");
        }
        return vPilha[topo];
    }
    
}

