/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilhadinamica;
import java.util.Scanner;

/**
 *
 * @author yan-l
 */
public class PilhaDinamica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a expressão a ser verificada: ");
        String expressao = scanner.nextLine();

        if (VerificadorExpressao.verificaParametrizacao(expressao)) {
            System.out.println("Expressão correta!");
        } else {
            System.out.println("Expressão incorreta!");
        }
    }
}