package service;

import model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    ArrayList<Reserva> reserva = new ArrayList<>();

    public SistemaReservas() {
    }

    public SistemaReservas(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }

    public void agregarReserva (Reserva r){
        this.reserva.add(r);
    }

    public void eliminarReserva(int id){
        for ( int i = 0; i < this.reserva.size(); i++){
            if (this.reserva.get(i).getIdReserva() == id){
                this.reserva.remove(i);
                String div = "=";
                System.out.printf("""
                        %s
                        
                                    \tLa reserva %d ha sido eliminada
                        
                        %s
                        
                        """,div.repeat(50),id,div.repeat(50));
                return;
            }
        }
        throw new IllegalArgumentException("La reserva no se encuentra en el sistema");
    }

    public void listarReservas(){
        for ( Reserva r: this.reserva){
            r.mostrarInfo();
        }
    }

    public void contarReservas(){
        System.out.println("Total de reservas son " + this.reserva.size());
        String div = "=";
        System.out.printf("""
                        %s
                        
                                    \tTines un total de %d reservas
                        
                        %s
                        
                        """,div.repeat(50),this.reserva.size(),div.repeat(50));
        return;
    }

}
