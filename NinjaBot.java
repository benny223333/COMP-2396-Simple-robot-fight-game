/**
 * This is the NinjaBot subclass
 * 
 * @author Benny Leung Ming Ting 3035777951
 * @version 1.0.0
 */
public class NinjaBot extends Robot {
	boolean hidden;
	
	/**
	 * This is the NinjaBot constructor, uses superclass robot's constructor with super() function
	 * @param name
	 * @param power
	 * @param lifeIndex
	 */
	public NinjaBot (String name, int power, int lifeIndex) {
		super(name, power, lifeIndex);
		this.hidden = false;
	}
	
	/**
	 * This method changes the boolean variable hidden to true to show if the ninja bot is hidden
	 */
	public void hide() {
		this.hidden = true;
		System.out.println(this.name + " hides itself from attacks!");
	}
	
	/**
	 * This method determines if the ninja bot is hit base on the hidden variable
	 * life index does not reduce if the hidden variable is true
	 * life index reduce otherwise 
	 */
	public void damage(int amount) {
		if (this.hidden == true) {
			this.hidden = false;
			System.out.println(this.name + " hides from the attack!");
		}
		else {
			this.lifeIndex -= amount; 
			System.out.println(this.name + " takes a damage of " + amount + "!");
		}
	}
}
