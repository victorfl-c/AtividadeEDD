package PilhaFila;
import java.util.Scanner;
public class AtividadeEDD {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        int opc = 0;
        while (opc != 7){
            System.out.println("#### PILHA ####");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Listar Pilha");
            System.out.println("#### FILA ####");
            System.out.println("4 - Incluir Fila");
            System.out.println("5 - Remover Fila");
            System.out.println("6 - Listar Fila");
            System.out.println("##############");
            System.out.println("7 - Sair");
            System.out.println("");
            System.out.print("Informe a opcao desejada: ");
            opc = ler.nextInt();
            switch (opc) {
                case 1:
                    //EMPILHAR
                    pilha.empilhar();
                    break;
                case 2:
                    //DESEMPILHAR
                    pilha.desempilhar();
                    break;
                case 3:
                    //LISTAR PILHA
                    pilha.listar();
                    break;
                case 4:
                    //INCLUIR FILA
                    fila.inserir();
                    break;
                case 5:
                    //EXCLUIR FILA
                    fila.retirnar();
                    break;
                case 6:
                    //LISTAR FILA
                    fila.listar();
                            
                    break;
                case 7:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            } 
        }
    }  
}