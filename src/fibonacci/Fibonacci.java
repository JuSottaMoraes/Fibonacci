/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void pertenceFibonacci(int numero) {
        int a = 0;
        int b = 1;
        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(a);

        while (b <= numero) {
            sequencia.add(b);
            int c = a + b; // Próximo número da sequência
            a = b; // Atualiza a
            b = c; // Atualiza b
        }

        // Verifica se o número pertence à sequência
        if (sequencia.contains(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            System.out.print("Sequência até " + numero + ": ");
            for (int num : sequencia) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static void main(String[] args) {
        pertenceFibonacci(5);  // Saída: O número 5 pertence à sequência de Fibonacci.
        pertenceFibonacci(7);  // Saída: O número 7 não pertence à sequência de Fibonacci.
    }
}

 