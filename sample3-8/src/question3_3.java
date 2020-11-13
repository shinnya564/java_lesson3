
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question3_3 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("文字列を入力してください");
			String line = reader.readLine();
			int result = line.length();
			for(int i = 0; i < result; i++) {
				char a = line.charAt(i);
				int code = a;
				System.out.println("'" + a + "'の文字コードは" + code + "です。");
			}
			}catch (IOException e) {
				System.out.println(e);
			}catch(NumberFormatException e) {
				System.out.println("入力が正しくありません");
			}
		System.out.println("お疲れ様。");
	}
}
