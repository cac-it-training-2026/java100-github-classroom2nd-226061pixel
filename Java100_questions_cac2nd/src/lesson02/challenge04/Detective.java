/**
 * 第2章 名探偵のお仕事
 *
 * 問題4  車のガソリンは足りているか？
 *
 * コメントの位置に必要なソースコードを記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 * 探偵：
 * では早速出かけよう
 *
 * 助手：
 * ちょっと待ってください！ガソリンが...
 *
 * あ、やっぱり足りてました
 *
 */

package lesson02.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Detective {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		//ここに変数を記述する。

		System.out.println("探偵：");
		System.out.println("では早速出かけよう\n");
		System.out.println("助手：");
		System.out.println("ちょっと待ってください！ガソリンが...\n");

		//ここにif文を記述する。
		//変数gasolinが10以上であるときにガソリンが足りているものとします。
		if (num >= 10) {
			System.out.println("あ、やっぱり足りてました");
		}

	}
}
