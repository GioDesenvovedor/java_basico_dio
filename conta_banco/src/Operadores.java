public class Operadores {
   

    public static void main(String[] args) {
        //String nome = "João " + "Silva";


        

         int x = 5; 
          x ++; // Agora, x vale 6.
        System.out.println(" o resultado é " + x);

        int y = 5; 
        y--; // Agora, y vale 4.
        System.out.println(" o resultado é " + y);

        int z = 10; 
        int negZ = -z; // Agora, negZ vale -10.
        System.out.println(" o resultado é " + negZ);

        int a = 5;
        int b = ~a; // Agora, b é igual a -6 (em notação de complemento de dois).
        System.out.println(" o resultado é " + b);

        //operador tenario (?)
        //O operador ternário em Java é uma forma concisa 
        //de expressar uma condição if-else em uma única linha de código
        int idade = 18;
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(" o resultado é " + status);


    }

}
