package pruebas;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class SeleccionarSubject {

	public static void main(String[] args) {

		SubjectDao dao = new SubjectDaoImpl();

		Subject selectedSubject = dao.find(6);

		System.out.println(selectedSubject.getIdsubject());
		System.out.println(selectedSubject.getSubject());
		System.out.println(selectedSubject.getCredits());

	}

}
