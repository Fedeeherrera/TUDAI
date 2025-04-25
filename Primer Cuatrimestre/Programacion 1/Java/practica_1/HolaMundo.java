public class HolaMundo {
  public static void main(String[] args) {
    int entero = 20;
    boolean vof = true;
    char character = 's';
    double elDoble = 1515151;
    System.out.println("Hello Worldd!");
    System.out.println("El numero entero a mostrar es: ' " + entero);
    System.out.println("El booleano a mostrar es: "  + vof);
    System.out.println("El caracter a mostrar es: "  + character);
    System.out.println("El Double a mostrar es: "  + elDoble);
  }
}



/*
 Ejercicio 2 
 public class HolaMundo {
  public static void main(String[] args) {
    double elDouble = 15156;
    final double ElDouble = 1.0;
    
    System.out.println("elDouble es " + elDouble);
    System.out.println("ElDouble en constante es: " + ElDouble);
  }
}
*/

/* Ejercicio 3 
public class HolaMundo {
  public static void main(String[] args) {
    System.out.println("Ingrese un numero");
    final int numero = Utils.leerInt();
    System.out.println("El numero ingresado es: " + numero);
  }
}
*/

/* Ejercicio 4  
public class HolaMundo {
  public static void main(String[] args) {
    System.out.println("Ingrese el primer numero");
    final int numero1 = Utils.leerInt();
    System.out.println("Ingrese el Segundo numero");
    final int numero2 = Utils.leerInt();
    System.out.println("Ingrese el Tercer numero");
    final int numero3 = Utils.leerInt();
    System.out.println("Ingrese el Cuarto numero");
    final int numero4 = Utils.leerInt();
    System.out.println("Ingrese el Quinto numero");
    final int numero5 = Utils.leerInt();
    System.out.println("Los numeros ingresados son: " + numero5 + "\n" + numero4 + "\n" + numero3 + "\n" + numero2 + "\n" + numero1);
  }
}
*/

/* Ejercicio 5  
public class HolaMundo {
  public static void main(String[] args) {
    System.out.println("Ingrese Nombre");
    final String nombre = Utils.leerString();
    System.out.println("Ingrese Edad");
    final int edad = Utils.leerInt();
    System.out.println("Ingrese Altura");
    final int altura = Utils.leerInt();
    System.out.println("Ingrese Ocupacion");
    final String ocupacion = Utils.leerString();
    System.out.println("El nombre es " + nombre);
    System.out.println("La edad es " + edad);
    System.out.println("La altura es " + altura);
    System.out.println("La ocupacion es " + ocupacion);
  }
}
*/

/* Ejercicio 7 
public class HolaMundo {
  public static void main(String[] args) {
    int numero1 = 0, numero2 = 0, numero3 = 0, resultado = 0;
    System.out.println("Ingrese Numero 1");
    numero1 = Utils.leerInt();
    System.out.println("Ingrese Numero 2");
    numero2 = Utils.leerInt();
    System.out.println("Ingrese Numero 3");
    numero3 = Utils.leerInt();
    //Sin variable auxiliar
    System.out.println("El resultado de la suma es: " + (numero1 + numero2 + numero3));
    //Con variable auxiliar
    resultado = numero1 + numero2 + numero3;
    System.out.println("El valor de resultado1 es: " + resultado);
  }
}
*/

/* Ejercicio 8 
public class HolaMundo {
  public static void main(String[] args) {
    System.out.println("El valor de la tabla de OR es: \n");
    System.out.println("El valor de FALSE OR FALSE es: " + (false || false));
    System.out.println("El valor de FALSE OR TRUE es: " + (false || true));
    System.out.println("El valor de TRUE OR FALSE es: " + (true || false));
    System.out.println("El valor de TRUE OR FALSE es: " + (true || true));

    System.out.println("\n El valor de la tabla de AND es: \n");
    System.out.println("El valor de FALSE AND FALSE es: " + (false && false));
    System.out.println("El valor de FALSE AND TRUE es: " + (false && true));
    System.out.println("El valor de TRUE AND FALSE es: " + (true && false));
    System.out.println("El valor de TRUE AND FALSE es: " + (true && true));

  }
}

*/

/* Ejercicio 9 
public class HolaMundo {
  public static void main(String[] args) {
    int numeroUsario = 0, cociente2 = 0, cociente3 = 0, cociente4 = 0;
    System.out.println("Ingrese un numero");
    numeroUsario = Utils.leerInt();

    System.out.println("cociente de 2");
    cociente2 = numeroUsario % 2;
    System.out.println("El cociente de " + numeroUsario + " % " + "2 " + "es: " + cociente2);

    
    System.out.println("cociente de 3");
    cociente3 = numeroUsario % 3;
    System.out.println("El cociente de " + numeroUsario + " % " + "3 " + "es: " + cociente3);

    
    System.out.println("cociente de 4");
    cociente4 = numeroUsario % 4;
    System.out.println("El cociente de " + numeroUsario + " % " + "4 " + "es: " + cociente4);
  }
}
*/


/* Ejercicio 10 
public class HolaMundo {
  public static void main(String[] args) {
    
  }
}
*/