/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao;

/**
 *
 * @author alunos
 */
public class Conversao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String st, st2;
        float real, real2;
        int int1, int2;
        
        st = "12";
        real = (float) (new Float(st).floatValue());
        System.out.println("String para real" + real);
        
        real2 = 10;
        st2 = new Float (real2).toString();
        System.out.println("Real para string" + real);
        
        st2 = "13";
        produto.int1= Integer.parseInt(st2);
        System.out.println("String para inteiro" + produto.int1);
        
        produto.int2 = 5;
        st2 = Integer.toString(produto.int2);
        System.out.println("Inteiro para String" + st2);
        
 
    }
    
}
