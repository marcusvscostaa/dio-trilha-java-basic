import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuários 
        //Obter pela scanner os valores digitados no teminal

        System.out.println("Digite seu nome: ");
        String nomeCliente =  scanner.next();
        
        System.out.println("Digite o número da agência: ");
        String agencia =  scanner.next();
        
        System.out.println("Digite número da conta: ");
        int numero =  Integer.parseInt(scanner.next());

        System.out.println("Digite o saldo da conta: ");
        float saldo =  Float.valueOf(scanner.next());


        //Exibir mensagem

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
