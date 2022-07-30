package POO;

public class Wilder {
	// attribut de classe
	private String firstName;
	private boolean aware;

	// constructor
	public Wilder(String firstName, boolean aware) {
		this.firstName = firstName;
		this.aware = aware;
	}

	// getters
	public String getFirstName() {
		return this.firstName;
	}

	public boolean isAware() {
		return this.aware;
	}

	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	public String whoAmI() {
		if (isAware) {
			return "Je m'appelle " + this.getFirstName() + " et je suis aware";
		} else {
			return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
		}
	}
}
