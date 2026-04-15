/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！\n");

		System.out.println("本日のおすすめの商品です。\n");
		int a = 30;
		int b = 30;
		int c = 30;

		System.out.println("シトロン    \\250・・・残り" + a + "個");
		System.out.println("ショコラ    \\280・・・残り" + b + "個");
		System.out.println("ピスタージュ\\320・・・残り" + c + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		System.out.println("シトロン    >");
		System.out.println("ショコラ　　>");
		System.out.println("ピスタージュ>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);

		double sum1 = num1 + num2 + num3;
		double sum2 = (num1 * 250) + (num2 * 280) + (num3 * 320);

		System.out.println("シトロン    " + num1 + "個");
		System.out.println("ショコラ    " + num2 + "個");
		System.out.println("ピスタージュ" + num3 + "個\n");

		System.out.println("合計個数　　" + sum1 + "個");
		System.out.println("合計金額　" + (int) sum2 + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("本日のおすすめ商品です。\n");

		double stock1 = 30 - num1;
		double stock2 = 30 - num2;
		double stock3 = 30 - num3;

		System.out.println("シトロン      \\250 ・・・ 残り" + (int) stock1 + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + (int) stock2 + "個");
		System.out.println("ピスタージュ  \\320 ・・・ 残り" + (int) stock3 + "個");

	}

}
