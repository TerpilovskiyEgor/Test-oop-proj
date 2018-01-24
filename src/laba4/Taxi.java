/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba4;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Egor
 */
public class Taxi extends Auto {

    public static Map<UUID, Taxi> Taxis = new HashMap<UUID, Taxi>();

    public Taxi(String number) {
        super(number);
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
