import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CapaDomini.*;
import CapaDomini.Weapon.EWeapon;

public class TestSurvivor2hands {
	
	private SurvivorTwoHands Brain;
	private Zombie mindless;

	@Before
	public void setUp() throws Exception {
		Brain = new SurvivorTwoHands(5);
		mindless = new Zombie(6,1,1);
	}

	@Test
	public void testArmes() {
		assertTrue ( Brain.getWeaponsSize() == 6 ) ; 
	}
	
	@Test
	public void testSurvivorAtacat1() {
		Brain.changeWeapon(1);
		mindless.somAtacats(Brain);
		assertTrue ( ! mindless.isAlive() ) ; 
	}
	
	@Test
	public void testSurvivorAtacat5() {
		Brain.changeWeapon(5);
		mindless.somAtacats(Brain);
		assertTrue ( ! mindless.isAlive() && Brain.getDamage() == 4) ; 
	}

}
