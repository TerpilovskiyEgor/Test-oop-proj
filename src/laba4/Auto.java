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
public abstract class Auto extends Vehicle {

    public static Map<UUID, Auto> Autos = new HashMap<UUID, Auto>();

    public Auto(String number) {
        super(number, 4);
    }
}
