/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprop;

/**
 *
 * @author adri
 */
public class Cami {
    String cami;
    String Descripcio;
    
    public Cami(){
        this.cami=null;
        this.Descripcio=null;
    }

    public Cami(String cami, String Descripcio) {
        this.cami = cami;
        this.Descripcio = Descripcio;
    }

    public void setCami(String cami) {
        this.cami = cami;
    }

    public void setDescripcio(String Descripcio) {
        this.Descripcio = Descripcio;
    }

    public String getCami() {
        return cami;
    }

    public String getDescripcio() {
        return Descripcio;
    }
    
    public Boolean es_concatenable(String cami){
        char aux1[]=cami.toCharArray();
        char aux2[]=this.cami.toCharArray();        
        return aux2[aux2.length-1]==aux1[0];
    }
    
    public void concatenar(String cami){
        
    }
    
    public void invertir(){
        char[] aux=cami.toCharArray();
        int end=cami.length()-1;
        int begin=0;
        char temp;
        while(end>begin){
            temp=aux[begin];
            aux[begin]=aux[end];
            aux[end]=temp;
            end--;
            begin++;
        }
        cami=new String(aux);   
        
    }
    
    public Integer get_longitud(){
        return cami.length();
    }
    
}
