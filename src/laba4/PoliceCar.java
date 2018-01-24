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
public class PoliceCar extends Auto {

    public static Map<UUID, PoliceCar> PoliceCars = new HashMap<UUID, PoliceCar>();

    public PoliceCar(String number) {
        super(number);
    }

    public <T extends Policeman> void Boarding(T passenger) throws Exception {
        if (this.getPassengers().contains(passenger)) {
            throw new Exception();
        } else if (this.getPassengers().size() == this.getSeatsCount()) {
            throw new Exception();
        } else {
            this.getPassengers().add(passenger);
        }
    }
}
