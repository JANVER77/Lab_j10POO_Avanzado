package app;

import model.Reserva;
import service.SistemaReservas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reserva reserva1 = new Reserva();
        Reserva reserva2 = new Reserva(456, "Mario Mendoza", "mayo-5", 3);

        try{
            reserva1.setIdReserva(528);
            reserva1.setCliente("Angel Vargas");
            reserva1.setFecha("10-Enero");
            reserva1.setDuracionHoras(2);
        } catch (IllegalArgumentException e){
            System.out.println("Error al ejecutar :" + e.getMessage());
        }

        ArrayList<Reserva>  listaReservas = new ArrayList<>(List.of(reserva1, reserva2));

        SistemaReservas sistemaReservas = new SistemaReservas(listaReservas);

        Reserva  reserva3 = new Reserva(852, "Santiago Garzon","9-Enero", 4);

        sistemaReservas.agregarReserva(reserva3);

        sistemaReservas.listarReservas();

        Reserva reserva4 = new Reserva(123, "Dionisio Gardeazabal","18-abril", 6);

        sistemaReservas.agregarReserva(reserva4);

        sistemaReservas.contarReservas();

        try{
            sistemaReservas.eliminarReserva(453);


        } catch (IllegalArgumentException e){
            System.out.println("Error : " + e.getMessage());
        }

        sistemaReservas.eliminarReserva(456);

        sistemaReservas.listarReservas();

    }
}
