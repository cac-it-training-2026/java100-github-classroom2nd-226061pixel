/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		System.out.println("ピスタージュ  \\320 ・・・ 残り" + (int) stock3 + "個\n");

		System.out.println("閉店時間となりました。\n"
				+ "またのお越しをお待ちしております。\n");

		System.out.println("売り上げの割合");
		System.out.println("売上合計\t\\" + (int) sum2 + "\n");

		double par1 = ((num1 * 250) / sum2) * 100;
		double par2 = ((num2 * 280) / sum2) * 100;
		double par3 = ((num3 * 320) / sum2) * 100;

		System.out.println("シトロン    " + "\\" + (int) num1 * 250 + "・・・\t" + (int) par1 + "%");

		System.out.println("ショコラ    " + "\\" + (int) num2 * 280 + "・・・\t" + (int) par2 + "%");

		System.out.println("ピスタージュ" + "\\" + (int) num3 * 320 + "・・・\t" + (int) par3 + "%");

	}

}
