package semana03;

import java.util.Scanner;

public class Introducao {
 public static void main (String[] args) {
    // Comentário de linha

    /*
     * Comentários de múltiplas linhas
     */

    // Tipos Primitivos
    
    // Inteiros
    // byte, short, int, long

    byte n1 = 100; // 1 byte -128 a 127
    short n2 = 3000; // 2 ´byte -32768 a 32767
    int n3 = 4000000; // 4 byte 2 bilhoes
    long n4 = 323232323232L; // 8 bytes

    // Ponto flutuante
    // float, double
    float nota1 = 9.5f; // 4 bytes
    double nota2 = 9.5; // 8 bytes

    // char
    char letra = 'a';

    //boolean
    boolean ligado = true;
    boolean teste = false; 
    
    // String
    String palavra = "Olá mundo";
    System.out.println(palavra);
    System.out.println(palavra.toLowerCase());
    System.out.println(palavra.toUpperCase());

    // Variáveis e constantes
    // tipo nome = valor;
    // tipo nome;
    // nome = v´
 
    //Entrada e saída de dados
    // Instancia um objeto scanner para receber dados do usúario
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com seu nome");
    String nomeInformado = sc.nextLine();
    
    System.out.println("Entre com a sua idade");
    short idadeInformada = sc.nextShort();

    System.out.println(nomeInformado + "" + idadeInformada);
    //Fecha o objeto Scanner liberado
    // os recursos alocados
    sc.close();

    }
}
