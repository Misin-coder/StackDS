package stackDS;

public class Tester {

	public static void main(String[] args) {
	
		Stack<Integer> s = new Stack<>();
		s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
	}

}
