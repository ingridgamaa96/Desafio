/**
 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes
 * entre si, bem como as das mulheres). Calcule e escreva a soma das idades
 * do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
 *
 */

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("qual idade do primeiro homem : ");
        int idadeHomem1 = scanner.nextInt();

        System.out.print("qual idade do segundo homem : ");
        int idadeHomem2 = scanner.nextInt();

        System.out.print("qual idade da primeira mulher : ");
        int idadeMulher1 = scanner.nextInt();

        System.out.print("qual idade da primeira mulher : ");
        int idadeMulher2 = scanner.nextInt();

        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
        int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

        int soma = homemMaisVelho + mulherMaisNova;
        int resultadeIdades = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma das idades do homem mais velhos com a mulher mais nova é : " + soma);
        System.out.println("Soma  das idades do homem mais novo com a mulher mais velha é : " + resultadeIdades);
    }
}
