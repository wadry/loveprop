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
public class Consulta {
    Node origen;
    Cami cami;
    Resultado resultado;

    public Consulta(Node origen, Cami cami) {
        this.origen = origen;
        this.cami = cami;
    }

    public Consulta() {
    }

    public void setOrigen(Node origen) {
        this.origen = origen;
    }

    public void setCami(Cami cami) {
        this.cami = cami;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Node getOrigen() {
        return origen;
    }

    public Cami getCami() {
        return cami;
    }

    public Resultado getResultado() {
        return resultado;
    }
    
    
}
