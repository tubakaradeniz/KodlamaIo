
public class Main {

	public static void main(String[] args) {
		
		UserManager user =new UserManager();
		user.kullaniciGirisi(new Student("Tuba"));
		
		StudentManager studentManager= new StudentManager();
		studentManager.kursProgrami();
		studentManager.derseGir();
		studentManager.odev();
		studentManager.sonrakiDerseGec();
		studentManager.profiliDuzenle();
		
		user.exit();
		
		user.kullaniciGirisi(new Instructor("Engin Demiroğ"));
	
	}

}
