/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		//在庫表示
		System.out.println("シトロン    \\250・・・残り" + a + "個");
		System.out.println("ショコラ    \\280・・・残り" + b + "個");
		System.out.println("ピスタージュ\\320・・・残り" + c + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン    >");
		String str1 = reader.readLine();
		System.out.println("ショコラ　　>");
		String str2 = reader.readLine();
		System.out.println("ピスタージュ>");
		String str3 = reader.readLine();

		///doubleで読み込み
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);
		//個数と金額計算
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
		//在庫
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
		//％表示
		double par1 = ((num1 * 250) / sum2) * 100;
		double par2 = ((num2 * 280) / sum2) * 100;
		double par3 = ((num3 * 320) / sum2) * 100;

		System.out.println("シトロン    " + "\\" + (int) num1 * 250 + "・・・\t" + (int) par1 + "%");
		System.out.println("ショコラ    " + "\\" + (int) num2 * 280 + "・・・\t" + (int) par2 + "%");
		System.out.println("ピスタージュ" + "\\" + (int) num3 * 320 + "・・・\t" + (int) par3 + "%\n");
		//平均値
		double money1 = ((int) sum2 / (int) sum1) / 10;
		//切り捨て
		double money2 = (int) money1 * 10;

		System.out.println("明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味    ・・・ " + (int) par1 + "%");
		System.out.println("ショコラの味    ・・・ " + (int) par2 + "%");
		System.out.println("ピスタージュの味    ・・・ " + (int) par3 + "%\n");
		System.out.println("が楽しめます！\n");

		System.out.println("値段は\\" + (int) money2 + "です。");

	}

}
