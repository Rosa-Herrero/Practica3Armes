import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CapaDomini.*;
import CapaDomini.Weapon.EWeapon;

public class TestSurvivor {
	
	private Survivor Brain;
	private Zombie mindless;

	@Before
	public void setUp() throws Exception {
		Brain = new Survivor(5);
		mindless = new Zombie(6,1,1);
	}

	@Test
	public void testArmes() {
		assertTrue ( Brain.getWeaponsSize() == EWeapon.values().length ) ; 
	}
	
	@Test
	public void testZombieAtaca() {
		Brain.somAtacats(mindless);
		assertEquals ( 4, Brain.getLife()) ; 
	}
	
	@Test
	public void testSurvivorAtacat0() {
		mindless.somAtacats(Brain);
		assertTrue ( ! mindless.isAlive() ) ; 
	}
	
	@Test
	public void testSurvivorAtacat1() {
		Brain.changeWeapon(1);
		mindless.somAtacats(Brain);
		assertTrue ( ! mindless.isAlive() ) ; 
	}
	
	@Test
	public void testSurvivorAtacat2() {
		Brain.changeWeapon(2);
		mindless.somAtacats(Brain);
		assertTrue ( ! mindless.isAlive() ) ; 
	}

}
