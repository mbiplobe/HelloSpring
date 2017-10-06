import org.springframework.beans.factory.InitializingBean;

public class HelloWorld {
	 private String message;
	 private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * 
	 */
	public void init() {
		System.out.println("Teu");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
	

}
