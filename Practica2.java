/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

/**
 *
 * @author alumne
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static String juntaSaltejats(int num, String... cadenas){
        String resultado="";
        int num1=0;
 
        if(num<1){
            resultado="0";
            
        }else{
            if(cadenas==null){
                resultado="0";
            }else{
                for(int i=0; i<cadenas.length; i=i+num){
                    num1+=cadenas[i].length();
                    resultado+=cadenas[i]+" ";
                    
                }   
                resultado=num1+":"+resultado;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(juntaSaltejats(-25));
        System.out.println(juntaSaltejats(3));
        System.out.println(juntaSaltejats(0, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(1, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(2, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(3, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(4, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(5, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(6, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(7, "La","teua","resposta","no","és","la","correcta"));
        System.out.println(juntaSaltejats(8, "La","teua","resposta","no","és","la","correcta"));    
        
    }
    
    
}
