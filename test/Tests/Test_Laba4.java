/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import laba4.Bus;
import laba4.FireEngine;
import laba4.Fireman;
import laba4.Human;
import laba4.PoliceCar;
import laba4.Policeman;
import laba4.Taxi;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Egor
 */
public class Test_Laba4 {

    public Test_Laba4() {
    }

    Human human = new Human("Jhon");
    Policeman policeman = new Policeman("Jason");
    Fireman fireman = new Fireman("Drake");

    Bus bus = new Bus("AA1111AA");
    Taxi taxi = new Taxi("BB2222BB");
    PoliceCar policecar = new PoliceCar("CC3333CC");
    FireEngine fireengine = new FireEngine("EE4444EE");

    @Test
    public void Test_AllowedBoarding() throws Exception {
        bus.Boarding(human);
        bus.Boarding(policeman);
        bus.Boarding(fireman);
        taxi.Boarding(human);
        taxi.Boarding(policeman);
        taxi.Boarding(fireman);
        policecar.Boarding(policeman);
        fireengine.Boarding(fireman);
        assertEquals(bus.getOccupiedSeatsCount(), 24);
        assertEquals(taxi.getOccupiedSeatsCount(), 1);
        assertEquals(policecar.getOccupiedSeatsCount(), 3);
        assertEquals(fireengine.getOccupiedSeatsCount(), 3);
    }

    @Test(expected = java.lang.Exception.class)
    public void Test_DeniedBoarding() {
        policecar.Boarding(fireman);
        policecar.Boarding(human);
        fireengine.Boarding(human);
        fireengine.Boarding(policeman);
    }

    @Test
    public void Test_Landing() {
        bus.Landing(fireman);
        policecar.Landing(policeman);
        taxi.Landing(human);
        fireengine.Landing(fireman);
    }
}
