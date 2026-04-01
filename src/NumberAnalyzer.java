import java.util.Scanner;

public class NumberAnalyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		Presentation display = new Presentation(sc);
		Controller controller = new Controller(service, display);
		controller.control();
	}
}
