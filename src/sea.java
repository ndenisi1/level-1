import javax.swing.JOptionPane;

/*
	 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
	 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
	 */
public class sea {
public static  void main(String[] args) {
	Spongebobb Spongebob= new Spongebobb("Spongebob");
	Spongebob.eat();
	
	
	Spongebobb Patrick= new Spongebobb("Patrick");
	Patrick.eat();
	
	
	Spongebobb Squidward= new Spongebobb("Squidward");
	Squidward.eat();
	
	
	String question= JOptionPane.showInputDialog(" what is yur fav spongebob squidward of patrick?");
	if(question.equals("spongebob")){
		Spongebob.laugh();
	}
	else if(question.equals("patrick")){
		Patrick.laugh();
	}
	else if(question.equals("squidward")){
		Squidward.laugh();
	}
}
}
