/**
 * This is the main robot superclass
 * 
 * @author Benny Leung Ming Ting 3035777951
 * @version 1.0.0
 */
public class Robot {
	String name;
	int power;
	int lifeIndex;
	
	/**
	 * This this the constructor for all robots, sets up the name, power and life index of the robot
	 * @param name
	 * @param power
	 * @param lifeIndex
	 */
	public Robot(String name, int power, int lifeIndex) {
		this.name = name;
		this.power = power;
		this.lifeIndex = lifeIndex;
	}
	
	/**
	 * This method returns the name of the robot
	 * @return name of robot
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * This method will lower the life of the robot if taken damage 
	 * @param amount
	 */
	public void damage(int amount) {
		this.lifeIndex -= amount;
		System.out.println(this.name + " takes a damage of " + amount + "!");	
	}
	
	/**
	 * This method will show NinjaBot's attack and pass the damage taken to damage method
	 * @return damage taken (equal to the power of robot)
	 */
	public int attack () {
		
		System.out.println(this.name + " launches an attack!");
		return this.power;
	}
	
	/**
	 * This method checks if the life index of the robot is <= 0 or not
	 * @return true if life index <= 0, false otherwise
	 */
	public boolean isBroken() {
		if (this.lifeIndex <= 0) {
			return true;
		} 
		else {
			return false;
			}
		}
	}
