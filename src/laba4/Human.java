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
public class Human {

    public static Map<UUID, Human> Humans = new HashMap<UUID, Human>();
    
    private UUID ID;
    private String Name;

    public UUID getId() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public Human(String name) {
        ID = UUID.randomUUID();
        Name = name;
    }
}
