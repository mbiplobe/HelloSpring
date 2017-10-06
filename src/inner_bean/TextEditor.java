package inner_bean;

public class TextEditor {
 
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
		
		System.out.println("Create spellchecking Object");
	}
	
	public void spellCheck(){
		spellChecker.spellChecking();
	}
	

}
