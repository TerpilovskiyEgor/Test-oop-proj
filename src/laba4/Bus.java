/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba4;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.lang.Exception;

/**
 *
 * @author Egor
 */
public class Bus extends Vehicle {

    public static Map<UUID, Bus> Buses = new HashMap<UUID, Bus>();

    public Bus(String number) {
        super(number, 27);
    }

    public <T extends Human> void Boarding(T passenger) throws Exception {
        if (this.getPassengers().contains(passenger)) {
            throw new Exception();
        } else if (this.getPassengers().size() == this.getSeatsCount()) {
            throw new Exception();
        } else {
            this.getPassengers().add(passenger);
        }
    }
}
