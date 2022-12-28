/**
 * This is the PowerBot subclass
 * 
 * @author Benny Leung Ming Ting 3035777951
 * @Version 1.0.0
 */
public class PowerBot extends Robot{
	boolean boosted;
	/**
	 * This is the constructor for PowerBot, uses super() function to use Robot superclass's constructor
	 * @param name, power, lifeIndex 
	 */
	public PowerBot(String name, int power, int lifeIndex) {
		super(name, power, lifeIndex);
		this.boosted = false;
	}
	
	/**
	 * This method changes the boosted boolean variable to indicate the PowerBot is boosted
	 */
	public void boost() {
		this.boosted = true;
		System.out.println(this.name + " boosts itself!");
	}
	
	/**
	 * This method returns a different damage depends on boosted variable
	 * double damage (power *2) if boosted, normal damage (power *1) otherwise
	 * @return damage dealt
	 */
	public int attack() {
		if (this.boosted == true ) {
			System.out.println(this.name + " makes a heavy strike!");
			this.boosted = false;
			return (this.power * 2);
		}
		else {
			System.out.println(this.name + " strikes hard!");
			return (this.power);
		}
	}
	
}
