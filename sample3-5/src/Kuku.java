/**
 * Kukuは、九九の問題をランダムに表示して
 * その正解すうと正解率を表示するプログラムである。
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kuku {
	public static final int MAX_QUESTION = 10;
	/**
	 * 九九の問題をMAX_の回数だけ繰り返す
	 * 最後に正答率を表示
	 */
	public static void main(String[] args) {
		int  goodAnswers = 0;
		System.out.println("これから九九の問題を" + MAX_QUESTION + "門出します");
		/*
		 * 以下
		 * 問題を繰り返し表示し、ユーザーからの解答を判断する
		 * その後、政党の数を数える
		 */
		for(int i = 0; i < MAX_QUESTION; i++) {
			boolean ok = showQuestion(i+1);
			if(ok) {
				goodAnswers++;
			}
		}
		double rate = goodAnswers * 100.0 / MAX_QUESTION;
		System.out.println("");
		System.out.println("問題は" + MAX_QUESTION + "問ありました。");
		System.out.println("正しく答えられたのは" + goodAnswers + "門で、");
		System.out.println("間違ってしまったのは" + (MAX_QUESTION - goodAnswers) + "門です。");
		System.out.println("正答率は" + rate + "％です。");
		System.out.println("");
		System.out.println("お疲れ様。");
	}
	/*
	 * showQestionは句句の問題を１問だし、答えを待つ
	 */
	public static boolean showQuestion(int question) {
		int x = (int)(Math.random() * 9) +1;
		int y = (int)(Math.random() * 9) +1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("[第" + question + "門]　" + x + " ✖︎" + y + "=?");
			String line = reader.readLine();
			int result = Integer.parseInt(line);
			if (x * y == result) {
				System.out.println("はい、正しいです。");
				return true;
			}else {
				System.out.println("残念、間違えです。");
				return  false;
			}
		}catch (IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("入力が正しくありません");
		}
		return false;
	}
}
