import java.util.Scanner;

public class Controller {
	private final Service service;
	private final Presentation display;
	public Controller(Service service, Presentation display) {
		super();
		this.service = service;
		this.display = display;
	}
	public void control() {
		Scanner sc = new Scanner(System.in);
		int number;
		int cmd;
		while(true) {
			number = display.input();
			Result result = service.analyzeNumber(number);
			display.toShow(result);
			cmd = display.readValidCommand();
            if (cmd == 0) {
                System.out.println("Stopped...");
                break;
            }
		}
		sc.close();
	}
}
