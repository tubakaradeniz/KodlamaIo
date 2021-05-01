
public class Student extends User {
	
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String dersProgramý,odevGoruntule,degerlendirme;

	

	public String getDersProgramý() {
		return dersProgramý;
	}

	public void setDersProgramý(String dersProgramý) {
		this.dersProgramý = dersProgramý;
	}

	public String getOdevGoruntule() {
		return odevGoruntule;
	}

	public void setOdevGoruntule(String odevGoruntule) {
		this.odevGoruntule = odevGoruntule;
	}

	public String getDegerlendirme() {
		return degerlendirme;
	}

	public void setDegerlendirme(String degerlendirme) {
		this.degerlendirme = degerlendirme;
	}
	

}
