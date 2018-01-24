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
public class Fireman extends Human {

    public static Map<UUID, Fireman> Firemen = new HashMap<UUID, Fireman>();
    
    public Fireman(String name) {
        super(name);
    }
}
