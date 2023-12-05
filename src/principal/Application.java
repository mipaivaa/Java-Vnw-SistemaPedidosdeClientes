package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	   
public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Nome do cliente: ");
			String nomeCliente = sc.nextLine();
			System.out.println("cpf do cliente: ");
			String cpf = sc.nextLine();
			System.out.println("Produto do pedido: ");
            String produto = sc.nextLine();
            System.out.println("Quantidade do pedido: ");
            int quantidade = sc.nextInt();
            System.out.println("Valor: ");
            double valor = sc.nextDouble();
            sc.nextLine(); 
            Pedido pedido = new Pedido(produto, quantidade, valor);
            clientes.add(new Cliente(nomeCliente, cpf, pedido));
        }
		
		for (Cliente cliente : clientes) {   //for-each
		    System.out.println("Cliente - Nome: " + cliente.nome);
		    System.out.println("PEDIDO:");
		    System.out.println("Produto: " + cliente.pedido.produto +
		            ", Quantidade: " + cliente.pedido.quantidade + ", Valor Unitário: " + cliente.pedido.valor +
		            ", Valor Total: " + cliente.pedido.calcularValorTotal());
		    System.out.println("*************************************************************************");
		}
		sc.close();
		 
	}

}


//Desafio Individual
//Pedidos
//O programa tem a finalidade
//de cadastrar pedidos feitos por alguns clientes.

//Obrigações
//Todos os dados devem ser inseridos pelo console
//Deve ser armazenado um pedido para cada cliente
//Ao final, precisam ser listadas todos os 
//usuários com os seus pedidos
//Sugestões
//Adicionar um método que calcule o 
//valor total baseada na quantidade de produtos