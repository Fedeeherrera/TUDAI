public class App {
  public static void main(String[] args) { 
    // Declaracion de variables
    int negOrPos = 0, grandeoChico = 0, diaDeSemana = 0, numero1 = 0, numero2 = 0, numero3 = 0;
    String letra = "";
    System.out.println("Incio del programa");
    /*
     * POSITIVO O NEGATIVO
     * System.out.println("Ingrese un numero para saber si es positivio o negativo"
     * );
     * negOrPos = Utils.leerInt();
     * if(negOrPos > 0 ) {
     * System.out.println("El numero es positivo");
     * } else if (negOrPos < 0) {
     * System.out.println("El numero es negativo");
     * } else {
     * System.out.println("El numero es 0");
     * }
     */

    /*
     * MAYOR O MENOR A 100
     * System.out.println("Ingrese un numero para saber si es mayor o menor");
     * grandeoChico = Utils.leerInt();
     * if (grandeoChico > 100) {
     * System.out.println("El numero es grande");
     * } else if (grandeoChico < 100) {
     * System.out.println("El numero es chico");
     * } else {
     * System.out.println("El numero es 100");
     * }
     */

    /*
     * Dia de la semana
     * System.out.println("Ingrese un numero del 1 al 7");
     * diaDeSemana = Utils.leerInt();
     * switch (diaDeSemana) {
     * case 1:
     * System.out.println("El dia es Lunes");
     * break;
     * case 2:
     * System.out.println("El dia es Martes");
     * break;
     * case 3:
     * System.out.println("El dia es Miercoles");
     * break;
     * case 4:
     * System.out.println("El dia es Jueves");
     * break;
     * case 5:
     * System.out.println("El dia es Viernes");
     * break;
     * case 6:
     * System.out.println("El dia es Sabado");
     * break;
     * case 7:
     * System.out.println("El dia es Domingo");
     * break;
     * default:
     * System.out.println("El numero ingresado no es valido");
     * }
     */

    /*Creciente o Decreciente */    

    System.out.println("Ingrese el numero 1");
    numero1 = Utils.leerInt();
    System.out.println("Ingrese el numero 2");
    numero2 = Utils.leerInt();
    System.out.println("Ingrese el numero 3");
    numero3 = Utils.leerInt();

    if(numero1 < numero2 & numero2 < numero3 & numero1 < numero3) {
      System.out.println("Es creciente");
    } else if(numero1 > numero2 & numero2 > numero3 & numero1 > numero3) {
      System.out.println("Es decreciente");
    } else {
      System.out.println("Error");
    }

    System.out.println("Fin del programa");
  }
}
