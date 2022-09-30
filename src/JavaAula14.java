// Atividade 14 -Java
// Disciplina: Criação de aplicações e sistemas
// Professora: Lucy Mari
// Descrição: Algoritimo para atividade 14
// Autor(a): Wanderson Pereira
// Data atual: 28/5/2022

import javax.swing.*;


class JavaAula_14 {
    public static void main(String[] args) throws Exception {

    //Declaração de Variáveis
    int num1, num2, div;
    String msg = "";
    double pot;

    //Entrada de dados
    JOptionPane.showMessageDialog(null,"Operações de Divisão e potência");
     num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número"));
     num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o outro Número"));
    
    //Processamento de Dados
    div = num1/num2;
    pot = Math.pow(num1, num2);
    
    //Saida de Resultados
    msg = msg + "O resultado da divisão de: " +num1+ " por " +num2+ " é " +div+ "\n";
    msg = msg + "O resultado da potência de: " +num1+ " por " +num2+ " é " +pot+ "\n";
    JOptionPane.showMessageDialog(null, msg); 
    }
}