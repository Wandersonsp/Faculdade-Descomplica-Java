// Atividade 15 -Java
// Disciplina: Criação de aplicações e sistemas
// Professora: Lucy Mari
// Descrição: Algoritimo para atividade 14
// Autor(a): Wanderson Pereira
// Data atual: 28/5/2022

import javax.swing.*;


class JavaAula_15 {
    public static void main(String[] args) throws Exception {

    //Declaração de Variáveis
    int num1, num2, aux=1;
    String msg = "";
    char opc=0;
    

    //Entrada de dados
     opc = (JOptionPane.showInputDialog("Digite 1 para produto \n Digite 2 para produtoria \n")).charAt(0);
     num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número"));
     num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o outro Número"));
     
         
    //Processamento de Dados
    switch (opc) 
        {
            case '1':
            {
              if (num1>0 && num2>0)
              aux = num1 * num2;
              msg = msg + "O Produto de " +num1+ " por " +num2+ " é " +aux+ "\n";  
            }
           
           break;
        

        
            case '2':
            {
              for (int i=1; i<=num2; i=i++)
              {
               aux = aux * num1;
               
              }
            msg = msg + "A Produtoria de " + num1 + " , " + num2 + " vezes é " + aux + "\n\n";  
                
            }
           
           break;
        

       default:JOptionPane.showMessageDialog(null, "Opção Invalida, calculos não realizados");
           break;

        }
            
    //Saida de Resultados

    if (opc >='1' && opc <= '3' )
    {
     JOptionPane.showMessageDialog(null, msg);    
    }
     
    }
}