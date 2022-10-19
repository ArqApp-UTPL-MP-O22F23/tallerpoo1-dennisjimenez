/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomplejos;

/**
 *
 * @author Usuario iTC
 */
public class Operaciones implements OperacionesInterface {

    Complejos numero1 = new Complejos();
    Complejos numero2 = new Complejos();
    Complejos resultado = new Complejos();

    Operaciones(Complejos num1, Complejos num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    @Override
    public void Sumar() {
        resultado.setReal(numero1.getReal() + numero1.getReal());
        resultado.setImagnaria(numero1.getImagnaria() + numero2.getImagnaria());
    }

    @Override
    public void Restar() {
        resultado.setReal(numero1.getReal() - numero2.getReal());
        resultado.setImagnaria(numero1.getImagnaria() - numero2.getImagnaria());
    }

    @Override
    public void Imprimir() {
        System.out.print("el valor es " + resultado.getReal() + "+" + resultado.getImagnaria() + "i3");
    }
}
