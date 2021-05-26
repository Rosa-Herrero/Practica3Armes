package CapaDomini.Weapon;

public interface IWeapon {
	
	public int getDamage();
	
	public int getScope();
	
	public boolean isLoaded();
	
	public boolean shoot();
	
	public void load();
	
	public int getShield();

}
