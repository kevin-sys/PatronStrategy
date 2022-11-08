/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author pc
 */
public class Contexto {

    private BonificacionStrategy bonificacionStrategy;

    public Contexto(BonificacionStrategy bonificacionStrategy) {
        this.bonificacionStrategy = bonificacionStrategy;
    }

    public double EjecutarStrategy(double salario) {
        return bonificacionStrategy.AplicarBonificacion(salario);
    }
}
