package pkgFuncionalidad;
/**
* La clase Suma hereda de la clase abstracta Calculadora, la cual obliga a implementar a
calcular
*/
public class Suma extends Calculadora {
/**
* Default constructor
*/
public Suma() {
}
/**
* El método calcular mediante el @Override permite sobreescribir el comportamiento
del método calcular de la clase padre –que no hace nada--
*/
@Override
public int calcular(int num1, int num2){
return num1+num2;
}
}