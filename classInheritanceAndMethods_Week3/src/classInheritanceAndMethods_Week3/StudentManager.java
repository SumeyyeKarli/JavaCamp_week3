package classInheritanceAndMethods_Week3;

public class StudentManager extends BaseUserManager {
	
	public void completeHomework(String homeworks) {
		System.out.println(homeworks+" �devi tamamland�");
	}
	
	public void addCourse(String addCourse) {
		System.out.println(addCourse+" kursu eklendi");
	}

}
