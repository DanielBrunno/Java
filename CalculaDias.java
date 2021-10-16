/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praticadejava;

/**
 *
 * @author Daniel Bruno
 */
public class CalculaDias {
    
    //Code your here
    public static void main(String[] args) {
        
        //INSTANCIA PARA UTILIZAR O METODO - ESSAS DUAS LINHA É QUE VOCÊ COLOCA EM SEU MÉTODO
        CalculaDias dias = new CalculaDias();
        int numDias = dias.Data(28,2,2000,1,3,2008); //ENTRADA DA DATA
                
        
        System.out.println("\n Numero de dias: "+numDias+".\n"); //ESSA AQUI FOI SÓ PARA TESTAR
    
    }    
    
    //AQUI É O MÉTODO A SER UTILIZADO
    public int Data (int dia1,int mes1,int ano1,int dia2,int mes2,int ano2){    
    
        int mes []= {31,0,31,30,31,30,31,31,30,31,30,31};
        int dias = 0, meses = 0, anos = 0;  
        String temp = Integer.toString(ano1);
        
        if(temp.charAt(temp.length() - 1) == '0' && temp.charAt(temp.length() - 2) == '0') {             
            if(ano1 % 400 == 0) mes[1] = 29;
            else mes[1] = 28;
        }else if(ano1 % 4 == 0) mes[1] = 29;
        else mes[1] = 28;
        anos = ano2 - ano1;
        if(mes2 > mes1 || mes1 == mes2) meses = mes2 - mes1;
        else {
            meses = 12 - (mes1 - mes2);
            anos -= 1;
        }
        if(dia2 > dia1 || dia1 == dia2) dias = dia2 - dia1;
        else {
            dias = (mes[mes1 - 1] - dia1) + dia2;
            meses -= 1;
        }
    return dias;
    }
}
