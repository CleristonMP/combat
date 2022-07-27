package entities;

public class Champion {

	private String name;
	private int life;
	private int damage;
	private int armor;

	public Champion() {
	}

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.damage = damage;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public int getDamage() {
		return damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		if (other.damage <= armor) {
			life--;
		} else {
			life -= other.damage - getArmor();
		}
		
		if (getLife() < 0) life = 0;
	}

	public String status() {
		if (life == 0) {
			return name + ": " + life + " de vida (morreu)";
		}
		return name + ": " + life + " de vida";
	}
}
