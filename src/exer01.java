import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1Crie IfSimples.java e declare int temperatura = 35;
        //2Escreva um if que imprime "Dia quente!" se a temperatura for maior que 30
        //3Adicione um else que imprime "Temperatura agradável."
        //4Troque o valor para 22 e execute novamente — confirme que o else é executado
        //5Experimente temperatura == 30 — observe que 30 não é maior que 30, cai no else


        System.out.println("Informe a temperatura em graus Celcius:  ");
        int temperatura = sc.nextInt();

        if (temperatura > 30)
        {
            System.out.println("Dia Quente!");
        }else
        {
            System.out.println("Temperatura Agradável.");
        }



        sc.close();
    }
}
