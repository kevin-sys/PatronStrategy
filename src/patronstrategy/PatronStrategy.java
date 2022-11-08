/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author pc
 */
public class PatronStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BonificacionStrategy bonificacionStrategy = ObtenerStrategy(1000000d);
        Contexto contexto = new Contexto(bonificacionStrategy);
        System.out.println("BONIFICACIÓN DE ESPECIALIZACIÓN ES DE 0.10 SMMLV = " + contexto.EjecutarStrategy(1000000d));

        bonificacionStrategy = ObtenerStrategy(10000000d);
        contexto = new Contexto(bonificacionStrategy);
        System.out.println("BONIFICACIÓN DE MAESTRIA ES DE 0.45 SMMLV = " + contexto.EjecutarStrategy(10000000d));
    }

    private static BonificacionStrategy ObtenerStrategy(double salario) {
        BonificacionStrategy strategy = null;
        if (salario >= 1000000 && salario <= 4999999) {
            strategy = new Especializacion();
        }
        if (salario >= 5000000 && salario <= 10000000) {
            strategy = new Maestria();
        }
        return strategy;
    }
}
