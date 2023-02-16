public class Clase01 {

    public static void empleado(String nombre, String apaterno, String amaterno, int edad, char genero, float estatura){
        System.out.println(
                "El nombre del empleado es:" +nombre +" " +apaterno + " " + amaterno +
                        " Tiene:" +edad +"años, genero:"+ genero + ", su estatura es de:" +estatura
        );

        }

    public void registrarEmpleado(){
        empleado("Luis", "Garcia", "Roman", 23, 'H', 1.71f);
    }

}
