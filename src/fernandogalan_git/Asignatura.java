/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernandogalan_git;

/**
 *
 * @author Fernando
 */
public class Asignatura {
    
    private boolean aprobada = false;

    public boolean isAprobada() {
        return aprobada;
    }

    public void calificar(float nota){
        aprobada = nota >= 5;
    }
}
