class Person {
	
	//remains same for all persons
	static int eyes  = 2 ;
	static int ears  = 2 ;
	static int nose  = 1 ;
	static int hands = 2 ;
	static int legs  = 2 ;
	
	//differs for all persons
	String name;
	String middleName;
	String surname;
	String behaviour;
	String voice;
	String hairColor;
	String personality;
	String likes;
	String dislikes;
	String skinColor;
	String bodyType;
	String economicStatus;
	String educationStatus;
	String martialStatus;

	int height;
	int weight;

}

class Father extends Person {
		
		Person p = new Person();
			   p.name("Mr.Pramod");
			   p.middleName("Raj");
			   p.surname("Daodar");
			   p.behaviour("good");
			   p.voice("soft");
			   p.hairColor("black");
			   p.personality("decent");
			   p.likes("food");
			   p.dislikes("anger");
			   p.skinColor("brown");
			   p.bodyType("muscular");
			   p.economicStatus("rich");
			   p.educationStatus("Post-Graduated");
			   p.martialStatus("married");
			   p.heigth=6;
			   p.weight=65;
}

class Mother extends Person {

	Person p = new Person();
			   p.name("Mrs.Sheetal");
			   p.middleName("Raj");
			   p.surname("Daodar");
			   p.behaviour("best");
			   p.voice("soft");
			   p.hairColor("black");
			   p.personality("decent");
			   p.likes("people");
			   p.dislikes("anger");
			   p.skinColor("fair");
			   p.bodyType("slim");
			   p.economicStatus("rich");
			   p.educationStatus("Post-Graduated");
			   p.martialStatus("married");
			   p.heigth=5.5;
			   p.weight=70;
}
class child1 extends Person {

	Person p = new Person();
			   p.name("Golu");
			   p.middleName("Raj");
			   p.surname("Daodar");
			   p.behaviour("naughty");
			   p.voice("sweet");
			   p.hairColor("black");
			   p.personality("nice");
			   p.likes("toys");
			   p.dislikes("anger");
			   p.skinColor("fair");
			   p.bodyType("fat");
			   p.economicStatus("none");
			   p.educationStatus("student");
			   p.martialStatus("non-married");
			   p.heigth=3.5;
			   p.weight=30;
}