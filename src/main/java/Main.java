import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //System.out.println("Entre com um número inteiro: ");
   // int inteiro = sc.nextInt();
    //System.out.println("O número digitado foi: ");
   // System.out.println(inteiro);
   // sc.close();

    //System.out.println("Entre com um número racional: ");
    //double racional = sc.nextDouble();
    //System.out.println("O número digitado foi: ");
    //System.out.println(racional);
    //sc.close();

    System.out.println("Entre com o nome do seu futuro filho(a): ");
    String filho = sc.nextString();
    System.out.println("O nome digitado foi: ");
    System.out.println(filho);
    sc.close();
  }
}