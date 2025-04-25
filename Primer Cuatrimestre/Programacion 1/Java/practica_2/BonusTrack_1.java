public class BonusTrack_1 {
  public static void main(String[] args) {
    int opcion = -1;
    int pacientes = 0, pacientesMayores = 0, edad = 0;

    System.out.println("--> Inicio del programa  <--");

    System.out.println("Ingrese la opcion");
    opcion = Utils.leerInt();
    while (opcion != 0) {
      if (opcion == 1) {
        pacientes = 15;
        for (int i = 1; i <= pacientes; i++) {
          System.out.println("ingrese edad del paciente " + i);
          edad = Utils.leerInt();
          if (edad > 78) {
            pacientesMayores += 1;
          }

        }
        System.out.println("Los pacientes mayores a 78 son: " + pacientesMayores);
      } 
      else if(opcion == 2){}
      else if(opcion == 3){}
      else if(opcion == 4){}
      else {
        System.out.println("error");
      }
      opcion = Utils.leerInt();
    }

    System.out.println("--> Fin del programa <--");
  }
}
