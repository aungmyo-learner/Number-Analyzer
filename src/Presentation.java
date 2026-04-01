import java.util.Scanner;

public class Presentation {
	private final Scanner sc;
	public Presentation(Scanner sc) {
		super();
		this.sc = sc;
	}
	public int input() {
		System.out.println("Enter Number between -1,000,000 and 1,000,000");
		return Integer.parseInt(sc.nextLine());
	}
	public void toShow(Result result) {
		if(!result.isValid()) {
			System.out.println(result.getMessage());
		}else {
			if(result.isEven()) {
				System.out.println("Even Number..");
			}else {
				System.out.println("Odd Number..");
			}
			switch (result.getKind()) {
			case Prime:
				System.out.println("Prime Number..");
				break;
			case Composite:
				System.out.println("Composite Number..");
				break;
			case Neither:
				break;
			}
			switch(result.getSign()) {
			case Positive:
				System.out.println("Positive Number");
				break;
			case Negative:
				System.out.println("Negative Number..");
				break;
			case Zero:
				System.out.println("Zero is neither positive nor negative..");
			}
		}
	}
	public int readValidCommand() {
        while (true) {
            System.out.println("1. Continue or 0. Stop");
            int cmd = sc.nextInt();
            if (cmd == 1 || cmd == 0) {
                return cmd;
            }
        }
    }
}
