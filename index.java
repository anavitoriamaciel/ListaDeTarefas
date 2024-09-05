package GerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        //criando lista para armazenar as tarefas
        List<String> tarefas = new ArrayList<>();
        int opcao = 0;
        int i = 0;

        //scanner para ler entrada do usuario
        Scanner entrada = new Scanner(System.in);

        //loop para exibir menu de opcoes e processar opcao
        while (true) {
            System.out.print(" 1 - Adicionar tarefa \n 2 - Marcar tarefa como concluída \n 3 - Visualizar tarefas pendentes \n 4 - Sair da lista \n Selecione uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();// limpar buffer do scanner

            //case para opcao selecionada
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = entrada.nextLine();
                    tarefas.add(tarefa); //adicionando tarefa na lista
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.print("Digite o numero da tarefa que deseja marcar como concluida: ");
                    int indice = entrada.nextInt();
                    entrada.nextLine(); // limpar buffer do scanner
                    if (indice > 0 && indice <= tarefas.size()) { //verificando se o indice informado é valido
                        tarefas.set(indice - 1, tarefas.get(indice - 1) + "(Concluida!)"); //marcando tarefa com concluida
                    } else {
                        System.out.println("Indice Invalido!");
                    }
                    break;
                case 3:
                    System.out.println("Tarefas: ");
                    for (i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + "-" + tarefas.get(i)); //exibindo tarefas adicionadas
                    }
                    break;
                case 4:
                    System.out.println("Lista Finalizada!");
                    entrada.close();
                    return; //usando para encerrar o metodo, nesse caso o metodo main
                default:
                    System.out.println("Opção Invalida!");

            }


        }


    }
}
