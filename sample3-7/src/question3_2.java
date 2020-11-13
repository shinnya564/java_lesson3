
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question3_2 {
	public static final int MAX_QUESTION = 2;
	public static void main(String[] args) {
		double  ages = 0;
		double  age = 0;
		for(int i = 0; i < MAX_QUESTION; i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("あなたの名前を入力してください");
				String line = reader.readLine();
				System.out.println("年齢を入力してください");
				line = reader.readLine();
				int result = Integer.parseInt(line);
				age = result;
			}catch (IOException e) {
				System.out.println(e);
			}catch(NumberFormatException e) {
				System.out.println("入力が正しくありません");
			}
			ages = ages + age;
		}
		double rate = ages  / MAX_QUESTION;
		System.out.println("");
		System.out.println("平均年齢は" + rate + "歳です。");
		System.out.println("");
		System.out.println("お疲れ様。");
	}
}
