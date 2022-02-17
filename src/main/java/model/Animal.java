package model;

public class Animal {
	private boolean isMammal;
	private String diet;
	private boolean isMale;
	
	public Animal(boolean isMammal,String diet,boolean isMale) {
		this.isMammal=isMammal;
		this.diet=diet;
		this.isMale=isMale;
	}
	private Animal() {
		this(false," ",false);
	}
	
	public boolean isMammal() {
		return isMammal;
	}
	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	@Override
	public String toString() {
		return "Animal [isMammal=" + isMammal + ", diet=" + diet + ", isMale=" + isMale + "]";
	}
	
	//Método abstracto
	public abstract String getPlanningFood() {
		return "";
	}
}
