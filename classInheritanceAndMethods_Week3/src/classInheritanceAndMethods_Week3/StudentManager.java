package classInheritanceAndMethods_Week3;

public class StudentManager extends BaseUserManager {
	
	public void completeHomework(String homeworks) {
		System.out.println(homeworks+" ödevi tamamlandý");
	}
	
	public void addCourse(String addCourse) {
		System.out.println(addCourse+" kursu eklendi");
	}

}
