package week1.day1;

public class Firefox {
	
	public void Launchbrowser() {
		System.out.println("Firefox browser opened successfully");
	
	}
	
	public void Maximize() {
		System.out.println("Browser Maximixed successfully");
		}

	
	public static void main(String[] args) {
		
		Firefox obj = new Firefox ();
		obj.Launchbrowser();
		obj.Maximize();
		
	}

	
}
