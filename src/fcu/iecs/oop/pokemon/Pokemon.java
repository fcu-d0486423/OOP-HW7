package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	private final PokemonType type;
	private final String name;
	private int cp;
	
	public int getCp()
	{
		return cp;
	}
	public void setCp(int cp) 
	{
		this.cp = cp;
	}
	public PokemonType getType()
	{
		return type;
	}
	public String getName()
	{
		return name;
	}
	public Pokemon (String name,PokemonType type,int cp)
	{
		this.type=type;
		this.name=name;
		this.cp=cp;
	}
	public abstract void attack();
}
