package CapaDomini;

public abstract class Character {

	private int life;
	private int pos_col;
	
	public Character(int life, int pos_col)
	{
		this.life = life;
		this.pos_col = pos_col;
	}
	
	public int getPosition()
	{ return this.pos_col;}
	
	public abstract int getDamage();
	public abstract int getScope();
	
	public void move(int direction)
	{ this.pos_col += direction;}
	
	public void updateLife( int damage)
	{ this.life -= damage;}
	
	public boolean isAlive()
	{ return (this.life > 0 );}

	public int getLife()
	{ return this.life; }
}
