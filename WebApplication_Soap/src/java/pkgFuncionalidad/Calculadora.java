package pkgFuncionalidad;
public abstract class Calculadora {
/**
* Default constructor
*/
public Calculadora() {
}
/**
* Método abstracto que obliga a todos los hijos de la clase calculadora a
implementarlos
*/
public abstract int calcular(int num1, int num2);//Al ser abstracto no hace nada
}