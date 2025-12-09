package model;

public class Reserva {
    int idReserva;
    String cliente;
    String fecha;
    int duracionHoras;

    public Reserva() {
    }

    public Reserva(int idReserva, String cliente, String fecha, int duracionHoras) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        if (idReserva < 0){
            throw new IllegalArgumentException("La reserva no pude ser un numero negativo");
        }
        this.idReserva = idReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        if(duracionHoras > 0){
            throw new IllegalArgumentException("El tiempo debe ser positivo");
        }
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInfo(){
        System.out.printf("""
                %s Informacion Reserva %s
                
                \tNumero de la Reserva : \t%d
                \tCliente quien reserva : \t%s
                \tFecha de la reserva: \t%s
                \tDuracion de la reserva: \t%d                             
                
                %s
                ""","*".repeat(15), "*".repeat(15), this.idReserva, this.cliente,this.fecha, this.duracionHoras, "=".repeat(50));
    }
}
