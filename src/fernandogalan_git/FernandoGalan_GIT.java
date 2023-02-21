/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fernandogalan_git;

/**
 *
 * @author Fernando
 */
public class FernandoGalan_GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Asignatura EntornosDesarrollo = new Asignatura();
       
       EntornosDesarrollo.calificar(5);
       
        System.out.println("Entornos de desarrollo está: " +
                (EntornosDesarrollo.isAprobada()?"Aprobado":"Suspenso"));
    }
    
}
