package CapaDomini;


public class Zombie extends Character{
	
	private int damage;
	private int scope;
	
	public Zombie(int pos_col, int damage, int scope)
	{
		super(1,pos_col);
		this.damage = damage;
		this.scope = scope;
	}
	
	@Override
	public int getDamage()
	{ return this.damage;}
	
	@Override
	public int getScope()
	{ return this.scope;}
	
	public void somAtacats( Survivor c)
	{
		int dist = Math.abs(this.getPosition() - c.getPosition() ); 
		if( dist <= c.getScope() && c.getCurrentWeapon().isLoaded())
		{
			this.updateLife(c.getDamage());
			c.getCurrentWeapon().shoot();
		}
	}
	
}
