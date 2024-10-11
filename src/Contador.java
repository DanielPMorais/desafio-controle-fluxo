import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    	public static void main(String[] args) {
            
            try {
            Scanner terminal = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);            
            terminal.close();
            }
            catch(InputMismatchException e){
                System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
            }
            catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		
		//realizar o for para imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
}
