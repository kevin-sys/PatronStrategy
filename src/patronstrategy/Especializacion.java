/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author pc
 */
public class Especializacion implements BonificacionStrategy{
    @Override
    public double AplicarBonificacion(double salario) {
        return salario * 0.10d;
    }
}
