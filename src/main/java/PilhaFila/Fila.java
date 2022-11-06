package PilhaFila;
import java.util.Scanner;
public class Fila {
    
    private String[] vFila;
    private int primeiro;
    private int ultimo;
    private int total;
    
    public Fila(){
        vFila = new String[5];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }
    
    public void inserir(){
        Scanner scan = new Scanner(System.in);
        if(isFull()){
            throw new RuntimeException("Fila Cheia!");
        }
        System.out.println("Informe um valor: ");
        String elemento = scan.nextLine();
        vFila[ultimo] = elemento;
        ultimo = (ultimo + 1) % vFila.length;
        total++;
    }
    public String retirnar(){
        if(isEmpty()){
            throw new RuntimeException("Fila Vazia!");
        }
        /*String elemento = vFila[primeiro];
        primeiro = (primeiro + 1) % vFila.length;
        total--;
        return elemento;*/
        String removeElemento = vFila[0];

        this.total--;
        for (int i = 0; i < total; i++) {
            vFila[i] = vFila[i + 1];
            vFila[i + 1] = null;
        }
        return removeElemento;
        
    }
    public void listar(){
        System.out.println("####LISTA DE ELEMENTOS###");
        for(int i = 0; i < vFila.length; i++){
            if(vFila[i] == null){
                return;
            }
            System.out.println("Posicao "+i+" = "+vFila[i]);
        }
        System.out.println("###FIM DA LISTA###");
    }
    public boolean isFull(){
        return total == vFila.length;
    }
    public boolean isEmpty(){
        return total == 0;
    }
}
