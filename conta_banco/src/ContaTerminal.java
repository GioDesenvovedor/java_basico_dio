import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args)  {
       
     
   
      
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

   
      
     
        // Solicita e armazena o nome cliente
        System.out.println("Por favor, digite o seu nome !");
       String nomecliente = scanner.next();
      
     
        // Solicita e armazena o nome cliente
        System.out.println("Por favor, digite o seu nome !");
       String sobrenome = scanner.next();
       
        // Solicita e armazena o número da agência
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        
        // Solicita e armazena o número da conta
        System.out.println("Por favor, digite o número da Conta !");
        Integer numero_conta = scanner.nextInt();
        scanner.nextLine(); 

        
       
        System.out.println("Por favor, digite o seu Saldo !");
        double saldo = scanner.nextDouble();

       String menssagem = printInput(nomecliente, sobrenome, agencia, numero_conta, saldo);

       System.out.println(menssagem);
       scanner.close();
     

      
    }
    public static String printInput(String nomeCliente, String sobrenome,String agencia, Integer numeroConta, Double saldo) {
        // Formata a mensagem com as informações inseridas
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                             nomeCliente, sobrenome, agencia, numeroConta, saldo);
    
                             
    } 


    
}
