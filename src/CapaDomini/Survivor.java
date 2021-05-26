package CapaDomini;

import java.util.ArrayList;
import java.util.List;

import CapaDomini.Weapon.*;

public class Survivor extends Character {

	private static final int MAXLIFE = 5;
	protected List<IWeapon> weapons = new ArrayList<>();
	public int indexCurrentWeapon;
	
	public Survivor(int pos_col)
	{
		super(MAXLIFE, pos_col);
		// PENDENT IMPLEMENTAR
		// utilitzar l'enumeració EWeapon per omplir el llistat d'armes disponibles
		// amb la factoria singleton
	}
	
	@Override
	public int getDamage()
	{ return weapons.get(indexCurrentWeapon).getDamage();}
	
	@Override
	public int getScope()
	{ return weapons.get(indexCurrentWeapon).getScope();}
	
	public void changeWeapon(EWeapon w)
	{
		if( indexCurrentWeapon != w.ordinal() )
			indexCurrentWeapon = w.ordinal();
	}
	public void changeWeapon(int index)
	{
		if( indexCurrentWeapon != index )
			indexCurrentWeapon = index;
	}
	
	public IWeapon getCurrentWeapon()
	{ return weapons.get(indexCurrentWeapon); }
	
	public int getWeaponsSize()
	{ return weapons.size(); }
	
	public void somAtacats( Zombie c)
	{
		int dist = Math.abs(this.getPosition() - c.getPosition() ); 
		if( dist <= c.getScope() )
		{
			this.updateLife(c.getDamage() - this.weapons.get(indexCurrentWeapon).getShield() );
		}
	}
}
