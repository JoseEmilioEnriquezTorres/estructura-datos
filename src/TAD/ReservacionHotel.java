package TAD;

public class ReservacionHotel {
    private String nombreHuesped;
    private int numeroNoches;
    private int precioNoche;
    private String estadoReservacion;


    public ReservacionHotel(String nombreHuesped, int numeroNoches, int precioNoche, String estadoReservacion) {
        this.nombreHuesped = nombreHuesped;
        this.numeroNoches = numeroNoches;
        this.precioNoche = precioNoche;
        this.estadoReservacion = estadoReservacion;
    }

    public int calcularTotal (){
        return numeroNoches * precioNoche;
    }

    public void cancelarReservacion(){
        if (this.estadoReservacion.equals("Activa")){
            this.estadoReservacion = "Cancelada";
        } else {
            System.out.println("La reservacion ya esta cancelada");
        }

    }

    public void mostrarInformacion(){
        System.out.println(
                "Nombre reservacion: " + this.nombreHuesped
                + "\nNumero de noches: " + this.numeroNoches
                + "\nPrecio por noche: " + this.precioNoche
                + "\nEstado de la reservacion: " + this.estadoReservacion
        );

        System.out.println("Total a pagar: " + this.calcularTotal());
    }
}
