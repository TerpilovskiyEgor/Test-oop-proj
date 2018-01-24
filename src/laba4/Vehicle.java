/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Egor
 */
public abstract class Vehicle<T> {

    private UUID ID;
    private String Number;
    private int SeatsCount;
    private ArrayList<Human> Passengers;

    public Vehicle(String number, int seatscount) {
        ID = UUID.randomUUID();
        Number = number;
        SeatsCount = seatscount;
        Passengers = new ArrayList<>(SeatsCount);
    }

    protected ArrayList<Human> getPassengers() {
        return Passengers;
    }

    public int getSeatsCount() {
        return SeatsCount;
    }

    public int getOccupiedSeatsCount() {
        return SeatsCount - Passengers.size();
    }

//    public <T extends Human> void Boarding(T passenger) {
//        if (!Seats.contains(passenger) && Seats.size() < SeatsCount) {
//            Seats.add(passenger);
//        }
//    }
    public void Landing(Human passenger) {
        if (Passengers.contains(passenger)) {
            Passengers.remove(passenger);
        }
    }
}
