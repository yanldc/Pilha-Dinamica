/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadinamica;
import java.util.Deque;
import java.util.LinkedList;
/**
 *
 * @author yan-l
 */
public class VerificadorExpressao {

    public static boolean verificaParametrizacao(String expressao) {
        Deque<Character> pilha = new LinkedList<>();

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if ((caractere == ')' && topo != '(') ||
                    (caractere == ']' && topo != '[') ||
                    (caractere == '}' && topo != '{')) {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }
}