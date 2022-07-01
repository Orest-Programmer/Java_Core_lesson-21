package ua.lviv.lgs;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
public class AnnotationApp {

	
	public static void main(String[] args) throws IOException {
		List<String> annotationValuesList = getAnnotationValues(Person.class);
		for (String string : annotationValuesList) {
			System.out.println(string);
		}
		
		writeListItems(annotationValuesList, new File("Person.txt"));
		writeObject(annotationValuesList, new File("Person.obj"));
		
	}
	
	public static void writeObject(Object object, File file) throws IOException{
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
		os.close();
	}
	
	public static void writeListItems(List<String> list, File file) throws IOException{
		Files.write(file.toPath(), list);
	}
	
	public static List<String> getAnnotationValues(Class<?> customClass){
		List<String> annotationValues = new ArrayList<>();
		
		Field[] classFields = customClass.getDeclaredFields();
		
		for (Field field : classFields) {
			if(field.getAnnotation(MyAnnotation.class) != null) {
				annotationValues.add(field.getType().getSimpleName() + " " + field.getName() + "--->" + field.getAnnotation(MyAnnotation.class));
			}
		}
		
		return annotationValues;
	}
	
	
}
