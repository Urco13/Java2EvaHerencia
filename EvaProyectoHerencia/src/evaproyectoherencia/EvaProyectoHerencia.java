/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaproyectoherencia;

import otropaquete.OtraHija;

/**
 *
 * @author dam115
 */
public class EvaProyectoHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ClaseMadre pri= new ClaseMadre();
    pri.datoDefault="Dato default";
    pri.datoProtected="Dato protected";
    
    ClaseHija unaHija=new ClaseHija();
    unaHija.dato="Dato claseHija";
    unaHija.datoDefault="Dato default";
    unaHija.datoProtected="Dato protected";
    
        //Al ser una clase hija fuera del paquete de la clase madre solo
        //se pueden ver los datos protected y el dato publico.
        //el dato por default no se puede ver por que la clase main se encuentra
        //en otro paquete al que se encuentra otra hija
        OtraHija otroPaquete=new OtraHija();
        otroPaquete.datoProtected="Dato protegido";
        otroPaquete.datoPublico="Dato publico";
        
        
    }//fin main
    
}
