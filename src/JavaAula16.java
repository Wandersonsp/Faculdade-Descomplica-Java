// Atividade 16 -Java
// Disciplina: Criação de aplicações e sistemas
// Professora: Lucy Mari
// Descrição: Algoritimo para atividade 16
// Autor(a): Wanderson Pereira
// Data atual: 28/5/2022

import javax.swing.*;

class JavaAula_16 {
    public static void soma (int vet[])
    {
        int som=0;
        for (int i = 0; i<vet.length; i++)
        {
           som = som + vet[i];
        }
        JOptionPane.showMessageDialog(null,"O Resultado da soma é:" + som );
    }

    public static int produto (int vet[])
    {
        int prod=1;
        for (int i = 0; i<vet.length; i++)
        {
         prod = prod * vet[i];
        }
        return prod;
    }    
       
        public static void main(String[] args) throws Exception {
    
        //Declaração de Variáveis
        
        int som = 0,vetor[]=(10,20,15,5,12);
        int res; 
         
        
        //Processamento de Dados

        soma(vetor);
        res = produto(vetor);
        JOptionPane.showMessageDialog(null,"O Resultado da multiplicação é:" + res );
;    }
}
