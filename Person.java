package Records;

record Person(String name,int age) {
	Person{
		if(name==null||name.isEmpty()) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if(age<0) {
			throw new IllegalArgumentException("Invalid Age");
		}
	}
}


